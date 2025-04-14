package abstraction;

public class Bike extends Vehicle{

	@Override
	public void start() {
		System.out.println("Combustion engine start");
	}

	@Override
	public void message() {
		System.out.println("Have a safe ride");
	}

}
