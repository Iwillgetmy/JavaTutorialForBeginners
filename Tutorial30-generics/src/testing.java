import java.util.ArrayList;
import java.util.HashMap;

public class testing {
	
	public static void main(String[] args) {
	ArrayList<String> elements = new ArrayList<String>();
	
	elements.add("Fire");
	elements.add("Water");
	elements.add("Earth");

	System.out.println(elements);
	
	String water = elements.get(2);
	System.out.println(water);
	
	HashMap<Integer, Boolean>  mhm = new HashMap<Integer, Boolean>();
	
	mhm.put(1, true);
	mhm.put(2, false);
	
	System.out.println(mhm);

	ArrayList<testing> test = new ArrayList<testing>();
			
	test.add(new testing());
	
	System.out.println(test.get(0));
	
	}
}
