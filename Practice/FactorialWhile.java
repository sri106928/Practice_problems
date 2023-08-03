package programms;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int factorial = 1;
        
        while(number > 0) {
        	factorial *= number;
        	number--;
        }
        System.out.println("Factorial of " +number+ " is: "+factorial);
	}

}
