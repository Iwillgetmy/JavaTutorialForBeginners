import java.io.Serializable;

//The transient keyword is used when you are serializing objects
//REMEMBER TO MAKE THE CLASS SERIALIZABLE!!!!!!

//You DON'T want to serialize more fields than you need to, since that in inefficient. Somtimes, there will be fields that you can't serialize, or if 
//you did serialize it, it would be pretty weird, and example would be if you are using threads. You can prevent fields from being serialized by using
//the transient keyword
//For example if we didn't want to serialize the variable id, even if normally you would want to serialize an id, you put transient in front of the 
//object specifier. Now when we run read objects, instead of reading 7 for the id, which we set it to, it says id=0 because of the transient keyword.
//Basically the transient keyword will read the value for the transient object as the default value, which is 0 for variables, null for Strings, etc..

//Note that the object you create in read object won't use a constructor.

public class Person implements Serializable {

	// SerialVersionUID is the serial number or something for the class. Without
	// initializing the serialVersionUID, your program would work the exact same
	// however if you do initialize it and change the serialVersionUID, then you
	// won't be able to seralize and deSerialize the objects you created
	private static final long serialVersionUID = 4801633306273802062L;

	private transient int id;
	private String name;

	// Because this value is static, every object sees the same field here
	private static int count;

	public Person() {
		System.out.println("Default Constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
		System.out.println("Two-argument constructor");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", count=" + count + "]";
	}
}
