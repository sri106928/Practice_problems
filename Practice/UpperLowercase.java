package programms;

import java.util.Scanner;

public class UpperLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = scanner.next().charAt(0);
		scanner.close();
		
		if(Character.isUpperCase(ch)) {
			System.out.println("Entered character is Uppercase letter");
		}
		else {
			System.out.println("Entered character is Lowercase letter");
		}
	}

}
