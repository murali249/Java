package Class;

public class Reversepyramidstar {

	public static void main(String[] args) {
		Reversepyramidstar obj = new Reversepyramidstar();
		obj.demo();

	}

	public void demo() {
		int row = 1;
		
		while(row<=5)
		{
		int col = 5;
		while(col>=row)
		{
			System.out.print("*" + " ");
			col--;	
		}
		System.out.println();
		row++;
		}
		
	}

}

Output:
* * * * * 
* * * * 
* * * 
* * 
* 
