package week1;

import java.util.Scanner;

public class WorkingDaysProgram {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Total number of working days in the month: ");
		int workingdays = input.nextInt();
		System.out.println("Number of leaves taken: ");
		int leavetaken = input.nextInt();
		System.out.println("Total no of days worked:" +(workingdays-leavetaken));
		input.close();
	}

}
