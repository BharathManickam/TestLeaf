package week4;

import java.util.Scanner;

public class CalculatingHours {

	public static void main(String[] args) {
		
		//Data I have
		
		double maxHours = 40;
		double salary = 8;
		
		//condition
		System.out.println("Please Enter the Number of Hours you worked: ");
		Scanner input = new Scanner(System.in);
		double workedHours = input.nextDouble();
		
		while(workedHours > maxHours || workedHours < 1){
			System.out.println("Please enter a value between 1 to 40");
			workedHours = input.nextDouble();
		}
		
		double grossPay = workedHours * salary;
		System.out.println(grossPay);
		
	}

}
