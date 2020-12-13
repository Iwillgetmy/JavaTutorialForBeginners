package Testing;

public class middleAge implements Interactions {

	String name;
	
	middleAge(String name){
		this.name = name;
	}
	
	@Override
	public void Greeting() {
		System.out.println("Hello");
	}

	@Override
	public void Bye() {
		System.out.println("See you next time!");
		
	}

	@Override
	public void introductions() {
		System.out.println("Hello, my name is " + name);
	}

	@Override
	public void showInfo() {
		Greeting();
		Bye();
		introductions();
		
	}

}
