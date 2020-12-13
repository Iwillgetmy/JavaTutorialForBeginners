//Because I moved the seaweed class, it is now import ocean.plants.Seaweed
//You always seperate sub-packages with periods
import ocean.Fish;
import ocean.plants.Seaweed;

//Packages have two uses. They help organize all of your classes, 
//so you can easily find what you want, and the y stop you from 
//having conflicts with class names. For example, you can have 
//a machine class in one package and a machine class in another 
//package, but NEVER in the same package. 

//If I wanted to import the fish class that I just made, I would 
//need to import it from its package. I would need to write import classes.Fish
//This statement imports the fish class. You can only import classes
//If the class you want to import in is in the default package. If you 
//write import classes.star, it will import all of the classes in the 
//classes package!

//Another shortcut is right click, then source, then organize imports or control-shift-0.
//This shortcut is very useful

//There are subpackages for packages(packages in packages)
//I will make a sub package under ocean package	called plants

//If you are sharing your code with other people, you want to make sure your
//package name is unique, so other people won't have the same package name
//for a different purpose. The class also needs to have a unique name.
//There is a convention in java for creating worldwide unique package names.	
//Usually the convention is your name, website, then the name of class.	

public class Packages {
	// If you don't write the import statement, press control space before writing
	// the brackets, and eclipse will write the import statement for you!
	Fish fish = new Fish();
	Seaweed weed = new Seaweed();
}

