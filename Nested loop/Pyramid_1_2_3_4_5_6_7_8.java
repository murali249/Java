package Nestedloop;

public class Pyramid_1_2_3_4_5_6_7_8 {

	public static void main(String[] args) {
		Pyramid_1_2_3_4_5_6_7_8 obj = new Pyramid_1_2_3_4_5_6_7_8();
		obj.demo();

	}

public void demo() {
	int no = 1;
	int col = 1;
	while (col<=4)
	{
	int row = 1;
	while(row<=col)
	{
	System.out.print(no + " ");
	no++;
	row++;
	}
	System.out.println();
	col++;

		}
	}
}

Output:
1 
2 3 
4 5 6 
7 8 9 10 
