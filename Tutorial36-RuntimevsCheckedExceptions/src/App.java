//Two basic kinds of exceptions in java. Runtime exceptions and checked exception3s

//Checked exceptions are exceptions that you are forced to handle such as IOException and Thread.sleep like shown below. If you don't handle checked
//exceptions, you won't be able to print out your code

//Runtime exceptions are exceptions that you don't need to handle. Java already knows the exception and will automatically handle it, such as
//dividing a number by 0

//The runtime exception and all of its child classes don't force you to handle them, which is why a try catch isn't needed

//Runtime exceptions are serious and basic fundamental errors in your program. This means that usually, your program can't recover from an 
//exception of this kind. If the program is throwing the runtime exceptions then something is really wrong with the code.

//If wanted, you can CATCH a runtime exception. That will just let you pick what it says in the catch section, or it just prints out a stackTrace

//In brackets of a catch part, if you put Exception it will catch any exception, RuntimeException will catch runtimeExceptions. However there is not
//a checked exception class

//You don't need to memorize ALL of the exceptions when you are a beginner because java automatically tells you which exception it is.

public class App {

	public static void main(String[] args) {

//		// Thread.sleep is a statement that makes the thread of code stop executing for
//		// a certain amount of time. If you put 111 in the brackets, the code will stop
//		// for 111 milliseconds.
//		try {
//			Thread.sleep(111);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}

//		// Variable
//		int value = 7;

//		// When this is outprintted, java automatically gives an error and handles it
//		// because it knows that you can't divide by zero. It says that it is an
//		// exception for class java.lang.ArthimeticException which is a subclass of
//		// java.lang.RUNTIMEexception. The ArthimeticException means that there was a
		// problem with an arthimetic condition
//		value = value / 0;

//		// Below is a null pointer exception exception. It is a null pointer exception 
		// because null is equivalent to nothing for Strings, and there is no length
		// to a null value. (String name).length only works for Strings and prints out
		// how long the String is. e.g if the String = "1234"; String.length would print
		// out 4
//		String text = null;
//		System.out.println(text.length());

//		// Text.length returns amount of characters in String. This is an exception and
//		// will give you an error because the String above points to nowhere. And how 
		// many characters are in nowhere? Exactly. Luckily these exceptions are a
		// simple fix
//		System.out.println(text.length());

		// This will be an arrayOutOfBoundsException, for arrays

		// This array has three different strings
		String[] texts = { "one", "two", "three" };

		// This is a runtime exception called ArrayIndexOutOfBoundsException. It is an
		// exception because there is no String[3] because it starts at String[0]

		// Here, in the catch part you can put any parent class of
		// ArrayIndexOutOfBoundsException + e or ArrayIndexOutOfBoundsException itself
		try {
			System.out.println(texts[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}