package one_to_many;

public class Demo {
	public static void main(String[] args) {
		Customer c1 = new Customer("Rohit", 10);
		Customer c2 = c1;
		System.out.println(c1+"    "+c2);
		
		int a = 10;
		int b = a;
		System.out.println(a+"  "+b);
	}
}
