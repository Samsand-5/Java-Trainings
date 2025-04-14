package object_class;

public class EmployeeDriver {
	public static void main(String[] args) throws Exception{
		Employee e1 = new Employee(1,"Rohit",2000);

		Employee e2 = new Employee(1,"Rohit",2000);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		String s = "Rohit";
		System.out.println(s.hashCode());
		
		Employee e = e1.cloneEmployee(e1);
		
		System.out.println(e1);
		System.out.println(e);
	}
}
