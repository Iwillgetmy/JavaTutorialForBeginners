//Extending means that car is similar to Appliance in this case. This means that the car class will now have any 
//methods that the appliance class has. If you create more methods in the car class, it will have the same methods 
//as the Appliance class and more. It is like saying a car is a type of machine. It has all of 
//These aspects and even more. ONLY OVERRIDE METHODS. You can override instance variables
//but it is messy and unneeded
public class Car extends Appliance {

	// This is overriding a method because I took a method from the class I extended
	// this one from, and modified what happens in the method. This method has
	// overriden the method in the "parent" class. The override annotation says that
	// it is an overridden method. However if it isn't an overridden method and you
	// put the override annotation, it will give you an error.
	@Override
	public void start() {
		System.out.println("Car started");
	}

	// The appliance class will not have the wipeWindshield method because the car
	// class doesn't extend Appliance class
	public void wipeWindShield() {
		System.out.println("Wiping windshield...");
	}

	// There is a shortcut to find methods in the "parent" class. You right-click,
	// click source, then click Override, implement methods. I will do this with the
	// stop method.
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void showInfo() {
		System.out.println(name);
	}

}
