class Buble {

	public String name;
	private int id;

	public Buble(int id, String name) {

		// Making instance variable what user wants
		this.id = id;
		this.name = name;

	}

	public String toString() {
		
		//TO STRING METHOD IS VERY USEFUL FOR DEBUGGING

		// Like in the stringBuilderAndStringFormatting class, this is special
		// formatting. It is very efficient and uses a very minimal effort to write
		return String.format("%-4d: %s", id, name);

		// return id + ": " + name;. THIS IS INEFFICIENT BECAUSE IT USES MANY STRING
		// OBJECTS. USE STRING BUILDER INSTEAD

		/*
		 * StringBuilder sb = new StringBuilder();
		 * sb.append(id).append(": ").append(name);
		 * 
		 * //This returns the StringBuilder in a String representation return
		 * sb.toString(); Another way of returning this in a more efficient manner is...
		 */

	}
}

public class toString {

	public static void main(String[] args) {

		// The object class is like the parent of all classes. Object is already created
		// Cntrl return gives all of the suggestions in a class, and more
		Object obj = new Object();

		Buble Buble1 = new Buble(7, "Bob");
		Buble Buble2 = new Buble(5, "ROGER");

		// As you can see, when you type frog1., it will give a list of suggestions and
		// methods because the frog class inherited all of that from the primordial
		// class,
		// the object class.

		// This will print out hello because it will automaticaly invoke the toString
		// method to get a String representation of the object. If you don't have a
		// toString method defined, it will print out the class name, an @ sign, and a
		// hashcode. For this Buble class, is will outprint... Buble@15db9742
		System.out.println(Buble1);
		System.out.println(Buble2);
		
		

		// The use for the toString method is to create a String representation of your
		// object, which helps with debugging
	}
}
