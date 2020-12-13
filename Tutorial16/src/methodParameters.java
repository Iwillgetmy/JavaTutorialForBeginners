class Robot {

	// Method
	public void speak(String a) {
		System.out.println(a);
	}

	// Method
	public void jump(int height) {
		System.out.println("Jumping " + height + " meters.");
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters to the " + direction);
	}
}

public class methodParameters {

	public static void main(String[] args) {

		Robot larry = new Robot();
		larry.speak("Hi I'm Sam!");
		larry.jump(3);
		larry.move("front", 13);

		String greeting = "Hello good sir how do you do?";

		larry.speak(greeting);

		int value = 14;
		larry.jump(value);
	}

}
