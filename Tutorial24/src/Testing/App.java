package Testing;

public class App {

	// Making method static lets it be used without the need of an object. Because
	// you put interactions in the brackets, you can only put in objects that
	// implement Interactions interface
	public static void showInfo(Interactions into) {
		into.showInfo();
	}

	public static void main(String[] args) {
		Senior senior1 = new Senior("Robert");
		middleAge mhm = new middleAge("Garry");
		Baby baby1 = new Baby("Caleb");

		Interactions person1 = new Baby("caleb");
		// This will print out the baby's line because it points towards baby object
		person1.Bye();

		showInfo(senior1);

	}
}
