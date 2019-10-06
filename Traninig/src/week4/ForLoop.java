package week4;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number of items to be scanned");
		Scanner input = new Scanner(System.in);
		int items = input.nextInt();
		int total =0;
		for(int i=0;i<items;i++){
			System.out.println("Enter the price");
			int price = input.nextInt();
			total = total + price;
		}
		
		System.out.println("Total Amount = "+total);

	}

}
