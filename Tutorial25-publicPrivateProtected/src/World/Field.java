package World;

public class Field {

	private Plant plant = new Plant();

	public Field() {

		// This works. Size is protected and Field is in the same package as Plant
		System.out.println(plant.size);
		
	}
}