
public class App {

	// The parameters are of type Info, the interface. Methods aren't usually static
	// but this one is. Because there is only one method in the Info interface we
	// will output that
	// method. The variable inside can access any method in the interface
	private static void outputInfo(Info info) {
		info.showInfo();
	}

	public static void main(String[] args) {

		Machine mach1 = new Machine();
		mach1.start();
		mach1.showInfo();

		// When you write new you need to write a class name, you can't write an
		// interface
		// unless you do some special thing I havent learnt yet
		Person person1 = new Person("Bob");
		person1.greet();
		person1.showInfo();

		// To formalize an interface to show something from a class, you click on file,
		// click new interface, then type the name and click enter.
		// Interfaces force classes which implement the interface to have the headings
		// Which are in the interface

		// This is the machine class and the info interface. You can put an interface
		// name. Instead of the name of a class almost everywhere,
		// like seen below. This is allowed because Machine
		// class implements Info you can write methods in this also! However you can
		// only call on methods which are made in the specific interface, like showInfo
		Info info1 = new Machine();
		info1.showInfo();

		// This makes the new info 2 object equivalent to person1. Still, it can only
		// use
		// the showInfo method. This points towards the Info interface which points to
		// the person1 object.
		// This means that info2 will point towards the Person class. It is allowed
		// because Person implements Info
		Info info2 = person1;
		info2.showInfo();

		// Trying to use the app method. In the method which is in the main class, you
		// put an object which is in a class that implements the interface. The
		// statement below will outprint the same thing as a simple mach1.showInfo();.
		// As you can see interfaces are quite useful. Because Machine/Person implements
		// Info, they become like variables, which is why they can be put in the
		// parameters
		// You can pass any object inside those brackets if they implement the info
		// interface
		outputInfo(mach1);
		outputInfo(person1);

		// ANALOGY FOR INTERFACES: When you open a bank account, thats like creating a
		// new
		// class to create new objects. When you open a bank account, you look into bank
		// you want to use, and what kind of perks the bank has. But after you open the
		// account, you expect the bank will have the same facilities that all banks
		// have, like to withdraw money. The facilities the bank has are like the things
		// you specify in an interface. You only need to think about particular objects
		// when you click new. Its like when we wrote Info 1 = machine, we lost access
		// to all of machines specific methods, except for the one shared with the Info
		// interface.

	}
}
