package Dowhile;
// 15 31 63 127 255
public class Dowhiledemo11 {
		
			void demo()
			{
				int a = 15;
				int b= 4;
			
				do {
					System.out.print(a + " ");
					a = a + (2^b);
					b=b+1;
				}while(a<=255);
				
				
			}
	public static void main(String[] args) {
		Dowhiledemo11 obj = new Dowhiledemo11();
		obj.demo();

	}

}
