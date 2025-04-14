package methodChaining;

public class StudentDriver {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1).setName("Rohit").display();
	}
	
	
}
