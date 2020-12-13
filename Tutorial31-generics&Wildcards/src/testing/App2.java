package testing;

import java.util.ArrayList;

//Static methods can be called without the use of an object

class Machine {

	String hi = "hi";

	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Machine started");
	}

}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}

	public void snap() {
		System.out.println("Picture taken");
	}
}

public class App2 {

	public static void main(String[] args) {

//		ArrayList<String> list = new ArrayList<String>();
//
//		list.add("1");
//		list.add("2");
//
//		showList(list);

		// Array list of type machine
		ArrayList<Machine> list1 = new ArrayList<Machine>();

		// It prints out I am a Machine because when you run something that will return
		// a hashcode, java automatically tries to invoke a toString if there is one.
		list1.add(new Machine());
		list1.add(new Machine());

		// Both arraylists below work because Object is a superclass of Camera and
		// Machine and it has a toString method that enables sysouts to work
		showList2(list1);

		// Array list of type machine
		ArrayList<Camera> list2 = new ArrayList<Camera>();

		// It prints out I am a Machine because when you run something that will return
		// a hashcode, java automatically tries to invoke a toString if there is one.
		list2.add(new Camera());
		list2.add(new Camera());

		// It is not allowed because an ArrayList of Cameras is NOT a subclass of an
		// ArrayList of machines. However you can add a wildcard to fix this
		showList3(list2);

	}

	@Override
	public String toString() {
		return "App2 []";
	}

//	// This method will show all items in array list of Strings when you call on
//	// this method. It won't work for any other class. It would be same thing if
	// you put a Machine in the triangle brackets, etc...
//	public static void showList(ArrayList<String> list) {
//		for (String value : list) {
//			System.out.println(value);
//		}
//	}

	// This method is a wildcard. Because you put a question mark in the triangle
	// brackets, it will now accept any type of class or variable. The only
	// disadvantage is that the class you put in is treated like a type Object,
	// because Object is the ultimate class. You can't call specific methods here.
	public static void showList1(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

	// This is method now works like the method above, but inside the triangle
	// brackets can only be the Machine class or a subclass. Now if you call this
	// method, it will outprint I am a + class name, then class name + started if
	// the method has been overridden. More useful than above, because you can call
	// Machine type methods
	public static void showList2(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();

			// Isn't allowed because java only knows that there can be subclasses of type
			// Machine, it doesn't know the exact subclass
			// value.snap();
		}
	}

	// Works like above but opposite. now, it needs to be of type Camera or a super
	// class of camera. You can call camera specific methods. However the problems
	// is that the parent class won't have the exact same methods as the child
	// class.
	public static void showList3(ArrayList<? super Camera> list) {
		for (Object	 value : list) {
			System.out.println(value);
		}
	}

}
