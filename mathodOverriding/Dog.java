package mathodOverriding;

public class Dog extends Animal{

	
	String breed; // variable which belong to Dog class only
	public Dog(String breed) {
		this.breed=breed;

	}
	void sound() {  // method overriding
		System.out.println("Dog is barking");
	}
	
	static void greet() {
		System.out.println("Dog is greeting");
	}
}
