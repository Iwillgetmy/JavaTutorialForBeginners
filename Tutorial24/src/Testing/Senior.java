package Testing;

public class Senior implements Interactions {

	String name;
	
	Senior (String name){
		this.name = name;
	}
	
	@Override
	public void Greeting() {
		System.out.println("Greetings");
	}

	@Override
	public void Bye() {
		System.out.println("Goodbye!");
	}

	@Override
	public void introductions() {
		System.out.println("Greetings, my name is " + name);	
	}

	@Override
	public void showInfo() {
		Greeting();
		Bye();
		introductions();
	}
	
}
