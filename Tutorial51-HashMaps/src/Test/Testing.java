package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		HashMap<Integer, String> ourFamily = new HashMap<Integer, String>();

		ourFamily.put(1, "Praba");
		ourFamily.put(2, "Selvi");
		ourFamily.put(3, "Desh");
		ourFamily.put(4, "Deer-in");
		ourFamily.put(5, "me!");
		
		System.out.println("Do you want to see the 1st, 2nd, 3rd, 4th, or 5th family member?");
		int value = keyboard.nextInt();
		
		switch (value) {
		
		case 1: System.out.println(ourFamily.get(1));
		break;
		case 2: System.out.println(ourFamily.get(2));
		break;
		case 3: System.out.println(ourFamily.get(3));
		break;
		case 4: System.out.println(ourFamily.get(4));
		break;
		case 5: System.out.println(ourFamily.get(5));
		break;
		default: System.out.println("Invalid entry");
		System.exit(0);
		}
		
		for(Map.Entry<Integer, String> fam: ourFamily.entrySet()) {
			int value1 = fam.getKey();
			String val = fam.getValue();
		
			System.out.println(value1 + ", " + val);
		}
		
	}
}
