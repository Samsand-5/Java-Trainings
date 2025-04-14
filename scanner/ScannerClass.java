package scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		System.out.println("Enter 1 to add\nEnter 2 to sub\nEnter 3 to mul\nEnter 4 to div");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Addition");
				break;
			case 2:
				System.out.println("Subtraction");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			case 3:
				System.out.println("Multiplication");
				break;
			case 4:
				System.out.println("Division");
				break;
			
		}
		
	}
}
             