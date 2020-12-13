package Testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	
	//MAKE SURE THAT if you are creating many files in the same folder, the files all have different names
	
	public static void main(String[] args) {
		
		File file = new File("test2.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			
			//Making file
			bw.write("Hello");
			bw.newLine();
			bw.write("SIMPLE!!!");
			bw.newLine();
			bw.write("I am getting the hang of this!");
			
			//Catching exception
		} catch (IOException e) {
			
			System.out.println("Cant find file: " + file.toString());
		
		}
	}
	
}
