import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {

	private int id;
	private String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "(id=" + id + ", name=" + name + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

//When you outprint original values(a class you made), the variables inside can be the same, and the Map will still outprint each object, as long as 
//the object name is different. However if you re-enter an object, then it will be overwritten in a Map or ignored in a set.
//To make that happen, you need to insert a hashcode and equals method in your class. When generating equals and hashcode, it will know that
//the objects are equal, and won't re-print them

public class App {

	public static void main(String[] args) {

		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(1, "Sue");
		Person p4 = new Person(3, "Mike");

//		// Keys are unique, there can't be two of the same kind. If you put another
//		// element with the same key, the new one will overwrite the old one
//		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
//
//		map.put("one", 1);
//		map.put("two", 2);
//		map.put("three", 3);
//		map.put("four", 4);
//		// Keys cannot be duplicated so this does will overwrite original
//		map.put("one", 1);
//
//		for (String key : map.keySet()) {
//			System.out.println(key + ": " + map.get(key));
//		}

		Map<Person, Integer> personMap = new LinkedHashMap<Person, Integer>();

		personMap.put(p1, 1);
		personMap.put(p2, 2);
		personMap.put(p3, 3);
		personMap.put(p4, 1);

		// When outprinted there are two Sue's, which you don't want for a map
		for (Person key : personMap.keySet()) {
			System.out.println(key + ": " + personMap.get(key));
		}

//		//Like the element of a map, except no key
//		Set<String> set = new LinkedHashSet<String>();	
//		
//		set.add("dog");
//		set.add("cat");
//		set.add("mouse");
//		set.add("bear");
//		set.add("wolf");
//		
//		System.out.println(set);

		Set<Person> personSet = new LinkedHashSet<Person>();

		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);

		// When outprinted there are two Sue's, which you don't want for a set
		System.out.println(personSet);

	}

}
