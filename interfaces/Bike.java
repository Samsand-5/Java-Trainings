package interfaces;

public class Bike implements Vehicle{

	@Override
	public void print() {
		System.out.println(speed);
		System.out.println("Hello world");
	}

	@Override
	public void start() {
		System.out.println("Bike is starting");
		text();
	}

}
