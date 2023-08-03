package programms;

import java.util.Scanner;

public class RangeUpperLowerCase {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the number of alphabets: ");
			int n = scanner.nextInt();
			char[] alphabets = new char[n];

			System.out.println("Enter the alphabets:");

			for (int i = 0; i < n; i++)
			{
				alphabets[i] = scanner.next().charAt(0);        	
				char ch = alphabets[i];
				
				if(ch >='A'  && ch <= 'Z') 
				{
					System.out.println(ch + " is an Uppercase letter");
				}
				if(ch >='a'  && ch <= 'z') 
				{
				System.out.println(ch + " is an Lowercase letter");
				}
				
			}
		}
	}

}

