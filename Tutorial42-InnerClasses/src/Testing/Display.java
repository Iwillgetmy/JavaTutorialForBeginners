package Testing;

public class Display {

	public static void main(String[] args) {

		Human person = new Human("Bob", "his");
		person.greet("lalalalala");

		Human.arms arms = new Human.arms();
		arms.moveArms();

		//Making anonymous class form an inner class
		Human.arms armss = new Human.arms() {
			
			@Override
			public void moveArms() {
				System.out.println("ARMS ARE MOVING");
			}
		};
		
		armss.moveArms();
		
		// When you instanstiate a non-static inner class, you need to put an object of
		// type enclosing class before the new, and enclosingclass.class name at the
		// start instead of just class name
		Human.Legs legs = person.new Legs();
		legs.move();
		
	}

}
