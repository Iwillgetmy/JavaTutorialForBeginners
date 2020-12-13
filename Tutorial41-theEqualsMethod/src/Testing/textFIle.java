package Testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class textFIle {
	
	public static void main(String[] args) {
		
		File file1 = new File("Some stuff.txt");
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file1))){
			
			br.write("greetings");
			br.newLine();
			br.newLine();
			br.write("I MADE A FILE!");
			
		} catch (IOException e) {
			
		}
	}
}
