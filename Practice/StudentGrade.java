package programms;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Grade :");
		float averageMarkRange = scanner.nextFloat();
		if (averageMarkRange >= 94) {
			System.out.println("Grade: A");
		}
		else if (averageMarkRange >=90 && averageMarkRange < 94) {
			System.out.println("Grade: A-");
		}
		else if (averageMarkRange >=87 && averageMarkRange < 90) {
			System.out.println("Grade: B+");
		}
		else if (averageMarkRange >=83 && averageMarkRange < 87) {
			System.out.println("Grade: B");
		}
		else if (averageMarkRange >=80 && averageMarkRange < 83) {
			System.out.println("Grade: B-");
		}
		else if (averageMarkRange >=77 && averageMarkRange < 80) {
			System.out.println("Grade: C+");
		}
		else if (averageMarkRange >=73 && averageMarkRange < 77) {
			System.out.println("Grade: C");
		}
		else if (averageMarkRange >=70 && averageMarkRange < 73) {
			System.out.println("Grade: C-");
		}
		else if (averageMarkRange >=67 && averageMarkRange < 70) {
			System.out.println("Grade: D+");
		}
		else if (averageMarkRange >=63 && averageMarkRange < 67) {
			System.out.println("Grade: D");
		}
		else if (averageMarkRange >=60 && averageMarkRange < 63) {
			System.out.println("Grade: D-");
		}
		else if (averageMarkRange < 60) {
			System.out.println("Grade: F");
		}
	}

}
