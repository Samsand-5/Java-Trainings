package wrapper_class;

public class WrapperClasses {
	public static void main(String[] args) {
		int i = 10;
		Integer x = new Integer(i); // boxing
		System.out.println("x: "+x);
		Integer z = Integer.valueOf(i); //boxing
		
		Integer y = 30; // auto-boxing
		System.out.println("y: "+y);
		
		
		int a = y.intValue(); // unboxing
		Boolean flag = true;
		boolean b = flag.booleanValue(); //unboxing
		System.out.println("a: "+a+" "+"b: "+b);
		
		
		Character ch = 'a'; //auto-boxing
		char c = ch; // auto-unboxing
		
		String s = "true";
		Boolean bool1 = Boolean.parseBoolean(s); // parsing
		boolean bool2 = Boolean.parseBoolean(s); // parsing + auto-unboxing
		
		
		int sum = 3*(3+1)/2;
		System.out.println(sum);
	}
}
