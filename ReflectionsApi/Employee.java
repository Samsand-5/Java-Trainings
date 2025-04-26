package ReflectionsApi;

public class Employee {
	private String name;
	private int id;
	private int age;
	private double salary;
	
	public Employee(String name,int id,int age,double salary) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.salary=salary;
	}
	@Deprecated
	public String getname() {
		return this.name;
	}
	@Deprecated
	public int getid() {
		return this.id;
	}
	@Deprecated
	public int getage() {
		return this.age;
	}
	@Deprecated
	public double getsalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return name +" "+id+" "+age+" "+salary;
	}
}
