package Testing;

public class App {

	public static void main(String[] args) {

		// Variables. If you use the actual variable name e.g double, then it will say
		// true but if you call on the double class it will say FALSE
		Double i = 2.2;
		Double e = 2.2;

		int i1 = 2;
		Integer g = 2;

		System.out.println(i == e);
		System.out.println(i.equals(e));

		// Because I made an Integer variable, I can only call on equals with that
		// because it is a class and contains that variable. However in the brackets you
		// can call on the variable in non-class form
		System.out.println(g.equals(i1));
		System.out.println(g == i1);

	}

}
