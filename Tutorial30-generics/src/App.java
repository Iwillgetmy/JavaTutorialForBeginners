import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;  

//MAKE SURE YOU ADD THE RIGHT IMPORTS

//A generic class is a class that can work with other objects. You specify which type of objects the class can work with, when you instantiate
//a class and create objects for a class.

class Animal {

}

public class App {

	public static void main(String[] args) {
				
		//////// Before java 5 ///////////

		// This is an object that can litterally STORE other objects
		ArrayList list = new ArrayList();

		list.add("apple");
		list.add("banana");
		list.add("orange");

		// You need to cast it to a String. This prints out the first String in the
		// arraylist. Put different number in parantheses for different object
		String fruit = (String) list.get(1);

		System.out.println(fruit);

		/////////// Modern Method ///////////////

		// Generic class. This makes an array list for String variable. This way doesn't
		// give an error because you specified a type
		ArrayList<String> strings = new ArrayList<String>();

		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");

		String animal = strings.get(1);
		System.out.println(animal);
		
		///////////////////// There can be more than one type argument /////////////////////////////
		
		//Parameterized class
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Instead of doing objectName.add, you do objectName.put for hashMaps
		map.put(1, "boi");
		map.put(3, "girl");
		
		// For hashmaps, each variable gets its own number, so zero won't be both 1 and 
		//"boi"
		String yes = map.get(2);
	
		//Print out everything in a hashmap
		System.out.println(map);
		
		System.out.println(yes);
		
		////////////////// Java 7 style ////////////////
		
		// You can store class names in the triangle brackets. If you put empty 
		//triangle brackets at the end like below, the list will still be a 
		//list of class animals but java will infer what type you want to put
		//in your list if you declade a varaible of an appropriate class
		ArrayList<Animal> someList = new ArrayList<>();
		
		Animal dog = new Animal();
		Animal cat = new Animal();
		
		someList.add(dog);
		someList.add(cat);
		
		//Do this to outprint everything in an arraylist
		System.out.println(someList);
		
		Animal bob = someList.get(0);
		System.out.println(bob);
		

	}
}
