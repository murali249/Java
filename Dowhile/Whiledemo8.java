package Dowhile;
//printing only multiples of 3 and 5 
public class Whiledemo8 {

			void demo()
			{
				 int a = 1;
				 while(a<20){
				if((a%3==0) & (a%5==0)) 
					System.out.print(a + " ");
					a = a+1;
				}

			}
	public static void main(String[] args) {
		Whiledemo8 obj = new Whiledemo8();
		obj.demo();
	}

}
