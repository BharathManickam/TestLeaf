package week4;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		
		System.out.println("Enter your name:");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		greetUser(name);
	}
	
	public static void greetUser(String name){
		System.out.println("Welcome "+name);
	}

}
