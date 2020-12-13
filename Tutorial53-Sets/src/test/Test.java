package test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("bob");
		set.add("larry");
		set.add("garry");
		set.add("sue");
		set.add("linda");
		set.add("ariadne");
		
		Set<String> set2 = new TreeSet<String>(set);
		
		if(set2.isEmpty()) {
			System.out.println("No values at the moment");
		}
		
		//Prints how many elements there are
		System.out.println(set2.size());
				
		set2.add("harry");
		set2.add("melinda");
		
		Set<String> same = new HashSet<String>(set2);
		
		same.retainAll(set);
		
		System.out.println(same);
		
		Set<String> different = new HashSet<String>(set2);
		
		different.removeAll(set);
		
		System.out.println(different);
		
		if(set.contains("bob")) {
			System.out.println("Bob is here");
		} else {
			System.out.println("Bob isnt here");
		}
		
		//Clears all elements in set
		different.clear();
		
		System.out.println(different);
		
	}
	
}
