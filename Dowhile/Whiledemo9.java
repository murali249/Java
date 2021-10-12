package Dowhile;
//2 6 11 17 24
public class Whiledemo9 {
	void demo()
	{
		int a= 2;
		int b=4;
		while(a<=24) {
			System.out.print(a+ " ");
			a=a+b;
			b=b+1;
		}
		
	}

	public static void main(String[] args) {
		Whiledemo9 obj = new Whiledemo9();
		obj.demo();

	}

}
