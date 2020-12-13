public class stringArrays {

	public static void main(String[] args) {

		// You need to initialize a string array like this if you want
		String[] words = new String[3];

		// String arrays
		words[0] = "hi";
		words[1] = "bob";
		words[2] = "how";

		// Or do this

		String[] animals = { "zebra", "ape", "girrafe", "monkey" };

		// Doing this for loop will show all of the things inside a String array when
		// the new variable is outprinted because java will set the new variable(animal)
		// to the contents in the
		// array animals
		for (String animal : animals) {

			System.out.println(animal);

		}

		// If a variable starts with a lowercase that means it is a primitive variable,
		// such as int
		int value = 0;

		// If the variable starts with an uppercase that means it is non-primitive, such
		// as String. The upper-case also means that String is a class. This goes for
		// all variables with an uppercase
		// Null means zero for String
		String text = null;

		// If you initialize a string, the values for the arrays wil automatically be
		// set to zero
		String[] texts = new String[2];
		System.out.println(texts[0]);

		texts[0] = "1";

	}
}