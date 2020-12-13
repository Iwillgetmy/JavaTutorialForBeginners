//What nested classes are most often used for is to logically group bits of outer classes, so in the robot class, it can have other classes that 
//accesses its contents such as brain, legs, etc... We can group those different parts by using inner classes

//Non-static inner classes(classes declared inside another class that isn't static) are used when you need to group together some functionality, and
//you need the class to have access to the instance variables of the enclosing class

//Static inner classes(clsses declared inside another class that IS static) are used where you want a normal class that isn't associated with 
//instances of the enclosing class, but for some reason you want to group it with the outer class

public class App {

	public static void main(String[] args) {

		Robot robot = new Robot(7);
		robot.start();

		// To make a brain object, you need to but the enclosing class name.inner class.
		// You can't call it on its own. However this only works if the inner class has
		// at LEAST package level accessibility.
		Robot.Brain brain = robot.new Brain();
		brain.think();

		Robot.Battery battery = new Robot.Battery();
		battery.charge();
			
	}
}
