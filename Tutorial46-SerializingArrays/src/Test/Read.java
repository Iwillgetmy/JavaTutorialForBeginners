package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Read {

//Syntax to read binary form of arrayList is the same as to read a regular array
//When you are individually reading the contents of an arary or array list, in the for loop you add the machine you will create and sysout all in the 
//for loop
	
	public static void main(String[] args) {
		
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("people.bin"))){
			
			Person[] people = (Person[]) os.readObject();
			
			@SuppressWarnings("unchecked")
			ArrayList<Person> person = (ArrayList<Person>) os.readObject();
		
			for(Person people1: people) {
				System.out.println(people1);
			}
		
			for (Person person1: person) {
				System.out.println(person1);
			}
			
			int num = os.readInt();
			
			for(int i = 0; i<num; i++) {
				@SuppressWarnings("unchecked")
				Person person2 = (Person) os.readObject();
				System.out.println(person2);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
