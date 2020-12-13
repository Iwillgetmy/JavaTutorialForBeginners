public class Robot {

	// This is a nested class/inner class(main inner class), because it was made
	// inside another "main" class
	// Because the brain class was created inside of the Robot class, it now has
	// access to all of the instance data from class Robot, including methods and
	// variables. However unlike child classes, you can call on the methods from the
	// class that you nested the class inside of. You usually make inner classes
	// private, or just don't give an access specifier(only accessible by package).
	class Brain {
		public void think() {

			// As you can see, I am accessing data from the robot class
			System.out.println("Robot " + id + " is thinking");

		}
	}

	// The second kind of "inner class" are static inner classes. These are pretty
	// simple. These have the keyword static before the access specifier, but you
	// usually keep it as package level anyways. Static inner classes are mainly
	// used for grouping classes together
	static class Battery {
		public void charge() {
			// Because this is a static class, it cannot access the instance data in this
			// class, unless the data is also static. You can NOT make a static reference to
			// a non-static field, you can't put non static items in the static inner class.
			// Static inner classes can only access variables in the enclosing class if the
			// variable is static
			System.out.println("Battery charging");
		}
	}

	private int id;

	// Creating constructor
	public Robot(int id) {
		super();
		this.id = id;
	}

	public void start() {
		System.out.println("Starting robot " + id);
		Brain brain = new Brain();
		brain.think();

		// This will work but it is better if the variable is final needs to be final
		String name = "Robert";

		// You can declare a class inside of a method. This class has access to instance
		// data as it is a non-static inner class. However, this is the only inner class
		// that has access to string name because it was declared inside of the same
		// method as String name. Remember, a variable only exists in the brackets where
		// is was created. This also means that it can only be instanstiated inside the
		// start method, not outside of it. This can only have package level access
		// specifier, or be abstract or final.
		// This can be useful and is not really uncommon. If you need an instance of a
		// class to pass to another method and you don't want to use an anonymous class, 
		class Temp {

			// Class temp is like an anonymous class. The methods inside of it can only
			// refer to local variables if they are final, but they can refer to instance
			// data just fine
			public void doSomething() {
				System.out.println("Id is: " + id);
				System.out.println("My name is: " + name);
			}
		}

		// Creating an instance of type temp
		Temp temp = new Temp();
		temp.doSomething();

	}

}
