	import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

//Writing an array into binary form is the exact same as doing it for an object
//It is the same for an arrayList

public class Write {

	public static void main(String[] args) {

		// If you think about it, an array in Java is an object. Arrays are serializable
		// as long as the objects that they contain are also serializable
		Machine[] machine = { new Machine(1, "Bob"), new Machine(2, "Sally"), new Machine(7, "Mike") };

		// Arrays.asList converts the array you made above into an arrayList. In the
		// brackets here I put the array I made above. However if you didn't create an
		// array before or you want a new arrayList, just create a new one
		ArrayList<Machine> machineList = new ArrayList<Machine>(Arrays.asList(machine));

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Machine.txt"))) {

			os.writeObject(machine);
			os.writeObject(machineList);

			// Arraylist name.size method will write in the file the number of objects we
			// are going to write
			os.writeInt(machineList.size());

			for (Machine machine1: machineList) {
				os.writeObject(machine1);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}