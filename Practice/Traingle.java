package programms;

import java.util.Scanner;

public class Traingle {

	public static void main(String[] args) {
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
		
		int sum = a + b + c;		
		
		if(sum == 180) {
			System.out.println("These three angles form a triangle");
		}
		else {
			System.out.println("These three angles do not form a triangle");
		}
		
	}
}
