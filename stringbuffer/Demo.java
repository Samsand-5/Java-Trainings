package stringbuffer;

public class Demo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append(false);
		sb1.append("Hello");
		System.out.println(sb1);
		
		
		StringBuffer sb2 = new StringBuffer("Hello world");
		System.out.println(sb2);
		
		sb2.delete(0, 4);
		System.out.println(sb2);
		System.out.println("--------------------------------------------------");
		
		
		char[] arr = {'a','b','c'};
		StringBuffer sb3 = new StringBuffer(150);
		sb3.append(arr);
		System.out.println(sb3);
		
		System.out.println(sb3.capacity());
		sb3.ensureCapacity(189);
		System.out.println(sb3.capacity());
		
		System.out.println(sb3.insert(1, false));
		System.out.println(sb3);
		
	}
}
