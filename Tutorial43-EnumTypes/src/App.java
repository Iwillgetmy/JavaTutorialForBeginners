
public class App {

	// The thing with public static final variables is very very common in the java
	// API, enum isn't used nearly as much as it should, but you should use it
	// because it is much safer than creating many single variables. Not only that,
	// but enum can hold any type of variable. String, int, double, etc... and you
	// can only put items from type Animal, not any variable in the code

	// We use final for the variable because that makes it a constant in java, and
	// static makes it belong to the class, which saves memory rather than having
	// instances of those constants for each object.
//	public static final int DOG = 0;
//	public static final int CAT = 1;
//	public static final int MOUSE = 2;

	public static void main(String[] args) {

//		// You can access instance variables from class APP because they are static
//		int animal = CAT;
//
//		// The problem with this is that I only want it to represent certain of a
//		// fixed set of values, but I only have certain animals that can represent this
//		// scheme. Another problem is that you can't tell what you're meant to set it
//		// equal to unless you look above at the class App. What we want is a special
//		// type that can be set to only represent certain members of a fixed set, which
//		// is what enum does. Enum stands for enumerate
//		switch (animal) {
//
//		case DOG:
//			System.out.println("dog");
//			break;
//
//		case CAT:
//			System.out.println("cat");
//			break;
//
//		case MOUSE:
//			System.out.println("mouse");
//			break;
//
//		}

		// Now since I created an enum, I don't need to create many static final
		// variables. Make sure the value you want is in the enum. To set value type
		// enum name.value. Eclipse can automatically make the case statements for you
		// for an enum. You just need to write what you want for each case. Much less
		// code with an enum
		Animal animal = Animal.CAT;
		switch (animal) {
		// Even if above, you needed to put value by doing animal.cat, you only need to
		// put the value for a case block.
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:

			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			System.out.println("Invalid input");
			break;

		}

		// This just prints out dog and doesn't say anything about the class
		System.out.println(Animal.DOG);

		// Gets specific value in String. This is special method in Java Lang Enum
		System.out.println("Enum name as a string: " + Animal.DOG.name());

		// This however tells me that dog is under the class "animal"
		System.out.println(Animal.DOG.getClass());

		// Instance of is useful because it helps figure out if it is an instance of the
		// certain type. E.g a whale shark is an instance of shark but it is also an
		// instance of fish

		// This tells me if animal.dog is an instance of class Animal
		System.out.println(Animal.DOG instanceof Animal);

		// Tells me whether animal.dog is an instance of an enum
		System.out.println(Animal.DOG instanceof Enum);

		// Tells me whether animal.dog is an instance of Object, which it is because
		// Object is the parent of everything.
		System.out.println(Animal.DOG instanceof Object);

		// Because I created a get method method for the animal enum, I can access the
		// name of the mouse with the get method.
		System.out.println(Animal.MOUSE.getName());

		// I can also set the name by accessing the set method
		Animal.MOUSE.setName("Bob");

		// Putting try catch to handle the runTime exception
		try {
			Animal animal2 = Animal.valueOf("CAT");
			// This prints out Jerry because CAT in enum animal has the name Jerry
			System.out.println(animal2);

		} catch (Exception e) {
			System.out.println("The inserted value is not defined in the enum Animal");
		}

	}
}
