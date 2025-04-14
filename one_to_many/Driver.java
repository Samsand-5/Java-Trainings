package one_to_many;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scan.nextInt();
		
		Bank bank = new Bank(size, "SBI");
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter 1 to add customer\nEnter 2 to display customers"
					+ "\nEnter 3 to exit");
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter customer ID");
					int id = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter customer name");
					String name = scan.nextLine();
					Customer customer = new Customer(name,id);
					bank.addCustomer(customer);
					break;
				case 2:
					bank.displayCustomers();
					break;
				case 3:
					flag = false;
					break;
			}
			
		}
	}
}
