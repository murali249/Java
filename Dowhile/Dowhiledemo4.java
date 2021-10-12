package Dowhile;

public class Dowhiledemo4 {
	void demo()
	{
		int a = 2;
		int b=4;
		while( a<=30)		
			{
			System.out.println(a);
			a=a+b;
			b=b+2;
			}		
	}

	public static void main(String[] args) {
		Dowhiledemo4 obj = new Dowhiledemo4();
		obj.demo();

	}

}
