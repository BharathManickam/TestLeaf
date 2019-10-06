package week4;

import java.util.Scanner;

public class LetterContains {

	public static void main(String[] args) {
		
		System.out.println("Enter some text");
		Scanner input = new Scanner(System.in);
		String text = input.next();
		boolean letterFound = false;
		for(int i =0; i<text.length();i++){
			char currentLetter = text.charAt(i);
			System.out.println(text.charAt(i));
			if(currentLetter == 'A' || currentLetter == 'a'){
				System.out.println("Hey a found");
				letterFound = true;
				break;
			}
			
		}
		if(letterFound){
			System.out.println("Text contains A");
		}
		else{
			System.out.println("Text does not contain A");
		}

	}

}
