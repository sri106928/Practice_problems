package programms;

import java.util.Scanner;

public class SwapArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = scanner.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter array1 elements :");
		for(int i = 0; i < n; i++) {
			arr1[i] = scanner.nextInt();
		}
		int[] arr2 = new int[n];
		System.out.println("Enter array2 elements :");
		for(int i = 0; i < n; i++) {
			arr2[i] = scanner.nextInt();
		}
		int[] buffer = new int[n];
		for(int i = 0; i < n; i++) {
			buffer[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = buffer[i];
			
		}
		System.out.println("Swapped array 1 elements :");
		for(int i = 0; i < n; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		System.out.println("Swapped araay 2 elements :");
		for(int i = 0; i < n; i++) {
			System.out.print(arr2[i]+ " ");
		}
	}

}
