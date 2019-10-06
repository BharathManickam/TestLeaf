package week4;

import java.util.Scanner;

public class CoinCurrency {

	public static void main(String[] args) {
		
		//user input
		System.out.println("Enter how many 20's you have:");
		Scanner input = new Scanner(System.in);	
		int twentys = input.nextInt();
		
		System.out.println("Enter how many 10's you have:");
		int tens = input.nextInt();
		
		System.out.println("Enter how many 5's you have:");	
		int fives = input.nextInt();
		
		System.out.println("Enter how many 1's you have:");	
		int ones = input.nextInt();
		
		int sum = twentys*20 + tens*10 + fives*5 + ones*1;
		
		if(sum==100){
			System.out.println("Congrats! you have got 100 rupees");
		}
		else if(sum<100){
			int value = 100 - sum;
			System.out.println("You are this many less "+value+" rupees");
		}
		else if(sum>100){
			int value = sum - 100;
			System.out.println("You are this many high " + value + " rupees");
		}
		
	}

}
