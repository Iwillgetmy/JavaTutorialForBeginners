class Person {
	
	//Instance variables
	String name;
	int age;
	
	void speak() {
		
		//Thing for greeting
		System.out.println("My name is " + name);
		
	}
	
	int timeTillRetirement() {
		
		int yearsLeft = 65-age;
	
		return yearsLeft;
		
	}
	
	int getAge() {
		
		return age;
		
	}
	
}

public class gettersAndReturns {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.age = 35;
		
		person1.speak();
		int years = person1.timeTillRetirement();
		
		System.out.println("Years untill retirement: " + years);
	
		System.out.println(person1.getAge());
	}
	
}
