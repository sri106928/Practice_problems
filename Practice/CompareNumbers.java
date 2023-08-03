package programms;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		int c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for a: ");
		a = scanner.nextInt();
		System.out.println("Enter a number for b: ");
		b = scanner.nextInt();
		System.out.println("Enter a number for c: ");
		c = scanner.nextInt();
		scanner.close();
		if(a > b && a > c) {
			System.out.println("a is the largest number");
		}
		else if (b > a && b > c) {
			System.out.println("b is the largest number");
		}
		else {
			System.out.println("c is the largest numbe");
		}
		
		if(a == b || b == a) {
			System.out.println("a and b are equal numbers");
		}
		
		if (a == c || c == a) {
			System.out.println("c and a are equal numbers");
		}
		
		if (b == c || c == b) {
			System.out.println("b and c are equal numbers");
		}
		
		if (a == b && b == c && c == a) {
			System.out.println("a, b and c are equal numbers");
		}
	}

}
