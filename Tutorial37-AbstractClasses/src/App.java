//Abstract classes are something you can use when you want to start creating a class hierarchy, but the base class won't do anything itself, 
//it just acts like a base for other classes

//When you make a child of an abstract class, by having the abstract parent class there you're making a very strong statement about what the child
//fundamentally is. Only child classes have similar methods as the abstract parent class. On the other hand, any class can use an interface. Pretty
//much abstract parent classes are like the identity of child classes. Cars and cameras are machines, which is why the abstract parent class is 
//machine. Abstract classes are much stronger statements. Also, child classes can only extend ONE parent class but multiple interfaces.

//Abstract classes are a great tool to use whenever you are starting a class hierarchy

public class App {

	public static void main(String[] args) {

		// Making camera object, setting id
		Camera cam1 = new Camera();
		cam1.setId(5);

		// Making car object, setting id
		Car car1 = new Car();
		car1.setId(4);

		// What is the point of creating the Machine class, because it is just a base
		// class. There is purpose of having a camera/car, but no exact purpose for the
		// Machine class. Because there is no use, there is a way of not even letting
		// the statement below function, which is making the class abstract. Statement
		// below will NOT work
		// Machine machine1 = new Machine();

		car1.run();

	}
}
