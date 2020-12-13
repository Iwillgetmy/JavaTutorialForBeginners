//Below is an example of passing by value. Passing by value is sort of like when you make a method, and when you pass a variable into the parentheses
//and change it in the code, the original value from the main method will stay the same.
//Passing by reference is when you insert a special character in the argument so when you change the variable in the code, it also gets changed in 
//the main method
//Passing by reference means not an actual value but a number(adress) is passed to the argument
public class App {

	public static void main(String[] args) {

		System.out.println("Passing primitive type by value \n");

		// Passing primitive types by value
		// =================================================================================//

		// Programs usually start with the creation of an object. If you make the
		// variables name the same as the class, make sure it is a lower-case
		App app = new App();

		// Int value has a specific amount of memory, so when I create the value of 7,
		// we can easily store all of that memory,(7), in the amount of space which is a
		// very long number
		// Displaying integer with show method
		int value = 7;
		System.out.println("1. Value is: " + value);
		app.show(value);

		// Even if value got changed in the show method, the origial value won't be
		// changed, it will only be different in the show method
		System.out.println("4. Value is: " + value);

		System.out.println("\nPassing non-primitive type by value \n");

		// Passing non-primitive type Person by value
		// ==================================================================================//

		// When I create a non primitive value like type Person, we aren't creating
		// enough memory to store it. This stores the adress. The new Person part
		// allocactes enough memory to hold the data members of this class. So the new
		// Person is building the house from the class, which is like a blueprint, and
		// the Adress of the house is stored in the Person person
		Person person = new Person("Bob");

		// To String method, telling user what person objects name is
		System.out.println("1. Person is: " + person);

		// When we call app.show, it creates a new variable in the parantheses, and then
		// creating a totally new adress when we change the value of type Person
		app.show(person);

		System.out.println("4. Person is: " + person);
	}

	// INT VALUE HERE IS TOTALLY DIFFERENT COPY THAN THE INT VALUE IN THE MAIN
	// METHOD
	public void show(int value) {
		System.out.println("2. Value is: " + value);
		value = 8;
		System.out.println("3. Value is: " + value);
	}

	// Show method for type person. This is called method overloading. Method
	// overloading is when you can have methods with the same name as long as they
	// have a different argument list
	public void show(Person person) {
		System.out.println("2. Person is: " + person);

		// This will change the value above so it will say name=Sue not name=Bob because
		// person.setName does refer to the same adress as the one in the main method.
		// This changes "Bob" to "Sue"
		person.setName("Sue");

		// This is how you modify an object you already created. Modifying/Changing the
		// person object is like erasing the old adress and creating a new one. That is
		// why when we go back it displays the old object
		person = new Person("Mike");

		// If we put a setName here like shown below, it won't change the value in the
		// main method because person's adress was changed above when we said person =
		// new Person("Mike"). This means the modified/new adress will have a different
		// name	 
		person.setName("Marv");

		System.out.println("3. Person is: " + person);
	}
}
