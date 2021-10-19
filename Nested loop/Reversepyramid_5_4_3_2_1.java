package Class;

public class Reversepyramid_5_4_3_2_1 {

	public static void main(String[] args) {
		Reversepyramid_5_4_3_2_1 obj = new Reversepyramid_5_4_3_2_1();
		obj.demo();

	}

	public void demo() {

		int row = 1;
		
		while(row<=5)
		{
		int col = 5;
		while(col>=row)
		{
			System.out.print(col + " ");
			col--;	
		}
		System.out.println();
		row++;
		}
		
		
	}

}

Output:
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
