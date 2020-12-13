class Frog{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setInfo(String newName, int newAge) {
		setName(newName);
		setAge(newAge);
	}
}

public class settersAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frog frog1 = new Frog();
		
		frog1.setName("Berite");
		
		System.out.println(frog1.getName());
		
		frog1.setName("John");
		frog1.setAge(6);
		
		System.out.println(frog1.getName());
	
	
	}

}
