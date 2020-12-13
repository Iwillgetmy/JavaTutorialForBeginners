class Thing {

	public String name;
	private int THING_ID;

	// This is another static method. The final next to public means that this
	// method is in the final state and cannot be changed.
	// Final is java's version of constant. The LUCLY_NUMBER method is the same type
	// of mathod as Math.PI. I don't think constants have parameters
	public final static int LUCKY_NUMBER = 7;

	// Static variables like the one below means that each object doesn't get it's
	// own copy. The variable belongs to the class. Each object
	// (thing1, thing2, will have same value for description). You need to call them
	// with the main class, not the obect
	public static String description;

	// This method needs to be static void because it is the info of all Thing
	// objects in the Thing class. Static method can NOT output instance
	// Variables such as public String name or anything that isn't Static(most
	// probably)
	public static void showInfo() {
		System.out.println(description);
		// System.out.println(name); THIS WON'T WORK!!!
	}

	// Static variables can also be useful to find out how many objects you have
	// created under the class
	public static int count = 0;

	// This constant will help figure out how many objects you made.
	public Thing() {
		// This will make count go up each time a new object is created!
		count++;
		
		//This will assign each new object a unique ID
		THING_ID = count;
		
	}

	public void showName() {
		// However you can add a static variable, such as description to a non-static
		// method such as show name.
		System.out.println("Object ID: " + THING_ID + ", " + description + ": " + name);
	}

}

public class staticAndFinal {

	public static void main(String[] args) {

		System.out.println("Before creating objects, there are " + Thing.count + " objects");
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("After creating objects, there are " + Thing.count + " objects");

		thing1.name = "Bob";
		thing2.name = "Sue";
		Thing.description = "I am a thing";

		thing1.showName();
		thing2.showName();
		Thing.showInfo();

		// Outprints pi. Math.PI is a constant, so it cannot be changed. If you were to
		// write Math.PI = 3 then you would get an error from the IDE
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);

	}
}