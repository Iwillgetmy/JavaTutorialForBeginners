//This is a java 7 language feature
//This tutorial will be similar to the last code I wrote, but much more simplified, because last time, there were many catch blocks and nested 
//try catches, etc...

//The autocloseable interface makes sure you have a close method called close. It is a pre made interface. If you hover your mouse over the name
//of  the interface, it will show the definition of the interface, and methods in the interface
class Temp implements AutoCloseable {

	@Override
	// This throws an exception because close methods need an exception for some
	// reason
	public void close() throws Exception {
		System.out.println("Closing!");
		//Even if you throw an exception, closing will be printed out
		throw new Exception("ono");
	}

}

public class App {

	public static void main(String[] args) {

		// This is try with resources, it works like the part below but it is better.
		// This statement will print out, closing, because we declared the AutoCloseable
		// object inside of a try. That makes it print out the method in the
		// AutoCloseable interface
		try (Temp temp1 = new Temp()) {

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		// Because it throws an exception in the class, you need to throw it in the main
//		// method/put it in a try catch	 
//		try {
//			temp1.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
