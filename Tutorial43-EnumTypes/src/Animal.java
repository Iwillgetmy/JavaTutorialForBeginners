//Instead of having public class it says public enum. In an enum, the values you put in become objects of the enum you made.

//For most classes, they inherit methods from the super parent, the OBJECT class, but enum inherits the immediate ancestor, which is at least Java 
//Lang Enum and all the classes in the Java lang package. This means that you don't need to import them.

//You can give enums constructors and methods, like a regular class, but if you do, you need to finish the list of values with a semicolon

public enum Animal {
	// To add values, just put them seperated by commas. This is usually what you do
	// with enum
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

	// Enums can also have instance data
	private String name;

	// Constructor needs to have a body and the access specifier is either package
	// level or private.
	// If you put in parameters for the constructor, each item in the list needs to
	// have whatever the parameter is, unless you make multiple constructors with
	// different parameters.
	Animal(String name) {

		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// You can't generate toString with enum with the shortcut, but you can do it
	// yourself. So yes, you can override toString with enum, like in any class
	public String toString() {
		return "This animal is called: " + name;
	}

	// Now I don't need to add a name for each value, but I still can
	Animal() {
	}

}
