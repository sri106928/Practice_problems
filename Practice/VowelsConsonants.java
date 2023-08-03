package programms;

import java.util.Scanner;

public class VowelsConsonants {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = scanner.next().charAt(0);
		scanner.close();
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Entered character is Vowel");
		}
		else {
			System.out.println("Entered character is Consonant");
		}
	}

}
