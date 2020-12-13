//You can identify a subclass while creating the class, you don't need to write extend (class name)

public class Tree extends Plant {

	@Override
	public void grow() {
		System.out.println("Tree growing");
	}
	public void shedLeaves() {
		System.out.println("Shedding Leaves");
	}
}
