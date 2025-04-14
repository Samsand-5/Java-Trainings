package interfaces;

public class Driver {
	public static void main(String[] args) {
		Vehicle b = new Bike();
		b.start();
		b.print();
		Vehicle.utility();
	}
}
