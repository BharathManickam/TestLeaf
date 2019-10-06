package week4;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		boolean again;
		
		do{
			System.out.println("Enter the first Number: ");
			Scanner input = new Scanner(System.in);
			int num1 = input.nextInt();
			System.out.println("Enter the Second Number: ");
			int num2 = input.nextInt();
			System.out.println(num1+num2);
			System.out.println("Would you like to do it again. Enter True or False");
			again = input.nextBoolean();
		}
		while(again);

	}

}
