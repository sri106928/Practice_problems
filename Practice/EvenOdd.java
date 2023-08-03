package programms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();		
		System.out.println("Enter a number: ");
		int number1 = scanner.nextInt();

		System.out.println("Enter a number: ");
		int number2 = scanner.nextInt();
		System.out.println("Enter a number: ");
		int number3 = scanner.nextInt();
		scanner.close();
		
		if (number % 2 == 0) {
			System.out.println("Number: " + number + " -> is Even");
		}
		else {
			System.out.println("Number: " + number + " -> is Odd");
		}
		if (number1 % 2 == 0) {
			System.out.println("Number: " + number1 + " -> is Even");
		}
		else {
			System.out.println("Number: " + number1 + " -> is Odd");
		}
		if (number2 % 2 == 0) {
			System.out.println("Number: " + number2 + " -> is Even");
		}
		else {
			System.out.println("Number: " + number2 + " -> is Odd");
		}
		if (number3 % 2 == 0) {
			System.out.println("Number: " + number3 + " -> is Even");
		}
		else {
			System.out.println("Number: " + number3 + " -> is Odd");
		}
	}
}
