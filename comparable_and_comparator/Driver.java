package comparable_and_comparator;

import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(2,"Samarth",200000);
		Employee e2 = new Employee(1,"Sam",145897);
		
		Employee[] arr = {e1,e2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		compareBasedOnName(e1, e2);
//		compareBasedOnId(e1, e2);
	}
	
	public static void compareBasedOnName(Employee e1,Employee e2) {
		if(e1.compareTo(e2)>0) {
			System.out.println("e1 is greater");
		}
		else if(e1.compareTo(e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
	
	public static void compareBasedOnId(Employee e1,Employee e2) {
		
		CompareEmployeeById compareId = new CompareEmployeeById();
		
		if(compareId.compare(e1, e2)>0) {
			System.out.println("e1 is greater");
		}
		else if(compareId.compare(e1, e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
}
