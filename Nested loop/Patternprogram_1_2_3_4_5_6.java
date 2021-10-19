package Nestedloop;

public class Patternprogram_1_2_3_4_5_6 {

	public static void main(String[] args) {
		Patternprogram_1_2_3_4_5_6 obj = new Patternprogram_1_2_3_4_5_6();
		obj.demo();

	}

	public void demo() {
		
		int row = 1;
		while(row<=5)
		{		
		int col = 0;
		while(col<row)
		{
			System.out.print(row+col + " ");
			col++;
		}
		System.out.println();
		row++;
		//no++;
		}
		
	}

}


Output:
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
