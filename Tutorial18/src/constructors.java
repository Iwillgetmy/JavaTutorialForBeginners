class Machine {
	private String name;
	private int code;
	
	    //Parameterless constructor
		public Machine() {
			
			//The code below calls on the complex constructor, and sets the instance variables to the default. It is shorter to initialize the variables
			//like that. "This" means the constructor. This always needs to be the first thing in a constructor.
			this("Bob", 0);
			
			//Setting instance variables to default values
			System.out.println("Default constructor running");

			
			
		}
	
	public Machine(String newName) {
		System.out.println("Constructor running");
		
		//Setting instance variables to what user wants
		name = newName;
		code = 0;
		
	}
	
	public Machine(String newName, int newCode) {
		System.out.println("Complex constructor running");
		
		//Setting instance variables to what user wants
		name = newName;
		code = newCode;
		
	}


	
	
}

public class constructors {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Arnie");
		Machine machine3 = new Machine("Bill", 6);
		
		

	}

}
