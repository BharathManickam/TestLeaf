package week2;

import java.util.Scanner;

public class BonusProgram {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		BonusProgram bp = new BonusProgram();
		System.out.println("What is your experience?");
		int years = input.nextInt();
		if(years>=5){
			bp.bonusCalcuation();
		}
		else{
			System.out.println("Sorry! You are not eligible for the bonus");
		}
		input.close();
	}
	
	public void bonusCalcuation(){
		System.out.println("Enter your salary:");
		int salary = input.nextInt();
		float netbonusamount = salary*0.05f;
		System.out.println("Your net bonus amount = "+netbonusamount);
	}
}
