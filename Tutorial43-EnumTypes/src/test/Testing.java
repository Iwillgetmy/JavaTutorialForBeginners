package test;

public class Testing {

	public static void main(String[] args) {

		Person person = Person.Bob;

		switch (person) {
		case Bob:
			System.out.println("Bob");
			break;
		case Jason:
			System.out.println("Jason");
			break;
		case Larry:
			System.out.println("Larry");
			break;
		default:
			break;

		}

		System.out.println(Person.Bob instanceof Enum);

		System.out.println(Person.Jason instanceof Person);

		// Prints out name
		System.out.println(Person.Jason.name());

		System.out.println(Person.Larry.getHeight());

		Person.Larry.setHeight(7.2);

		// Changed height of larry
		System.out.println(Person.Larry.getHeight());

		Person person2 = Person.valueOf("Larry");
		System.out.println(person2);

		// Seeing which class they are in
		System.out.println(Person.Bob.getClass());
		System.out.println(Person.Jason.getClass());

		// Gets index where created. Bob was created first so it gets 0.
		System.out.println(Person.Bob.ordinal());

		// Will get height of second one declared. However this is quite useless
		System.out.println(Person.Larry.Bob.getHeight());

	}
}
