package singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("instance created");
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
