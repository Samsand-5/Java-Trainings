package calculatorApp;

import java.util.Scanner;

public class Calculator {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void addMenu() {
		
		System.out.println("Enter 1 to add two numbers\nEnter 2 to add three numbers");
		int choice = scan.nextInt();
		
		switch(choice) {
			case 1:{
				System.out.println("Enter first number");
				int num1 = scan.nextInt();
				System.out.println("Enter second number");
				int num2 = scan.nextInt();
				add(num1,num2);
				break;
			}
				
			case 2:{

				System.out.println("Enter first number");
				int num1 = scan.nextInt();
				System.out.println("Enter second number");
				int num2 = scan.nextInt();
				System.out.println("Enter the third number");
				int num3 = scan.nextInt();
				add(num1,num2,num3);
				break;
			}
			default:
				System.out.println("invalid input");
				
		}
	}
	public static void add(int i,int j) {
		System.out.println(i+j);
	}
	
	public static void add(int i,int j, int k) {
		System.out.println(i+j+k);
	}
	public static void div() {
	
		System.out.println("Enter numerator");
		int num1 = scan.nextInt();
		System.out.println("Enter denominator");
		int num2 = scan.nextInt();
		if(num2!=0) {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("Denominator is 0, cannot divide"); 
		}
	}
}
