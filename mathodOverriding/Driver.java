package mathodOverriding;

public class Driver {
	public static void main(String[] args) {
		Animal dogAnimal = new Dog("Siberian Husky"); // upcasting
		dogAnimal.sound();
		dogAnimal.greet();
////		System.out.println(dogAnimal.breed); // cannot access members of child with parent reference
//		String dogBreed = ((Dog)dogAnimal).breed; // downcasting
//		System.out.println(dogBreed);
//		dogAnimal.sound();
//		System.out.println("------------------------------------");
//		Animal tigerAnimal  = new Tiger();
//		tigerAnimal.sound();\
		
		
	}
}
