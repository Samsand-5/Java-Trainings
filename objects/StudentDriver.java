package objects;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name+" "+s1.collegeName+" "+s1.id);
		System.out.println("----------------------------------------------");
		Student s2 = new Student(1,"Raj");
		System.out.println(s2.name+" "+s2.collegeName+" "+s2.id);
	}
}
