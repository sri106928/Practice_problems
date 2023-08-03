package programms;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = scanner.nextInt();
		int originalNumber = n;
		int reverseNumber = 0;
		while(n!= 0) {
			reverseNumber = reverseNumber * 10 + n % 10;
			n = n / 10;
		}
		//System.out.println(reverseNumber);
		if(originalNumber == reverseNumber) {
			System.out.println("Given number " + originalNumber + " is palindrome");
		}
		else {
			System.out.println("Given number " + originalNumber + " is not palindrome");
		}

	}

}
