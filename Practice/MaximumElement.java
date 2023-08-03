package programms;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
		}

		System.out.println(arr[arr.length - 1]);
	}

}
