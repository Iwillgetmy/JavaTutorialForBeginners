//THERE IS A BIG DIFFERENCE WITH EQUALS EQUALS AND THE EQUALS METHOD ITSELF. Equals equals just checks if both values are pointing towards the same 
//object and if they are, they are equal. However if they aren't, they are NOT equal. The equals method will actually compare if they are equal, it
//terms of their value, and for objects you can decide which factors decide that. Equals method is much safer and better in general. You are NOT 
//supposed to check NON primitive types with equals equals because it only checks if both values are pointing towards the same object or not.

//Equals equals is comparing to see if they are the same OBJECT litterally
//.equals/equals method is for comparing in terms of meaning which is what you want or if their values are similar for variables
	
//You can only call on the .equals method for an integer if you use the class name to instanstiate it e.g callling Integer instead of int
class Person {
	private int id;
	private String name;

	// To easily generate constructors, go to source, click generate contructor
	// using field, then tick the fields you want and press enter
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person() {

	}

	// To easily generate hashcode and equals, go to source, generate equals &
	// hashcode, then tick the boxes for what you think makes them equivalent, e.g
	// if you think that to be equal they need the same name, only tick the name
	// box. Tick the boxes YOU think are IMPORTANT.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// All that this equals method is doing is comparing two methods efficiently. It
	// does the easy tests first but if those don't work it goes to more complicated
	// ones. This says that ONLY if both the name and id of both objects are
	// similar, they are equal
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// To generate a toString method, simply go to source, create toString, then
	// tick fields you want, then generate toString!
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

// Sometimes you want to compare objects semantically. So that we have an idea
// when two OBJECTS are equal, it doesn't mean that EVERY instance
// variable is equivalent. This means that you can set it so that if only the
// instance variable of name is equal, then they are equivalent. That is
// what the .equals method is for

//The original equals is like sysout and jjust cecks if they are equal

public class App {

	public static void main(String[] args) {

		// If you didn't create a toString, it will print out a hashcode, which is the
		// class of the object, including the package that it is in. Hashcodes are a
		// unique id, every object has its own hashcode usually. It is the value
		// returned by the hashcode method I made above
		System.out.println(new Object());


		System.out.println(new Person(1, "2"));

		// Equals equals tells you whether two references to objects are pointing at the
		// same object or not. For primitive types, variables, etc... it tells if they
		// are the same value. Even if the instance variables are equal in an object, a
		// sysout won't regard them as "equal" because in terms of memory they are
		// different

		// Creating two Person objects
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");

		// If I were to write this, then below it would say true, because person2 took
		// on the same values for instance variables as person1
		// person2 = person1;

		// This would print out whatever person1's name is
		// System.out.println(person2.name);

		// Checking if person1 and person2 are equivalent. This outputs false. In a
		// system.out.println you can compare objects like Strings, classes or any
		// variable. Depending on the case you can use greather than, etc... Even if all
		// of the instance variables are equal, a sysout will say that the two objects
		// are different, because of memory
		// After generating the equals method, it says true.
		System.out.println(person1.equals(person2));

		// With numeric types, you can just use equals equals to check, no need for
		// equals method

		// Making some variables to test out
		Double value1 = 7.2;
		Double value2 = 7.2;

		// Like with objects, this won't work. However, if you use equals method it WILL
		// work, as the equals method is much more specific and better in general
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));

		Integer number1 = 6;
		Integer number2 = 6;

		// However this WILL work
		System.out.println(number1 == number2);

		/*
		 * When you set an object to the same value with integers, JAVA will create a
		 * new object and use the same object for both of them, meaning that they both
		 * point to the same object, making them equivalent. Not sure why this doesnt
		 * work for doubles
		 */

		// Creating two String objects
		String text1 = "hello";
		String text2 = "hello";

		// This will print out true, as they are pointing at the same object, as JAVA
		// automatically does that itself
		System.out.println(text1 == text2);

		// Creating new objects
		String text3 = "hello";

		// All that substring does is you put in the lowest and highest index and you
		// only keep those characters.
		String text4 = "hello32132".substring(0, 5);

		System.out.println(text4 + ", as you can see, text4 still has the exact same characters as text3");

		// Even if the value is still the same, an equals equals will say they are not
		// equal. This prints out false because it points towards a different object
		// because when it was initialized, it was much longer than text3
		System.out.println(text4 == text3);

		// However equals equals checks the values and because they are the same, it
		// says they are both equal. That is why you should ALWAYS use .equals for non
		// primitive types such as String
		System.out.println(text4.equals(text3));
	}

}
