package programms;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			for (int j = 2*(4 - i); j >= 0; j--){
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
				}
			System.out.println();
		}

	}

}