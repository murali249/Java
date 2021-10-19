package Nestedloop;

public class pyramid_1_2_3_4_5 {

	public static void main(String[] args) {
		pyramid_1_2_3_4_5 obj = new pyramid_1_2_3_4_5();
		obj.demo();

	}

	public void demo()
	{
		int col = 1;
		while (col<=5)
		{
		int row = 1;
		while(row<=col)
		{
		System.out.print(row + " ");
		row++;
		}
		System.out.println();
		col++;
		}
	}

}

Output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
