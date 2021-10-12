package Dowhile;
//5 10 15 20 25
public class Dowhiledemo2 {
		void demo()
	{
		int a = 5;
		do {
			System.out.print(a+ " ");
			a = a+5;
		}while(a<=25);
		
	}
	public static void main(String[] args) {
		Dowhiledemo2 obj = new Dowhiledemo2();
		obj.demo();

	}

}
