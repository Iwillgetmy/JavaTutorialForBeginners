//You can extend one class to another class. This will make the new class have all of the methods and instance variables, etc... that 
//the old class has. However, private methods, private instance variables, etc... cannot be accessed in the extended class.
//Also, some classes cannot be extended. This also doesn't work in certain circumstances. 
//This allows you to make your own version of the class and you can add more methods to it. You can't extend some classes
//such as the String class because it is a final class. You CANNOT extend a final class. You usually don't override instance variables
//because it is messy.
public class inheritance {

	public static void main(String[] args) {

		Appliance mach1 = new Appliance();

		mach1.start();
		mach1.stop();

		Car car1 = new Car();

		car1.start();
		car1.wipeWindShield();
		car1.stop();

	}
}
