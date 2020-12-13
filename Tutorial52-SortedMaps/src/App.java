import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

/*
 * WHAT TO KNOW: HashMap: Usually starts off with natural order, however isn't
 * certain and is subject to change TreeMap: Sorts in natural order. E.g for
 * integers 1,2,3 for strings, a,b,c LinkedHashMap: Outprints in order you put
 * the items. So if you put a 9, a and 3,b it will outprint 9,a then 3,b, not
 * the opposite, even if the second key is smaller
 */

public class App {

	public static void main(String[] args) {

		// If you want you could simply put map at the start when instanstiating an
		// object because that is the parent class of alll maps

		// The problem with hashmap is that it doesn't keep the values in a particular
		// order. If you want to keep your values in a particular order, either use a
		// treeMap instead or a LinkedHashMap
		Map<Integer, String> hashmap = new HashMap<Integer, String>();

		// A linked hashmap is the same as a regular hashMap but they keys and values
		// inside the map stay in the same order that you added them in
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// A tree is one of the basic structures in computing/coding. A tree sorts the
		// values that you add to it, usually in the natural order, such as 1,2,3,4,5
		// for integers or a,ab,ac,b for Strings. You can make the code do your own type
		// of natural order, will be learnt in a later tutorial
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		// the number and letter sequence after the at is a hashcode, and is what is
		// used to store items inside of a hashmap
		System.out.println(new Temp());

		// This outprints the values in the method I made below, but in whichever way
		// the type of map chooses
		testMap(hashmap);
		System.out.println();
		testMap(linkedHashMap);
		System.out.println();
		testMap(treeMap);

	}

	// All the collections in the collection framework are organized on various
	// interfaces. The main three are map, list, and set interface. Because each
	// three methods above implement the map interface, you just add Map in the
	// brackets
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "bear");
		map.put(3, "tiger");
		map.put(6, "duck");
		map.put(7, "lion");
		map.put(8, "swan");
		map.put(1, "snake");
		map.put(3, "gorilla");

		// This is another way to iterate through a map. One way is in the hashmap
		// tutorial, where you use entry set
		// Map.keySet returns the collection called set. It is easy to iterate through
		// the collection classes using these types of special for loops. This way is a
		// little more confusing, not as good.
		for (Integer key : map.keySet()) {
			// Getting the key
			String value = map.get(key);

			System.out.println(key + "," + value);

		}

	}

}
