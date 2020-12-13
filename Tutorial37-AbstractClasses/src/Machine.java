//Machine will be the base class in my hierarcy of classes

//If the child classes of machine have something in common that's common to all of the child classes in the hierarchy, then you can add the common
//functionality to the parent class

//You are forcedt o implement/override abstract methods in child classes of the abstract class, but you don't need to override/implement 
//regular methods that have parameters and code written inside of them. However if you want you can

//You can't call abstract methods inside of a normal class[pl

//Because the class is abstract, it you cannot create an object of its type, Machine.
public abstract class Machine {
	private int id;

	// The two methods below don't need to be implemented by subclasses, because
	// they have code written in them
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// An abstract method doesn't have any code written inside, like a method in an
	// interface. If there is a child class, like car or camera, the subclass NEEDS
	// to override or implement the abstract method that was created. The subclass
	// can have certain code specific to the class. Yes, abstract methods can have
	// be of type void or have a return statement, but you won't need to write it
	// inside the abstract class
	public abstract void start();

	public abstract void doStuff();

	public abstract void shutDown();

	// In another method, you can call in the abstract methods you made. Not all of
	// the methods need to be abstract
	public void run() {
		start();
		doStuff();
		shutDown();
	}

}