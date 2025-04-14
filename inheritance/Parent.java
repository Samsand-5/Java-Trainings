package inheritance;

public class Parent {
	String name;
	int age;
	
	public Parent(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public Parent(String name) {
		this.name=name;
	}
	
	public Parent() {
		System.out.println("Parent constructor");
	}
}
