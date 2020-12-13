import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayLists are faster at adding multiple items into the arrayList compared to Linked lists. However that doesn't matter if your list is small. 
//ArrayLists are faster at adding to end of list, slower for anywhere else. But linked lists don't  care wherever you add it. 

public class App {

	public static void main(String[] args) {

		/*
		 * ArrayList manage arrays internally inside of an arrayList is like [0][1][2],
		 * etc... Therefore getting items from the list is easy. It is also easy to add
		 * items to the end of the list. However if you want to add an item to the
		 * middle of the list, it is much harder, because all the values above it need
		 * to go one space up, then you add in the new value
		 * 
		 * However a linkedListed works different internally. LinkedLists consist of
		 * elements where each element has a reference to the previous and next element.
		 * So in theory linked lists would loko like this. [0]-><-[1]-><-[2]etc...
		 * Therefore to traverse a linked list would be much slower than traversing an
		 * arrayList(getting items from list). You need to move through every single
		 * value, traversing much slower than just finding the item. However when you
		 * want to add an item into the linked list, all it does is say I want this item
		 * to be pointing to here and there so Ill add it here and voila it added the
		 * item much more efficiently than the araryList
		 * 
		 * Therefore most of the time use arrayList. However if you want to add or
		 * remove an item anywhere other than the end of the list, use a linked list	
		 */

		// The basic rule is that if you only want to add or remove items at the end of
		// your list, use arrayList, which is most frequently used. If you want to add
		// or remove items from anywhere in the list, e.g the middle, beginning, etc...,
		// use a linked list. For a normal size list, they both will be quite similar,
		// only for long lists arrayLists are a tiny bit faster
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		// Whenever you see list, you can point it towards a linked list or arrayList
		// because both of those types of list implement the list interface
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}

	// You can put arrayLIst or linked list in place of List interface because both
	// types of list implements the list interface
	private static void doTimings(String type, List<Integer> list) {

		// 1E5 means 1x10^5. I guess that 2E6 would be 2*10^6. This adds items to the
		// arrayLists
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
//		// This will give start a value of how much time it took to run the code in the middle of the two long vairables
//		long start = System.currentTimeMillis();
//		long end = System.currentTimeMillis();
//		System.out.println("Time taken: " + (end = start) + " ms for " + type);

		long start = System.currentTimeMillis();

		/*
		 * // Add items at end of list for (int i = 0; i < 1E5; i++) { list.add(i); }
		 */

//		// Add items anywhere in the list. In this code we see that linked list had
//		// aronud the same amount of time as in adding to end of list. However the
//		// ArrayList took around 8 seconds to add at the start of the list
//		for (int i = 0; i < 1E55; i++) {
//			// This version of add allows yyou to add values anywhere in the list. For
//			// example the zero means values will be added in the first index
//			list.add(0, i);
//		}

		// Adding items to near end of list, arrayList is faster
		for (int i = 0; i < 1E55; i++) {
			// This version of add allows yyou to add values anywhere in the list. For
			// example the zero means values will be added in the first index
			list.add(i);
		}

		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + ((end - start)) + " ms for " + type);

	}

}
