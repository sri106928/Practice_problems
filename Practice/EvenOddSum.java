package programms;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		int evenNumbers = 0;
		int oddNumbers = 0;
		int sumEven = 0, sumOdd = 0;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Elements :");
		int n = scanner.nextInt();
		//System.out.println("Total Elements :"+n);
		int[] numbers = new int[n];
		System.out.println("Enter elements :");
		
		for(int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
//		for(int i = 0; i < n; i++) {
//			System.out.print(numbers[i] + " ");
//		}
			for( int number : numbers) {
				if(number % 2 == 0) {
					//System.out.println(number);
					evenNumbers++;
					sumEven += number;
				} else {
					oddNumbers++;
					sumOdd += number;
				}
			}
		System.out.println("Total Even numbers :"+ evenNumbers);
		System.out.println("Total Odd numbers :"+ oddNumbers);
		System.out.println("Sum of Even numbers :"+ sumEven);
		System.out.println("Sum of odd numbers :"+ sumOdd);

	}

}
