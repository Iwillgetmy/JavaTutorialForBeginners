//Encapsulation means that you hide the inner workings of a class inside that very class.
//You stop people from outside the class from getting the "guts" of the class.
//Use getters and setters to let people set or get to those inner workings

//To easily create getters and setters, go to source, click generate getters and setters,
//then tick the variable you want the getters and setters for and press enter.

class Plant {

	// Instance variables are usually private. They SHOULD be private
	private String name;

	// This instance variable can be exposed, but it is constant and can't be
	// changed outside of the class. Static means that it belongs specifically to
	// the class and not outside of it. These variables need to be initialized
	// once created. They can NOT be left un-instanstiated
	public static final int ID = 7;

	public String getData() {
		String data = "some stuff 	" + calculateGrowthForecast();

		return data;
	}

	// This method is only accessible in the class because it is private. It is
	// encapsulated and protected from being used outside of the class
	private int calculateGrowthForecast() {
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class App {
	public static void main(String[] args) {

	}
}
