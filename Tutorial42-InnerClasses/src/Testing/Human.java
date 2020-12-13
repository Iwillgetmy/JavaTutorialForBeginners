package Testing;

public class Human {

	String name;
	String Gender;

	// Needs to be instanstiated right away because it is static
	static String direction = "forwards";

	public Human(String name, String Gender) {

		this.name = name;
		this.Gender = Gender;

	}

	public void greet(String sing) {
		System.out.println("Hello my name is " + name);

		String sings = sing;

		// This class is creating inside of a method!
		class Mouth {
			// It can access variables from inside the method and inside the enclosing
			// class. Usually the variable inside the method needs to be final
			public void speak() {
				System.out.println(sing + " my name is " + name);
			}
		}

		// Make sure that if you want to create an instance of the class, DECLARE IT
		// OUTSIDE OF THE CLASS!
		Mouth mouth = new Mouth();
		mouth.speak();
		
	}

	// Non-static inner class. It is made inside of another class, and has access to
	// all instance data from enclosing class. You need special way to instanstiate
	// it
	public class Legs {
		public void move() {
			// Because it is a non static inner class it can access instance data from
			// enclosing class
			System.out.println(name + " is moving " + Gender + " legs forwards");
		}
	}

	// Static inner class. It is made inside of another class, and can only access
	// instance data from enclosing class that is also static.
	static class arms {
		public void moveArms() {
			// This cannot access instance data outside unless data is static
			System.out.println("Moving arms " + direction);
		}
	}
}
