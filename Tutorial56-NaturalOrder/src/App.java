import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

//NEVER FORGET to pass your own values to a set you need to create hashcode and equals method

class Person implements Comparable<Person> {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	// Works like the compare method in the Comparator interface. It compares two
	// values. If smaller return -1, if larger return 1. This method says that the
	// natural order is defined for name. So from smallest to largest in
	// alphabetical order first letter. Obviously do reverse by putting in -
	public int compareTo(Person person) {
		// Sorts in alphabetical order first letter
		// return name.compareTo(person.name);

		// Returns in length of name
		Integer length1 = person.name.length();
		Integer length2 = name.length();

		if (length1 > length2) {
			return -1;
		} else if (length1 < length2) {
			return 1;
			// This statement says that if they are equal length, check for alphabetical
			// order first letter.
		} else {
			return name.compareTo(person.name);
		}

		// This WON'T work because if two names of the person object are the same
		// length, the one which was compared first will stay while the other one will
		// be disregarded because in sets, you can only have one of the same set, there
		// can't be any repetition. Therefore if they both are put in the same place,
		// the one which was there first will stay. This will however work for an
		// arrayList just fine
		// return length1.compareTo(length2);

	}

}

public class App {

//Tutorial on natural order. Looking at natural order in sorting arrays, and in tree sets/maps. Also looking at how to define natural order for your 
//own classes

	public static void main(String[] args) {

//		// Will sort in natural order. Alphabetical for strings and numerical for
//		// integer, double, etc...
//		List<String> list = new ArrayList<String>();
//
//		// Tree maps and sets store keys in natural order, automatically sorts them. If
//		// you want to emphasize that the map is sorted, use SortedSet instead of Set.
//		SortedSet<String> set = new TreeSet<String>();
//
//		// Adding elements to the list and the set
//		addElements(list);
//		addElements(set);
//
//		// Showing elements in the list and the set. Collections.sort will automatically
//		// sort in natural order. To sort in your own way, put a comma after the list,
//		// and write new Comparable. As long as elements in list have a defined natural
//		// order, a regular Collections.sort will work. Note that if you create your own
//		// type it wont work on it
//		Collections.sort(list);
//		showElements(list);
//
//		// As you see this is automatically sorted in natural order because of the tree
//		// set
//		showElements(set);

		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();

		// STATIC METODS DON'T NEED TO BE CALLED
		addElements(set);
		addElements(list);

		showElements(set);
		System.out.println();
		Collections.sort(list);
		showElements(list);

	}

//	// To add same elements to the set and list above, we are using a method
//	private static void addElements(Collection<String> type) {
//		type.add("Bob");
//		type.add("Sue");
//		type.add("Juliet");
//		type.add("Jack");
//		type.add("Alex");
//	}
//
//	private static void showElements(Collection<String> type) {
//		for (String element : type) {
//			System.out.print(element + ", ");
//		}
//		System.out.println();
//	}

	private static void addElements(Collection<Person> type) {
		type.add(new Person("Birkensmith"));
		type.add(new Person("Abe"));
		type.add(new Person("Juliet"));
		type.add(new Person("Stella"));
		type.add(new Person("Alex"));
	}

	private static void showElements(Collection<Person> type) {
		for (Person person : type) {
			System.out.println(person);
		}
	}

//If you want to pass a list or a set to a method, and you dont know if it will be a 
//list or set, you need to use the Collection interface, since both implements the
//Collection interface, which is like the parent interface of them both. You can't 
//really use the Collections interface to add, remove elements, etc... but it is 
//useful in a case like the one right above

}
