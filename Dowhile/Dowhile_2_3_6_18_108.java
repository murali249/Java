package Dowhile;

public class Dowhile_2_3_6_18_108 {

	void demo()
	{
		int a = 2;
		int b = 3;
		int c; 
			System.out.print(a + " ");
			System.out.print(b + " ");
			while(a<108) {
				c = a*b;
				System.out.print(c + " ");
				a=b;
				b=c;
		}
	}
	
	public static void main(String[] args) {
		Dowhile_2_3_6_18_108 obj = new Dowhile_2_3_6_18_108();
		obj.demo();
		

	}

}
