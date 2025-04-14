package singly_linked_list;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to insert data\nEnter 2 to display\nEnter 3 to update by position"
					+ "\nEnter 4 to insert at specific position\nEnter 5 to delete\nEnter 6 to exit");
			int choice = scan.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("Enter the data");
					int data = scan.nextInt();
					list.insert(data);
					break;
				}
				case 2:
					list.display();
					break;
				case 3:{
					System.out.println("Enter data to update");
					int data = scan.nextInt();
					System.out.println("Enter position between "+1+"and "+list.count+" to update");
					int position = scan.nextInt();
					list.update(data, position);
					break;
				}
				case 4:{
					System.out.println("Enter data to insert");
					int data = scan.nextInt();
					System.out.println("Enter position between "+1+" and "+list.count+" to update");
					int position = scan.nextInt();
					list.insertAt(data, position);
					break;
				}
				case 5:{
					System.out.println("Enter position between "+1+" and "+list.count+" to delete");
					int position = scan.nextInt();
					list.deleteAt(position);
					break;
				}
				case 6:
					flag = false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
