package World;

public class Oak extends Plant {

	public Oak() {
		// This won't work because type is private. Even if Oak is a child class this
		// statement will not work type = "tree";

		// This will work because the variable is protected and can be accessed within
		// the class it is called in, sub/child classes, and classes in the same package	
		size = "small";
		
		//This will work because Oak is in the same package as height 
		this.height = 10;

	}
}
