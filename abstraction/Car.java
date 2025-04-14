package abstraction;

public class Car extends Vehicle{

	@Override
	public void start() {
		System.out.println("Electric engine start");
	}

	@Override
	public void message() {
		System.out.println("Have a safe drive");
	}

	

}
