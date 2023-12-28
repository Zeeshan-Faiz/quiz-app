package quiz_app_pck;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizLogic {
	
	Scanner sc = new Scanner(System.in);
	private int correctAnswer=0;
	
	public void logic(){
		 
			Questions q1 = new Questions("Which statement is true about Java?",
					"A. Java is a sequence-dependent programming language ",
					"B. Java is a code dependent programming language ",
					"C. Java is a platform-dependent programming language ",
					"D. Java is a platform-independent programming language ");
			Questions q2 = new Questions("What is the extension of java code files?", "A. .txt", "B. .pdf", "C. .sql",
					"D. .java");
			Questions q3 = new Questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling",
					"C. Dennis Ritchie", "D. Bjarne Stroustrup");
			Questions q4 = new Questions("Which one of the following is not a Java feature?", "A. Object-oriented",
					"B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
			Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?",
					"A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");

			Map<Questions, Character> hmap = new HashMap<>();
			hmap.put(q1, 'D');
			hmap.put(q2, 'D');
			hmap.put(q3, 'B');
			hmap.put(q4, 'B');
			hmap.put(q5, 'C');
			
			
			//Printing Questions and their Options
			for(Map.Entry<Questions,Character> map: hmap.entrySet()) {
				
				System.out.println(map.getKey().getQuestions());
				System.out.println(map.getKey().getOption1());
				System.out.println(map.getKey().getOption2());
				System.out.println(map.getKey().getOption3());
				System.out.println(map.getKey().getOption4());
				
				System.out.print("Enter your Answer:");
				Character answer = sc.next().charAt(0);
				
				int check = Character.compare(answer,map.getValue());
				
				if(check ==0) {
					System.out.println("Your Answer is Correct !!");
					correctAnswer++;
				}
				else
					System.out.println("Wrong Answer!!!");

			}
			System.out.println();
			System.out.println("**********Result**********");
			System.out.println("Total Questions Attempted: "+hmap.size());
			System.out.println("You scored " + correctAnswer+"/5");
			System.out.println("Percentage: "+ (correctAnswer*100)/hmap.size()+"%");
			
			double calcPercentage = (correctAnswer*100)/hmap.size();
			if(calcPercentage<35)
				System.out.println("Poor Performance!!!");
			else if(calcPercentage>35 &&calcPercentage<69)
				System.out.println("Can do Better!!!");
			else if(calcPercentage>69 && calcPercentage<89)
				System.out.println("Keep it Up!!!");
			else if(calcPercentage>89)
				System.out.println("Outstanding!!! You are a Genius!!!");
			
			
	 }
}
