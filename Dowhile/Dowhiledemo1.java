package Dowhile;
//Need output 1 4 7 10 13

public class Dowhiledemo1 {
	void dowhile()
	{
		int a = 1;
		
		do {
			System.out.print(a + " ");
			a = a+3;
		}while(a<=13);
	}

	public static void main(String[] args) {
		Dowhiledemo1 obj = new Dowhiledemo1();
				obj.dowhile();

	}

}
