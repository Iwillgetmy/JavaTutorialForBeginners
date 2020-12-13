import World.Plant;

public class Grass extends Plant {
	public Grass() {

		// Won't work because no modifier is only acessible in same package
		// System.out.println(this.height);

		// This will work because protected variables can be accessed in sub/child
		// classes such as the Grass class	
		System.out.println(this.size);
	}
}
