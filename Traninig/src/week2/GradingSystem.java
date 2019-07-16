package week2;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks = input.nextInt();
		if(marks>80){
			System.out.println("A");
		}
		else if(marks>61){
			System.out.println("B");
			
		}
		else if(marks>51){
			System.out.println("C");
			
		}
		else if(marks>45){
			System.out.println("D");
			
		}
		else if(marks>25){
			System.out.println("E");
			
		}
		else{
			System.out.println("F");
			
		}
		input.close();

	}

}
