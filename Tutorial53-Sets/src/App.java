import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		// A set is a type of collection that stores only unique elements. Hashset
		// doesn't retain order, and will randomly change the order of values at time.
		// At the equals part, make the set equal to a hashset, you can't make it equal
		// to a set for some reason. If you want your values to be ordered in set, do
		// NOT use a hashset. The values wont be in order all of the time. If you want
		// your values to be ordered used a linkedhashset, which will keep the values in
		// the order you put them in
		Set<String> set1 = new HashSet<String>();

		// removeAll method is like the retainAll method, but instead of keeping common
		// elements, it only keeps elements that aren't common
		// retainAll method retains all elements specified in the set, e.g if you put
		// retain all for one set and in brackets put another set, it will only keep
		// values in the set that called method that are common in both Sets

		// The isEmpty checks if the set is empty(has any values stored inside of it)
		if (set1.isEmpty()) {
			System.out.println("Set is empty at start");
		}

		// The linkedhashset, the order will stay the same as they are put in a linked
		// list
		Set<String> set2 = new LinkedHashSet<String>();

		// The treeset will keep the values in natural order.
		Set<String> set3 = new TreeSet<String>();

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");

		// Obviously this won't print out as the set has values stored inside of it at
		// this point.
		if (set1.isEmpty()) {
			System.out.println("This will never be outprinted for this program unless the values are removed");
		}

		set2.add("dog");
		set2.add("cat");
		set2.add("mouse");
		set2.add("snake");

		set3.add("dog");
		set3.add("cat");
		set3.add("mouse");
		set3.add("snake");

		// Adding duplicate items won't work in sets, which is useful if you didn't mean
		// to copy a certain item again. However if you do want two of the same values,
		// then you do not want to use a set.
		set1.add("mouse");

		// Prints out items in the set. Items are surrounded by square brackets
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);

		/////////////////////////////////////// ITERATE
		/////////////////////////////////////// ///////////////////////////////////////
		/////////////////////////////////////// //////////////////////////////////////////

		// This works like the sysout, but outprints the values without square brackets.
		// With this way, you can shape the sysout to make it how you want to display
		// the values inside of the set. E.g add commas 
		for (String element : set1) {
			System.out.print(element + ", ");
		}

		// A big use of sets is to figure out if the set contains a given item. This for
		// loop will check if the set contains the value(String, int, etc..) given. You
		// check if it has a certain value with the contains method
		if (set1.contains("Aardvark")) {
			System.out.println("Contains Aardvark");
		} else {
			System.out.println("Nope");

			//////////////////////////////////// Intersection////////////////////////////
			Set<String> set4 = new TreeSet<String>();

			set4.add("dog");
			set4.add("cat");
			set4.add("mouse");
			set4.add("girrafe");
			set4.add("aardvark");

			// To find out if elements are commom in both sets...

			// Usually you use hashset because it is lightweight
			// Because I put set4 in the brackets, intersection will take the values of set4
			Set<String> intersection = new HashSet<String>(set4);

			// Says they are equal because they are
			System.out.println(set4.equals(intersection));

			// Making the intersection set only keep values that are common in both
			// itself(set4) and set3
			intersection.retainAll(set3);

			// Only prints out common elements
			System.out.println(intersection);

			///////////////////////// Difference of two sets /////////////////////////////
			Set<String> difference = new HashSet<String>(set4);
			
			difference.removeAll(set3);
			
			System.out.println(difference);
			
		}

	}

}
