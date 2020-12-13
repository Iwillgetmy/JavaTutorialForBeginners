import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//Reading an object that is in binary form is pretty much the same except for one difference. Instead of doing a simple sysout, you need to write the
//special for loop to iterate through the array. in the brackets for the for loop, write, (Class) + (object of class) : object that you set to binary 
//data. It is still very simple and efficient.

public class Read {

	public static void main(String[] args) {

		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("Machine.txt"))) {

			Machine[] machine = (Machine[]) oi.readObject();

			@SuppressWarnings("unchecked")
			ArrayList<Machine> machineList1 = (ArrayList<Machine>) oi.readObject();

			// Instead of a sysout, you need to write this, so it can go through all of the
			// contents inside of the array
			for (Machine machine1 : machine) {
				System.out.println(machine1);
			}

			for (Machine machineList2 : machineList1) {
				System.out.println(machineList2);
			}

			// This will read the integer that was created in the last program. The last
			// program displayed how many objects were in the program
			int num = oi.readInt();

			for (int i = 0; i < num; i++) {
				Machine machine1 = (Machine) oi.readObject();
				System.out.println(machine1);
			}

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
