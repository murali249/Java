package Nestedloop;

public class Pyramid_5_4_3_2_1 {

	public static void main(String[] args) {
		Pyramid_5_4_3_2_1 obj = new Pyramid_5_4_3_2_1();
		obj.demo();

	}

	public void demo() {
		
		int col = 5;
		while (col>=1)
		{
		int row = 5;
		while(row>=col) {
		System.out.print(row + " " );
		row--;
		}
		System.out.println();
		col--;
		}
	}

}
