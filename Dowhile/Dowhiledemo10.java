package Dowhile;
//11 13 17 19 23 25

public class Dowhiledemo10 {
		
	void demo() {
		int a = 11;
	        do	{
			
			if((a%2 != 0) & (a%3 !=0))		
				System.out.print(a + " ");
			a=a+1;
		} 	while (a<=29);
		
	}
	
	public static void main(String[] args) {
		Dowhiledemo10 obj = new Dowhiledemo10();
		obj.demo();

	}

}
