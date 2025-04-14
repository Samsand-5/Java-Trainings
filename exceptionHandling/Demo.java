package exceptionHandling;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(x/y);
			scan.close();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			scan.close();
			System.out.println("finally block");
		}
		
		
		
		try(Scanner sc = new Scanner(System.in)){
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(x/y);
		}
		
		
	}
}
