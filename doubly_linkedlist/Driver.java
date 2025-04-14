package doubly_linkedlist;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to add\nEnter 2 to display forward\nEnter 3 to display backward"
					+ "Enter 4 to insert at specific position\nEnter 5 to update\nEnter 6 to delete"
					+ "\nEnter 7 to exit");
			int choice = scan.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("Enter data");
					list.insert(scan.nextInt());
					break;
				}
				case 2:
					list.displayForward();
					break;
				case 3:
					list.displayBackward();
					break;
				case 4:{
					System.out.println("Enter position from 1 and "+list.count);
					int position = scan.nextInt();
					System.out.println("Enter data");
					int data = scan.nextInt();
					list.insertAt(position, data);
					break;
				}	
				case 5:{
					System.out.println("Enter position from 1 and "+list.count);
					int position = scan.nextInt();
					System.out.println("Enter data");
					int data = scan.nextInt();
					list.update(position, data);
					break;
				}
				case 6:{
					System.out.println("Enter position from 1 and "+list.count);
					int position = scan.nextInt();
					list.delete(position);
					break;
				}
				case 7:
					flag = false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
