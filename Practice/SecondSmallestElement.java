package programms;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			//System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println(arr[1]);

	}

}
