package composition;

public class Driver {
	public static void main(String[] args) {
		Car c = new Car("Ferrari","V8");
		c.display();
		
		c=null;
		c.display();
	}
}
