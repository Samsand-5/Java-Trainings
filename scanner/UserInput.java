package scanner;

import java.util.Scanner;
//import java.util.*;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you bio");
		System.out.println(scan.nextLine()); //accepts all characters as string(multiword string)
		System.out.println("Enter integer");
		int num1 = scan.nextInt(); // accepts an integer
		System.out.println(num1);
		System.out.println("Enter boolean");
		System.out.println(scan.nextBoolean()); // accepts a boolean
		System.out.println("Enter byte");
		System.out.println(scan.nextByte()); // accepts a byte
		System.out.println("Enter short");
		System.out.println(scan.nextShort()); // accepts a short
		System.out.println("Enter long");
		System.out.println(scan.nextLong()); // accepts a long
		System.out.println("Enter float");
		System.out.println(scan.nextFloat()); // accepts a float
		System.out.println("Enter double");
		System.out.println(scan.nextDouble()); // accepts a double
		System.out.println("Enter name");
		System.out.println(scan.next()); // accepts a string (singles worded string)
		
		
	}
}
