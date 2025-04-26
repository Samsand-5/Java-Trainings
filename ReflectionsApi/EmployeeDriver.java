package ReflectionsApi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeDriver {
	public static void main(String args[]) throws Exception {
		Class<Employee> employee=Employee.class;
		//fetching all field names of class
		Field[] fields=employee.getDeclaredFields();
		
		
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		System.out.println("------------------------");
		//changing value of field of a particular object
		Employee emp=new Employee("Soumyodip",1,22,40000.0);
		
		Field f=employee.getDeclaredField("name");
		
		f.setAccessible(true);
		f.set(emp, "Shuvam");
		System.out.println(f.get(emp));
		f.setAccessible(false);
		
		System.out.println(emp.getname());
		
		System.out.println("-------------------------");
		
		Method[] methods=employee.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("-------------------------");
		
		for(Method method : methods) {
			if(method.isAnnotationPresent(Deprecated.class)) {
				System.out.println(method.getName());
				System.out.println(method.invoke(emp));
			}
		}
	}
}
