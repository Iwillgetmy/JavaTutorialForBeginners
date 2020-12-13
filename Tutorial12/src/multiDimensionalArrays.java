
public class multiDimensionalArrays {

	public static void main(String[] args) {
		
		//1 dimensional array
		int[] values = {3, 5, 2434};
		
		System.out.println(values[2]);
		
		//2 dimensional array. To sysout it you need to put the crow number in the first brackets and the number in the column in the second brackets. For example if I wanted to output the 
		//second number in the third column you would need to write grid[2][1], like shown below	
		int [][] grid = {
				{3, 2, 5}, 
				{5, 3}, 
				{3, 53, 24, 54} 
		}; 
		
		System.out.println(grid[2][1]);
		
		//This is a 2 dimensional String array
		String[][] texts = new String[2][3];
		
		texts[1][2] = "Hi!";
		
		System.out.println(texts[1][2]);
		
		//This nested for loop will outprint all of the integers in the grid arrray grid.length will make the for loop go through the first second and third grid.
		for(int row = 0; row<grid.length; row++) {
			
			//grid[row].length is similar to grid.length but it makes it so that it goes through the integers only in the row that it is in, for example the first row
			for(int col = 0; col<grid[row].length; col++) {
				
				//Printing out all of the integers in grid array
				System.out.print(grid[row][col] + "\t");
		
			}	
			System.out.println();
		}
		
		
		//This string means that there will only be 2 rows but null amount of columns
		String[][] words = new String[2][];
		
		//This means there will be 3 columns
		words[0] = new String[3];
		
		words[0][1] = "sup";
		
		System.out.println(words[0][1]);
	
	}

}
