package test;

public enum Person {
	Bob(5.6), Larry(6.6), Jason(6.0);
	
	private double height;
	
	Person(Double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Hi I am " + height + " tall in feet";
	}
	
}
