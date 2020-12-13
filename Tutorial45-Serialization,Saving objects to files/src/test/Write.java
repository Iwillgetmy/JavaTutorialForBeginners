package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {

	public static void main(String[] args) {

		Machine machine1 = new Machine(7, "Cooking");
		Machine machine2 = new Machine(5, "Driving");
		Machine machine3 = new Machine(6, "Cleaning");

		try (ObjectOutputStream oi = new ObjectOutputStream(new FileOutputStream("Mach.txt"))) {

			// Writing objects inbinary for the text file. Creates the text file
			oi.writeObject(machine1);
			oi.writeObject(machine2);
			oi.writeObject(machine3);

			//Catching exceptions
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
