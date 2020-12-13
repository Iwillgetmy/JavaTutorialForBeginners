
//Normal classes cannot have abstract methods
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff in car");		
	}

	@Override
	public void shutDown() {
		System.out.println("Shutting down car...");
	}
	
}
