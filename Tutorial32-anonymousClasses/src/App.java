class Machine {

	public void start() {
		System.out.println("Starting machine");
	}

}

interface Plant {

	// Because this is an interface there is NO code or curly brackets. ONLY the
	// statement
	public void grow();

}

public class App {

	public static void main(String[] args) {

		// If you add curly brackets after the curve brackets when instanstiating an
		// object, you can override methods from the objects class in the created space,
		// like shown below. This becomes a child class of Machine because the method
		// inside is overridden. It is an anonymous class because it isn't named(no
		// extends Machine statement).
		Machine machine1 = new Machine() {

			@Override
			public void start() {
				System.out.println("Camera snapping ...");
			}

		};

		// Calling method of anonymous class
		machine1.start();

		// Below is an anonymous class which is based off of an interface. The anonymous
		// class overrides the grow method. Note that you cannot instantiate an
		// interface, unless you are trying to create an anonymous class
		Plant plant1 = new Plant() {

			// Odd to put override annotation for an interface?!?!?!?!
			@Override
			public void grow() {
				System.out.println("Plant growing");
			}

		};

		// Calling method of anonymous class
		plant1.grow();
	}

}
