
public class arrays {

	public static void main(String[] args) {

		// Variable

		int[] values;

		values = new int[3];

		values[1] = 11;

		values[0] = 2;

		values[2] = 5;

		System.out.println(values[2]);

		// Pretty much this does the same thing, but instead of writing number[1] =
		// whatnot, number[2] = whatnot, etc..., it automatically makes those values
		// from largest to smallest.
		// It makes the first number in the colons number[1], the second number[2], and
		// so on.
		int[] numbers = { 5, 6, 7 };
		double[] percentages = { 75.5, 93.5, 49.6, 93.4, 80.9, 92.5, 88.3 };

		for (int j = 0; j < numbers.length; j++) {

			// Make sure you print out number[i] bc if you don't and you put number[1], it
			// will only print out that.
			System.out.println(numbers[j]);
		}

		// The for loop will show all the values inside the array, so value[1], [2], and
		// [3] in order from smallest to largest. That will happen if you put
		// i<values.length
		for (int i = 0; i < values.length; i++) {

			System.out.println(values[i]);

		}

		// Also, if you do like i<4 for example, it will show the variabless from the
		// variable[0] to variable[5], if you run the loop below, it will only show the
		// array variables from percentages[0],
		// through percentages[3], not all the way to percentages[6]
		for (int i = 0; i < 3; i++) {

			System.out.println(percentages[i]);

		}

		// If you wanted to find the highest grade of a class but ur too lazy to look
		// through them all, you can make an array and put it through a loop like this
		double marks[] = { 97.807, 97.587, 97.896, 97.958, 89.496 };

		double bestMark = marks[0];

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] > bestMark) {

				bestMark = marks[i];

			}
			System.out.println(bestMark);
		}
	}
}
