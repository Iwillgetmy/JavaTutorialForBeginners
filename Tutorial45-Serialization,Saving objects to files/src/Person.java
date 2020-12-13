import java.io.Serializable;

//Serialization is, if you take an object and you serialize it, it means turning the object into binary form, taking binary data. And if you 
//de-serialize an object, it means taking binary data and turning it back into an object

//I created two SEPERATE files to do both read and write objects from a file, however usually reading and writing would both be in the same program

//You can use serialization to implement saving and loading functionality in your program which in quite useful

//To help remember which goes where, InputStream goes into the program to read objects and Output stream goes into the program to write objects. It is
//like that because you are inputting it inside of the program when you read it, and taking it out(outputting) of the program when you write it

//To make this class serializable, you need to implement the serializable interface called Serializable. The interface doesn't have any methods, but 
//it makes a class serializable.

//When you implement serializable, java gives an error saying. The serializable class Person does not declare a static
//final serialVersionUID field of type long. To dismiss the error just write add generated serial ID.
public class Person implements Serializable {

	// If we were to change the serialVersionUID, we won't be able to read the file,
	// because the file was written with this specific serial id. You can ONLY read
	// a class if it has the same serialVersionUID as the class type of the object
	private static final long serialVersionUID = 4801633306273802062L;
	// Instance variables
	private int id;
	private String name;

	// Parameter constructor
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// toString method
	@Override
	public String toString() {
		return "Person [id = " + id + ", name = " + name + "]";
	}
}
