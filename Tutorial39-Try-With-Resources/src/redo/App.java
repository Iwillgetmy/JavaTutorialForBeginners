package redo;

//Implementing an interface that makes sure the class has a close method inside of it
class Temp implements AutoCloseable { 

	
	@Override
	// Throws exception because closing items in java can result in exception/errors
	public void close() throws Exception {
		System.out.println("Closing");
		//Even if you throw an exception like below, the code above will print
		throw new Exception("Oh no");
	}



}

public class App {

	public static void main(String[] args) {

		// A moderinized way to handle an exception which is much more efficient is to
		// just put the new object declaration inside brackets in the try part of it.
		// This is called try with resources. In try with resources, you can declare an
		// assign variables, classes etc...This code below calls the close method.
		// This happens because when you write new, you implement whatever interfaces
		// the class implemented. Because it technically implements autocloseable, 
		try (Temp temp = new Temp()) {

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
//		//Throws error because you need to handle the exception it gives
//		try {
//			temp.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
