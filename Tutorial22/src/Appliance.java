public class Appliance {

	// If it is a private variable, it cannot be accessed when the class is
	// extended. Protected means that it is protected, but can be accessed anywhere
	// in the package it is in or in a "child" class.
	protected String name = "Appliance type1";

	public void start() {
		System.out.println("Appliance started");
	}

	public void stop() {
		System.out.println("Appliance stopped");
	}
}
