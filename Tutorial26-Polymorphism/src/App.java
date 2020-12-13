//Polymorphism means that if you have a child class of a parent class, you can 
//always use the child class anywhere where you would normally use the parent class

public class App {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree = new Tree();

		// This is allowed because the two objects are from the same class. Plant2
		// will have the same settings, stuff in brackets as plant 1, if you modified
		// them
		Plant plant2 = plant1;

		// This is allowed for some reason because of polymorphism. Tree is an object
		// from the child class of the Plant class. Plant3 will now use all methods in
		// the Tree class, not the Plant class
		Plant plant3 = tree;

		Plant plant4;

		// When I created the dot, it only showed method options from the Object class
		// and the Plant class. NONE from the Tree class because it didn't point there.
		// Like said below, the variable(class at front) decides which methods can be
		// called
		// plant4.grow();

		// This prints out plant growing because it points towards Plant class
		plant2.grow();
		// This prints out tree growing because it points towards Tree class
		plant3.grow();

		// This works because tree is in the Tree class
		tree.shedLeaves();

		// This won't work because plant2 is from variable Plant, not Tree. THE
		// VARIABLE(main thing in front, like int or String or in this case Plant)
		// DECIDES WHICH METHODS CAN BE CALLED. This means that you can only call
		// methods that are common between the two classes or methods in the variable
		// class. However, if you call a method that is in only in the variable class,
		// it will print out the original. If you call an overridden method, it will
		// call the overridden version, if you put a child class to point towards
		// plant3.shedLeaves();

		// This willl work because die method is Plant class
		plant3.die();

		// This is allowed because polymorphism allows that where you should use a
		// parent class, child classes can also be used.
		doGrow(tree);

	}

	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
