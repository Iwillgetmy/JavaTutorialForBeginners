package World;

public class Plant {

	// Instance variable
	// Because this variable is public, you can access it from anywhere
	public String name;

	// This variable is public, but also final and static, meaning that it cannot
	// be modified and can only be accessed in the class. Constant/final variables
	// are usually capitalized
	public final static int ID = 8;

	// This is a private variable, meaning that it cannot be accessed outside
	// of the class. Not even in a child/extended class. Private is the opposite of public.
	private String type;
	
	//Protected variables are like private variables, but they CAN be accessed in 
	//the class they are made in, sub/child classes, and the same package
	protected String size;
	
	//This doesn't have a modifier(private, package, protected). This has package level accessibility
	int height;
	
	// Constructor. This.name means this class, not another class
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "large";
		this.height = 8;
	}

}
