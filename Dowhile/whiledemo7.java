package Dowhile;
//1 11 121
public class whiledemo7 {
	
	void demo()
	{
		int a = 1;
		while(a<=121) {
			System.out.print(a + " ");
			a = a*11;
		}
	}

	public static void main(String[] args) {
		whiledemo7 obj = new whiledemo7();
		obj.demo();

	}

}
