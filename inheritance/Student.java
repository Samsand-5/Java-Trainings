package inheritance;

public class Student extends Person{
	private int id;
	
	public Student(String name,int age,int id) {
		super(name,age);
		this.id=id;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" "+this.id);
		
	}
}
