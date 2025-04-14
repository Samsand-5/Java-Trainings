package doubly_linkedlist;

public class DoublyLinkedList {
	Node head;
	Node tail;
	static int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			count++;
		}
		else {
			tail.next=node;
			node.previous=tail;
			tail=node;
			count++;
		}
	}
	
	public void displayForward() {
		if(head==null) {
			System.out.println("No data to display");
			return;
		}
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		if(tail==null) {
			System.out.println("No data to display");
			return;
		}
		Node current = tail;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.previous;
		}
		System.out.println();
	}
	
	public void update(int position,int data) {
		if(head==null) {
			System.out.println("No data to update");
			return;
		}
		if(position==1) {
			head.data=data;
			return;
		}
		if(position==count) {
			tail.data=data;
			return;
		}
		Node current = head;
		int i = 1;
		while(current!=null) {
			if(i==position) {
				current.data=data;
				return;
			}
			i++;
			current=current.next;
		}
	}
	
	public void insertAt(int position,int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			count++;
			return;
		}
		if(position<1 || position>count) {
			System.out.println("position out of bounds");
			return;
		}
		if(position==1) {
			node.next=head;
			head.previous=node;
			head=node;
			count++;
			return;
		}
		if(position==count) {
			Node current = tail;
			current = current.previous;
			current.next=node;
			node.previous=current;
			node.next=tail;
			tail.previous=node;
			count++;
			return;
		}
		
		Node current = head;
		int i = 1;
		while(current!=null) {
			if(i==position-1) {
				Node temp = current.next;
				node.next=temp;
				temp.previous=node;
				current.next=node;
				node.previous=current;
				count++;
				return;
			}
		}
	}
	
	public void delete(int position) {
		if(head==null) {
			System.out.println("No data to delete");
			return;
		}
		if(position==1) {
			Node temp = head;
			head=head.next;
			temp.next=null;
			head.previous=null;
			count--;
			return;
		}
		if(position==count) {
			Node temp = tail;
			tail = tail.previous;
			tail.next=null;
			temp.previous=null;
			count--;
			return;
		}
		Node current = head;
		Node temp,previousNode;
		int i = 1;
		while(current!=null) {
			if(position==i) {
				temp=previousNode=current;
				previousNode = previousNode.previous;
				temp = temp.next;
				previousNode.next=temp;
				temp.previous=previousNode;
				current.next=current.previous=null;
				count--;
				return;
			}
			i++;
			current=current.next;
		}
	}
}
