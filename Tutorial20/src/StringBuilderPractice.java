
public class StringBuilderPractice {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		// Make sure you add spaces
		sb.append("hi");
		sb.append(" how");
		sb.append(" are");
		sb.append(" you?");

		System.out.println(sb);

		System.out.println("Hello, new line incoming \nnew line made");
		System.out.println("Hello, making a tab \ttab made");
		System.out.print("New line won't be made");
		System.out.println(" see?");

		System.out.printf("Hello %d", 1);

		// Alligns number. %d acts as a placeholder for integers
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%-2d: some text\n", i);
		}

		// %s works the same but for strings
		System.out.printf("Hello, %s", "bob\n");

		// %f is most useful, as it works for decimals. Helps with rounding. Put a
		// period, then how many numbers you want to round to after percentage mark like
		// this... %.2f
		System.out.printf("Rounding number: went from " + 39.2342 + " to: %.2f\n", 39.2342);

		// deleteCharAt deletes the character at the nunmber you put
		sb.deleteCharAt(2);

		System.out.println(sb);

		// delete deletes the characters in the amount of space you picked. So if you
		// put 0, 100 in the brackets, it will likely delete everything
		sb.delete(2, 4);

		System.out.println(sb);
		
	}

}
