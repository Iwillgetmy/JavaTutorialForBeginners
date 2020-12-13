public class App {
	public static void main(String[] args) {
		
		System.out.println("MAX VALUES FOR EACH PRIMITIVE VALUE:\n");
		System.out.println("MAX NUMBER FOR A BYTE IS: " + Byte.MAX_VALUE);
		System.out.println("MAX NUMBER FOR A SHORT IS: " + Short.MAX_VALUE);
		System.out.println("MAX NUMBER FOR AN INTEGER IS: " + Integer.MAX_VALUE);
		System.out.println("MAX NUMBER FOR A LONG IS: " + Long.MAX_VALUE);
		System.out.println("MAX NUMBER FOR A DOUBLE IS: " + Double.MAX_VALUE);
		System.out.println("MAX NUMBER FOR A FLOAT IS: " + Float.MAX_VALUE + "\n");

		System.out.println("MINIMAL VALUE FOR EACH PRIMITIVE VALUE:\n");
		System.out.println("MINIMUM NUMBER FOR A BYTE IS: " + Byte.MIN_VALUE);
		System.out.println("MINIMUM NUMBER FOR A SHORT IS: " + Short.MIN_VALUE);
		System.out.println("MINIMUM NUMBER FOR AN INTEGER IS: " + Integer.MIN_VALUE);
		System.out.println("MINIMUM NUMBER FOR A LONG IS: " + Long.MIN_VALUE);
		System.out.println("MINIMUM NUMBER FOR A DOUBLE IS: " + Double.MIN_VALUE);
		System.out.println("MINIMUM NUMBER FOR A FLOAT IS: " + Float.MIN_VALUE + "\n");
		
		byte byteValue = 127;
		short shortValue = 55;
		int intValue = 999;
		long longValue = 3242;

		// When writing a float value, put the letter "f" at the end, or it will give
		// you an error, thinking the value is a double not a float. If not just put a
		// cast before the float value
		float floatValue = 553.9f;
		float floatValue2 = (float) 99.3;
		double doubleValue = 32.4;

		// Class version of byte. Shows the max the byte variable can hold. This shows
		// me that if I were to put 128 for a byte value it would give me an error
		System.out.println(Byte.MAX_VALUE);

		// Adding the cast makes the long value an int value. However if the long value
		// is too long, there would be an error because long values are much bigger than
		// int values. You need a cast because this can be an error.
		intValue = (int) longValue;
		System.out.println(intValue);

		/// This works, however there will be a .0 at the end, because doubles NEED to
		/// be decimals. They can't be whole numbers/integers. Because there is less
		/// risk for this to be an error, you don't need a cast
		doubleValue = intValue;
		System.out.println(doubleValue);

		// Because there is a potential for an error/you need to take out decimals, java
		// NEEDS to know you are sure you want to make the float an integer, meaning you
		// need a cast. By the way this won't round down, it will just cut the end off
		intValue = (int) floatValue;
		System.out.println(intValue);

		// This prints out -128, which is the minimal value for a byte. If I were to put
		// 129, it would cast it to -127. Try not to cast to a byte if the number is
		// bigger than 127. It won't work like you would expect it to.
		byteValue = (byte) 128;
		System.out.println(byteValue);

		// You cannot cast from a String to an integer, the statement below won't work
		// intValue = (int) "fesdf";

		// However you can cast from an integer to a String. the statement below WILL
		// work
		// String abc = (String) 1;

	}
}
