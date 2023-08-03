package programms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements :");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
