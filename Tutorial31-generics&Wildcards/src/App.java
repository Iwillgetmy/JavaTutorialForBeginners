import java.util.ArrayList;

//Make sure you import the ArrayList import in java.util!

class Machine {

	@Override
	public String toString() {
		return "I am a Machine";
	}

	public void start() {
		System.out.println("Machine started");
	}

}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera";
	}

	public void snap() {
		System.out.println("Picture taken");
	}
}

public class App {

	public static void main(String[] args) {

//		// In an arrayList, you need to specify the object to instantiate the class
//		ArrayList<String> list = new ArrayList<String>();
//
//		list.add("one");
//		list.add("two");
//
//		showList(list);

		ArrayList<Machine> yes = new ArrayList<Machine>();

		yes.add(new Machine());
		yes.add(new Machine());
		
		//Each of the ones below will print out all of the methods in Machine class
		showList(yes);
		showList1(yes);
		
		// ArrayList of a child class, is not a sub class for parent class in an Array
		// list. Ppolymorphism doesn't work here
		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());

		showList(list2);
		showList2(list2);

	}

	// This method will show the items in an array list! The class in the
	// parantheses is ArrayList and string because this specific method only deals
	// with ArrayList for Strings The question mark means "wildcard" this will now
	// read as an arrayList of an unknown type. This now works for any type!
	// This will work for any type of parameter. The problem with wildcard is that
	// the class needs to be of type Object, the ultimate parent class. This means
	// that you can't call specific classes from Camera, Machine, etc...
	public static void showList1(ArrayList<?> list) {

		for (Object value : list) {
			System.out.println(value);
		}
		
	}

	// This is the same method as above, but is has an upperbound for child classes
	// of the Machine class. This method can call methods in the Machine class. The
	// main variable can be of type machine because this accepts classes that are
	// subclasses of Machine Class
	public static void showList(ArrayList<? extends Machine> list) {

		for (Machine value : list) {
			System.out.println(value);

			// Prints out the variable and the start method
			value.start();

			// Statement below won't work because java only knows that all objects extend
			// from the Machine class. It doesn't know the specific class, meaning that it
			// won't know the methods inside camera class. This means that you can ONLY call
			// Machine methods in this for loop
			// value.snap();

		}

	}

	// This works like method above, but instead of an upperbound, it is a
	// lowerBound. Whatever is passed to this method, needs to be camera, or a super
	// class of camera. The problem is that superclasses won't all have the methods
	// that Camera class has.
	public static void showList2(ArrayList<? super Camera> list) {

		for (Object value : list) {
			System.out.println(value);
		}

	}
}