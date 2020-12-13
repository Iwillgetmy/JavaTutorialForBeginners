//This program will be made to read the binary file that was created with our write program

package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {

	public static void main(String[] args) {
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("Mach.txt"))) {

			Machine machine4 = (Machine) os.readObject();
			Machine machine5 = (Machine) os.readObject();
			Machine machine6 = (Machine) os.readObject();

			System.out.println(machine4);
			System.out.println(machine5);
			System.out.println(machine6);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
