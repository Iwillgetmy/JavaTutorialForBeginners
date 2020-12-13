
public class Person implements Info {

	private String name;

	// If you right click, then click source, then click generate constructor with
	// field, then check whichever instance variables you want, eclipse will make
	// the constructor for you! It will make a suprt constructor but I don't know
	// what it is yet
	public Person(String name) {

		this.name = name;

	}

	public void greet() {
		System.out.println("Hello there");
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is: " + name);
	}
}
