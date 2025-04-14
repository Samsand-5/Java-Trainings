package inheritance;

public class DriverClass {
	public static void main(String[] args) {
//		Parent p = new Parent();
		Child c = new Child("Rohit",30);
		System.out.println(c.name+"  "+c.age);
	}
}
