package week4;

import java.util.Scanner;

public class LoanProgram {

	public static void main(String[] args) {
		
		//what they gave
		
		int requiredSalary = 30000;
		int requiredYears = 2;
		
		//what need to get
		System.out.println("Enter your salary:");
		Scanner input = new Scanner(System.in);
		double salary = input.nextDouble();
		System.out.println("Enter the number of years of experience with"
				+ " the current employer:");
		int years = input.nextInt();
		input.close();
		
		if(salary >=requiredSalary){
			if(years>=requiredYears){
				System.out.println("Congrats you are eligible for the loan");
			}
			else{
				System.out.println("Sorry! you must acquire some number of years of experience");
			}
			}
		else{
			System.out.println("Sorry! your salary is not enough");
		}

	}

}
