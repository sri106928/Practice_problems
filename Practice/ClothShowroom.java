package programms;

import java.util.Scanner;

public class ClothShowroom {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount : ");
        double amount = scanner.nextInt();
        double totalAmount = 0;
        
        System.out.println("Enter item number " + " (1- Mill Cloth, 2- Handloom Items): ");
        int item = scanner.nextInt();
        switch(item) {
        case 1:
        	if(amount <= 100) {
        		System.out.println("No Discount");
            	totalAmount = amount;
            	System.out.println("Total amount :"+ totalAmount);
        	}
        	if(amount >= 101 && amount <= 200) {
        		System.out.println("Discount: 5.0");
            	amount -= amount * 0.05;
            	System.out.println("Total amount :"+ amount);
        	}
        	if(amount >= 201 && amount <= 300) {
        		System.out.println("Discount: 7.5");
            	amount -= amount * 0.075;
            	System.out.println("Total amount :"+ amount);
        	}
        	if(amount >= 301) {
        		System.out.println("Discount: 10.0");
            	amount -= amount * 0.10;
            	System.out.println("Total amount :"+ amount);
        	}
        	break;
        case 2:
        	if(amount <= 101) {
        		System.out.println("Discount: 5.0");
            	amount -= amount * 0.05;
            	System.out.println("Total amount :"+ amount);
        	}
        	if(amount >= 101 && amount <= 200) {
        		System.out.println("Discount: 7.5");
            	amount -= amount * 0.075;
            	System.out.println("Total amount :"+ amount);
        	}
        	if(amount >= 201 && amount <= 300) {
        		System.out.println("Discount: 10.0");
            	amount -= amount * 0.10;
            	System.out.println("Total amount :"+ amount);
        	}
        	if(amount >= 300) {
        		System.out.println("Discount: 15.0");
            	amount -= amount * 0.15;
            	System.out.println("Total amount :"+ amount);
        	}
        	break;
        }
        	
        //System.out.println("Total amount " + " items after discount: $" + amount);
	}
}