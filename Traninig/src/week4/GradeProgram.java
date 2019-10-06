package week4;

import java.util.Scanner;

public class GradeProgram {

	public static void main(String[] args) {
	
		System.out.println("Enter your score: ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		char grade = 0;
		
		if(score<60){
			grade = 'F';
		}
		else if(score<70){
			grade='D';
		}
		else if(score<80){
			grade='C';
		}
		else if(score<90){
			grade='B';
		}
		else if(score<100){
			grade='A';
		}
		
		System.out.println("Your grade is "+ grade);
		input.close();
	}

}
