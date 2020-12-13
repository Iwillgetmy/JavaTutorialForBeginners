import java.util.HashMap;
import java.util.Map;

public class App {

//After lists, maps are most probably the most useful of the Java Foundation Collection Classes

	public static void main(String[] args) {

		// HashMaps can store 2 different types of values, e.g Integer and string as
		// shown below. For hashmaps, the first value in the brackets is the key, and
		// the second value is the value. The key is what I put for the get method. So
		// for my map below if I were to put map.get(5), it would output Five because
		// that is the value for that statement. Note that a hashmap doesn't contain
		// order
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// To add items to the hashmap write hashmap name.put. Now if I were to write
		// map.get(5), it would show five written in numbers.
		map.put(5, "Five");
		map.put(4, "Four");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(1, "One");

		System.out.println(map.get(1));

		// If you put the same key for another put method, it will override the first
		// put method you did. You can have duplicate values in a map, but you canNOT
		// have duplicate keys
		map.put(1, "f");

		System.out.println(map.get(1));

		// Prints out four because the key 4 has a value of Four
		String text = map.get(4);
		System.out.println(text);

		// If you were to put the key to a value you never created, it will outprint
		// null, like shown below
		System.out.println(map.get(0));

		// For loop to get all values in the HashMap
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			// Entry is the variable I created in between the brackets. The int key
			// and String value are getting the key and value of each item in the hashmap
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ", " + value);
		}

	}

}
