class bicycle{
	
	//Instance variables (data or "state")
	//Below you find some of the characteristics of a bike
	String type;
	String color;
	double speed;	
	int gear;
	boolean brakes;
	
	
	//Classes can contain...
	//1. DATA
	//2. SUBROUTINES (methods)
	
	//Below is a method in the bicycle class. It makes the bicycle accelerate
	void accelerate() {
		
		//Making speed higher
		for(int i = 0; i>2; i++) {
			
			speed++;
			
		}

	}
	
	//This method makes the bike immobile
	void stop() {
	
		brakes = true;
		speed = 0;
	
	}	
	
}

public class classesAndObjects {

	public static void main(String[] args) {
		
		//Setting some of the instance variables
		bicycle yes = new bicycle();
		yes.color = "blue";
		yes.speed = 17.3;
		
		//Making new bicycle object
		bicycle no = new bicycle();
		no.type = "broken";
		no.gear = 0;
		
		System.out.println(no.gear);
		
		

	}

}
