package methodOverLoading;

public class MethodOverLoading {
	public static void main(String[] args) {
		add(10,20,40);
		add(10,20);
//		add(10,20,30,40);
	}
	public static void add(byte a, byte b) {
		System.out.println("third");
		System.out.println(a+b);
	}
	public static int add(int a,int b) {
		System.out.println("first");
		System.out.println(a+b);
		return a+b;
	}
	public static void add(int a, int b,float c) {
		System.out.println("second");
		System.out.println(a+b+c);
	}
	
	public static void add(float a,float b,float c) {
		System.out.println(a+b+c);
		System.out.println("last");
	}
	
}
