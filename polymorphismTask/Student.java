package polymorphismTask;

public class Student extends Person{
	private int studetnId;
	
	Student(String name,int age,int studentId){
		super(name,age);
		this.studetnId=studentId;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" "+this.studetnId);
	}
}
