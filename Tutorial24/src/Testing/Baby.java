package Testing;

public class Baby implements Interactions {

	String name;
	
	Baby(String name){
		this.name = name;
	}
	
	
	@Override
	public void Greeting() {
		System.out.println("Goo goo gaga");
		
	}

	@Override
	public void Bye() {
		System.out.println("Gaga goo goo");
		
	}

	@Override
	public void introductions() {
		System.out.println("Goo gaga goo " + name);
		
	}


	@Override
	public void showInfo() {
		Greeting();
		Bye();
		introductions();
	}

}
