package strings;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		
		System.out.println(s.codePointAt(1));
		s = s.concat("World");
		System.out.println(s);
		
		String message = "What a wonderful world, hello world";
		System.out.println(message.contains("a"));
		System.out.println(message.contains("world"));
		System.out.println(message.contains("zebra"));
		
		char[] arr = {'d','e','m','o'};
		String s1 = String.copyValueOf(arr);
		System.out.println(s1);
		String s2 = String.copyValueOf(arr, 0, 2);
		System.out.println(s2);
		
		
		System.out.println(message.endsWith("world"));
		
		String s3 = "hello";
		String s4 = "Hello";
		System.out.println(s4.equalsIgnoreCase(s3));
		
		System.out.println(s3.length());
		String s5 = "   ";
		System.out.println(s5.length());
		System.out.println(s5.isEmpty());
		System.out.println(s5.isBlank());
		
		System.out.println(message.startsWith("What"));
		System.out.println(message.indexOf('w'));
		System.out.println(message.lastIndexOf('w'));
		System.out.println(message.lastIndexOf("world"));
		
		System.out.println(String.join("?","hello","world","good","evening"));
		
		System.out.println(message.replace("world", "earth"));
		System.out.println(message.replaceFirst("world", "earth"));
		
		String[] arr1 = message.split(" ");
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = message.split(",");
		System.out.println(Arrays.toString(arr2));
		
		char[] arr4 = s3.toCharArray();
		System.out.println(Arrays.toString(arr4));
		
		
		String s6 = "      jksdhbvj    kasgdjvbadfj           ";
		System.out.println(s6);
		System.out.println(s6.trim());
		
		
		String s7 = "Hello World";
		System.out.println(s7.substring(6));
		System.out.println(s7.substring(4));
		System.out.println(s7.substring(0, 4));
	}
}
