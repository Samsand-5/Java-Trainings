package calculatorApp;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		System.out.println("Welcome to calculator app");
		System.out.println("Enter 1 to add\nEnter 2 to div");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		switch(choice) {
			case 1:
				Calculator.addMenu();
				break;
			case 2:
				Calculator.div();
				break;
			default:
				System.out.println("Invalid choice");
		}
		System.out.println("Thank you using calculator app");
	}
}
