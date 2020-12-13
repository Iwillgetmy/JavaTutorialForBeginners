import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Looking at how to sort lists using comparators

//If you want to sort your list in a method OTHER than natural order, you need to create a class which implements the comparator interface. For 
//example the class I will make below will sort in length of the element

//MAKE SURE YOU CREATE NEW CLASSES OUTSIDE OF THE MAIN CLASS. IF NOT YOU WILL CREATE AN INNER CLASS
class StringLengthComparator implements Comparator<String> {

	@Override
	// This method will get all objects in the list one at a time, and will need to
	// determine which is larger. To determine that, it will check certain
	// variables. If s1=s2, return 0. If s1>s2, return 1. If s1<s2, return -1. This
	// will sort from smallest to largest. For largest to smallest do opposite.
	// There is a much more efficient method, using the compareTo method
	public int compare(String s1, String s2) {

		// .length method returns length of String
		int length1 = s1.length();
		int length2 = s2.length();

		if (length1 == length2) {
			return 0;
		} else if (length1 > length2) {
			return 1;
		} else {
			return -1;
		}
	}
}

//Sorts from largest to smallest in length
class NegativeComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 == len2) {
			return 0;
		} else if (len1 > len2) {
			return -1;
		} else {
			return 1;
		}
	}
}

//Sorts from a-z
class AlphabeticalOrder implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		// Compare to is a method of the comparable interface. It DEFINES natural
		return s1.compareTo(s2);
	}

}

//Sorts from z-a
class ReverseAlphabeticalOrder implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		// Compare to is a method of the comparable interface. It DEFINES natural
		return s1.compareTo(s2) * -1;
	}

}

class Machine {

	private int id;
	private String task;

	public Machine(int id, String task) {
		this.id = id;
		this.task = task;
	}

	@Override
	public String toString() {
		return "Machine [id=" + id + ", task=" + task + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}

public class App {

	public static void main(String[] args) {

		///////////////////// Sorting Strings ////////////////////

		List<String> animals = new ArrayList<String>();

		animals.add("dog");
		animals.add("mouse");
		animals.add("cat");
		animals.add("orangutan");
		animals.add("gorilla");
		animals.add("leopard");

		// This works but there is a more efficient way
		System.out.println(animals);

		// To put in alphabetical order, use static sort method from collections class.
		// Sorts elements in list in alphabetical order
		Collections.sort(animals);

		System.out.println(animals);

		// To sort the list with new comparator, type this statement. For different,
		// type List name, then new (Comparater class name)
		Collections.sort(animals, new StringLengthComparator());
		System.out.println(animals);

		Collections.sort(animals, new NegativeComparator());

		// Prints without brackets, you can modify to outprint however you want. As you
		// see now with the new comparator, it is sorted from largest to greatest
		for (String animal : animals) {
			System.out.print(animal + ", ");
		}

		System.out.println();

		Collections.sort(animals, new AlphabeticalOrder());

		for (String animal : animals) {
			System.out.print(animal + ", ");
		}

		System.out.println();

		Collections.sort(animals, new ReverseAlphabeticalOrder());

		for (String animal : animals) {
			System.out.print(animal + ", ");
		}

		System.out.println();

		////////////////////////// Sorting Integers ////////////////

		// When creating a map or list, put list at the start instead of specific type
		// since then you can interchange between the different types
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(39);
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(16);
		numbers.add(13);
		numbers.add(63);

		System.out.println(numbers);

		// To sort integers, you DON'T need a totaly new class which implements
		// Comparator<variable>. You can simply use an anonymous class!
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}

		});

		for (Integer number : numbers) {
			System.out.print(number + " ");
		}

		System.out.println();

		///////////////////// Sorting original values ////////////////////
		List<Machine> mach = new ArrayList<Machine>();

		mach.add(new Machine(7, "Teach"));
		mach.add(new Machine(8, "Train"));
		mach.add(new Machine(1, "Clean"));
		mach.add(new Machine(2, "Cook"));
		mach.add(new Machine(3, "Fish"));
		mach.add(new Machine(4, "Security"));
		mach.add(new Machine(5, "Laundry"));
		mach.add(new Machine(6, "Gardening"));

		System.out.println();

		for (Machine machine : mach) {
			System.out.println(machine + " ");
		}

//		// This won't work since the person object doesn't have any natural order.
//		//To make it work, supply it with a Comparator interface(anonymous class)
//		Collections.sort(mach);
		Collections.sort(mach, new Comparator<Machine>() {

			// We will sort by largest to smallest id
			@Override
			public int compare(Machine o1, Machine o2) {
				if (o1.getId() > o2.getId()) {
					return -1;
				} else {
					return 1;
				}
			}

		});

		System.out.println();

		for (Machine machine : mach) {
			System.out.println(machine + " ");
		}

		Collections.sort(mach, new Comparator<Machine>() {

			@Override
			public int compare(Machine o1, Machine o2) {

//				You can do this but there is a simpler way shown below
//				String len1 = o1.getTask();
//				String len2 = o2.getTask();
//				return len1.compareTo(len2);

				return o1.getTask().compareTo(o2.getTask());

			}
		});

		System.out.println("");

		for (Machine machine : mach) {
			System.out.println(machine);
		}

		System.out.println("");

		for (Machine machine : mach) {
			System.out.println(machine);
		}

		// Sort integers from smallest to largest. Note that it needs to be variable
		// Integer not int. int is primitive, Integer is not. Yes it is very confusing
		Collections.sort(mach, new Comparator<Machine>() {

			@Override
			public int compare(Machine o1, Machine o2) {

				Integer id1 = o1.getId();
				Integer id2 = o2.getId();
				return id1.compareTo(id2);

			}

		});

		System.out.println("");

		for (Machine machine : mach) {
			System.out.println(machine);
		}

	}

}
