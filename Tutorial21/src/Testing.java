
public class Testing {
	
	int a;
	
	Testing(int a){
		this.a = a;
	}
	
	//Overriding toString method
	@Override
	public String toString() {
		
		//Make sure you put it in a String formatter
		return String.format("%d", a);
		
	}
	
	public static void main(String[] args) {
		
		Testing test1 = new Testing(1);
		
		System.out.println(test1.toString());
		
	}
}
