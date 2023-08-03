package programms;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter the number of elements: ");
	      int n = scanner.nextInt();

	      int[] numbers = new int[n];
	      System.out.println("Enter the elements:");
	      for (int i = 0; i < n; i++) {
	         numbers[i] = scanner.nextInt();
	      }

	      Arrays.sort(numbers);

	      System.out.println("Elements in ascending order:");
	      for (int i = 0; i < n; i++) {
	         System.out.println(numbers[i]);
	      }
	}

}
