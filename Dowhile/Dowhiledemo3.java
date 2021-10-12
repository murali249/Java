package Dowhile;
// reverse 25 20 15 10 5
public class Dowhiledemo3 {
	void demo()
	{
		int a = 25;
		do
		{
			System.out.print(a + " ");
			a = a-5;
		}while(a>0);
		
	}

	public static void main(String[] args) {
		Dowhiledemo3 obj = new Dowhiledemo3();
		obj.demo();

	}

}
