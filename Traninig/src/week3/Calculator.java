package week3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the operator(Example: +,-,*,/) :");
		char operator = input.next().charAt(0);
		System.out.print("Enter the value of integer1: ");
		int num1= input.nextInt();
		System.out.print("Enter the value of integer2: ");
		int num2= input.nextInt();
		switch(operator){
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		}
		input.close();
	}	
}
	

