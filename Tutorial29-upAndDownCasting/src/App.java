//Upcasting/down casting and casting in general is a thing you do with variables, and once you creted an object, like an object with type Machine
//or camera, those objects will always be what they start as. The machine will always be a machine and a camera will always be a camera. But you can
//change the variable that refer them from one type to another. Like you can turn machine into a camera. That would be upcasting.

//Upcasting is safe. Downcasting is NOT safe on most occaissions. You need to make sure you are refering to the right object when downcasting.
//You can NOT downcast between unrelated types, non extended classes.	

class Machine {

	public void start() {
		System.out.println("Machine started.");
	}

	public void meh() {
		System.out.println("MEH");
	}
}

class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera started.");
	}

	public void snap() {
		System.out.println("Photo taken");
	}

}

public class App {
	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		machine1.start();
		camera1.start();
		camera1.snap();

		// Upcasting. You can set a parent class to a child class. However, because
		// camera1 refers to the camera object, you can refer the new machine object to
		// camera1. This is upcasting because it went up from the hierarchy of the
		// classes, because camera is lower than machine.
		Machine machine2 = camera1;

		// This prints out Camera started because this object refers to the Camera
		// class
		machine2.start();

		// This won't work because the variable decides which methods can be called. The
		// snap method isn't in the Machine class, meaning that it won't work
		// machine2.snap();

		// However this wil work because the method IS in the machine class
		machine2.meh();

		// Downcasting. There will be an error when trying to make a camera object refer
		// to a machine3 variable. Java wants to know you want to do that, and like in
		// the casting tutorial, this means that we will need to cast.
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.snap();
		camera2.start();
		camera2.meh();
		
		// This won't work because you can't call camera objects when referring to the
		// Machine class. You can't call child objects when referring to the parent
		// class. In fact this just wont work.
		Machine machine4 = new Machine();
		Camera camera3 = (Camera) machine4;

		// These gives an exception. It doesn't work because you can't call camera
		// objects when referring to the Machine class, the parent class.
		// camera3.start();
		// camera3.snap();

	}
}
