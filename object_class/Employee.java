package object_class;

public class Employee implements Cloneable
{
	private int id;
	private String name;
	private double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public boolean equals(Object o) {
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			return this.id == e.id && this.salary == e.salary && this.name.equals(e.name);
		}
		return false;
	}

//	public int hashCode() {
//		return (int)(this.id + this.salary + this.name.hashCode());
//	}
	// worst way of overriding hashcode
	public int hashCode() {
		return 1;
	}

	public Employee cloneEmployee(Employee e) throws Exception{

		return (Employee) e.clone();

	}

}
