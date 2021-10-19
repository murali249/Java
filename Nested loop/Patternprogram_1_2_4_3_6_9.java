package Nestedloop;

public class Patternprogram_1_2_4_3_6_9 {

	public static void main(String[] args) {
		Patternprogram_1_2_4_3_6_9 obj = new Patternprogram_1_2_4_3_6_9();
		obj.demo();

	}

	public void demo() {
		
		int row = 1;
		while(row<=5)
		{		
		int col = 1;
		while(col<=row)
		{
			System.out.print(row*col + " ");
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
2 4 
3 6 9 
4 8 12 16 
5 10 15 20 25 
