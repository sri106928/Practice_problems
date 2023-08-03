package programms;

import java.util.Scanner;

public class AverageNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		float average = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Elements :");
		int n = scanner.nextInt();
		//System.out.println("Total Elements :"+n);
		int[] numbers = new int[n];
		System.out.println("Enter elements :");
		
		for(int i=0; i <n; i++) {
			numbers[i] = scanner.nextInt();
			//int a = numbers[i];
			if(numbers[i] > 0) {
				total += numbers[i];
			}
			//System.out.println(total);
			
		}
		average = (float) total/n;
		System.out.println("Average of the given numbers is :"+ average);;
	}

}
