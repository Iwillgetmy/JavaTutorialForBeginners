
public class stringBuilderAndStringFormatting {

	public static void main(String[] args) {

		// All below untill the sysout is inefficient
		String info = "";

		// Everytime we add stuff to info, we aren't adding stuff, we are creating new
		// Strings. Yes it is very confusing!
		info += "My name is Bob";
		info += " ";
		info += "I am a builder";

		System.out.println(info);

		// String builder object. It is more efficient because we are adding text to the
		// Strinbuilder, not creating new Strings each time. It is
		// MUCH more efficient than creating new Strings each time
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Sue");
		sb.append(" ");
		sb.append("I am a lion tamer");

		System.out.println(sb);

		// New string builder. Even easier because you only need to add a semicolon when
		// you are done adding text, to at the end. Also, you only
		// write the StringBuilder object's name at the start. You don't need to add the
		// name for the others untill you start a new chain.
		// This is chaining all of the methods.
		StringBuilder s = new StringBuilder("");

		// String buffer class is a safer, non-threat way of String builder

		// Chain
		s.append("My name is Roger.").append(" ").append("I am a skydiver");
		System.out.println(sb);

		///////// Formatting //////////////////////////////////////////////

		// \n makes a new line. \t makes a tab. System.out.println makes a new line at
		// the end automatically. System.out.print doesn't.
		// System.out.printf prints the text in some special formatting. If you put a %d
		// in a System.out.printf, it acts like a place holder. It will
		// take the value of the number outside of the quotation marks. However there
		// needs to be the same amount of %d's as numbers outside of
		// the quotation marks. If you were to put a number in front of the d such as a
		// 10, it would put 10 spaces between the number replacing the %d and the text
		// before the %d. If you put a negative number it puts a space between number
		// replacing %d and text AFTER %d
		System.out.print("Here is some text.\t That was a new tab. \n That is a new line");
		System.out.println(" More text");

		// Formatting integers
		System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);
		System.out.printf("Total cost %-10d; quantity is %d", 5, 120);

		for (int i = 0; i < 20; i++) {
			// The %2d makes all the text alligned
			System.out.printf("%-2d: some text here\n", i);
		}

		// %s is the exact same as %d but it is for Strings. Formatting strings
		System.out.printf("%s", "here is some text\n");

		// One of the most important is %f, which is a floating point value. Formatting
		// floating point values. This one is special because it helps with rounding
		// numbers.
		// If you have a giant decimal but only want it for 2 decimal places, you just
		// put %.2f in a System.out.printf. If you only want 3 decimals places you put
		// %.3f. And so on... Below is an example. It will round up and down
		System.out.printf("Total value: %3.2f\n ", 5.6452432);
	}
}
