import java.util.ArrayList;
import java.util.List;

//Arraylists are just simplified arrays
public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(100);
		numbers.add(400);

		// Remember that the index starts with 0 not 1
		System.out.println(numbers.get(2));

		System.out.println("First way of iterating(going through) arrayList");
		// Iteration for loop. numbers.size gives how big the arraylist numbers is
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		System.out.println("Second way of iterating through an arrayList");
		// This is another way to iterate(go through) an arrayList. Make sure in the
		// brackets, the first thing you write is the type of the ArrayList. Others ways
		// can work but there is chances for errors to pop up/unwanted outputs
		for (Integer number1 : numbers) {
			System.out.println(number1);
		}

		// ArrayListName.remove can remove values from an arrayList however you need to
		// be careful when removing items from an arrayList because it is a length
		// process sometimes. When adding values, the ArrayList simply adds it to the
		// inner Array. However when deleting, it is easy when it is the last item or
		// the second to last item because that isn't very tasking. However if you
		// delete the first value or near the start, then the ArrayList needs to cut the
		// items, delete the first one, then copy them back 1 space down to fill in the
		// hole that the first value left behind.

		// Importing list interface. ArrayList is an interface. List is an interface so
		// can only have new ArrayList or LinkedList at the right side of equals sign
		List<String> values = new ArrayList<String>();
		
		values.add("d");
		values.add("b");
		
		for(String value: values) {
			System.out.println(value);
		}

		ArrayList<String> strings = new ArrayList<String>();
		strings.add("gib");
		strings.add("hi");
		for (String string:strings) {
			System.out.println(string);
		}
		//Clears an arrayList
		//strings.clear();
//		for (String string:strings) {
//			System.out.println(string);
//		}
		strings.trimToSize();
		for (String string:strings) {
			System.out.println(string);
		}
	}

}
