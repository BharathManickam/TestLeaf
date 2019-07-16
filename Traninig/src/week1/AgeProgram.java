package week1;

import java.util.Scanner;

public class AgeProgram {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any day in the week: ");
		String s = input.nextLine();
		System.out.println("Enter the time you wake up daily: ");
		int t = input.nextInt();
		System.out.println("On every "+s+" will wake up at " +t+ " in the morning to go the market");
		input.close();
	}

}
