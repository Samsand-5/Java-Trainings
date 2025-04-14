package encapsultion;

public class StudentDriver {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Rahul", 1234);
		s.getName(1234);
		
		s.updatePassword(1234);
		s.displayDetails();
	}
}
