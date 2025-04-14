package objects;

public class Student {
	int id ;
	String name ;
	String collegeName ;
	
	
	public Student() {
		
		System.out.println("This is a no-arg constructor");
	}
	public Student(int id) {
		this();
		this.id=id;
		System.out.println("one arg constructor");
	}
	public Student(int id,String name) {
		this(id);
		this.name=name;
		System.out.println("two arg constructor");
	}
	public Student(int id,String name,String collegeName) {
		this(id,name);
		this.collegeName=collegeName;
		System.out.println("three arg constructor");
	}
	
	public void study() {
		System.out.println( name+" is studying");
	}
}
