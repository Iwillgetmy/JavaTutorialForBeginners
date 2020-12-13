//Recursion is like an algorithm. Recursion is when	you make a method call itself
//Recursion's definition is the repeated application of a recursive procedure or definition. The reason that you shouldn't use recusion too much is 
//because of the risk of stack overflow errors. However in some situations it is very useful to use a recusive method
//Classic example of recursion is to calculate a factorial value, e.g 4!= 4*3*2*1
public class App {

	public static void main(String[] args) {

		//int value = 4;

//		// Can be called without the help of an object because it is static. Even if you
//		// modify the value of value in the method, it will retain its original value
//		// after
//		calculate(value);

		//////////////////////// FACTORIAL EXAMPLE /////////////////////////////////
		
		//Does factorial 3
		System.out.println(calculateFactorial(3));
	}

	// Static has NOTHING to do with recursion but this was made static because an
	// object of type App was not made, and it is nice to use a method directly from
	// within the main method. Also to call a method of a class it NEEDS to be static
	private static void calculate(int value) {

		System.out.println(value);

		// Gives an error. When you call a method within another method, there is a
		// special area of memory in the Java virtual machine called the stack. The
		// stack is used for local variable and for remembering which method called
		// which method so we know where to return after the method is recalled. It's
		// used after method is called, its used for stuff like that.
		// That is distinct from the heap. The heap is an area of memory which is where
		// objects are allocated when you use the new operator. So the stack is a
		// relatively small area of memory that remembers function calls, local
		// variables, etc... The error is called because we are calling this infinitely.
		// However if we provide a way for this to stop calling itself it will NOT give
		// an error
		// calculate(value)

		// If we do this, recursion will stop after it reaches 1
		if (value == 1) {
			return;
		}
		calculate(value - 1);
	}
	
	//Method to calculate factorial of ANY number
	private static int calculateFactorial(int value) {
		if (value <= 0) {
			System.out.println("Invalid number");
			System.exit(0);
		}
		if (value == 1) {
			return 1;
		}	
		
		return calculateFactorial(value-1) * value;
	}
}
