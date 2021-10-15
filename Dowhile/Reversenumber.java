package Dowhile;

public class Reversenumber {
	
	void demo() 
	{
	int a = 639,b,rev = 0;
	
	while(a>0) {
		b = a%10;
		//System.out.print(b);
		rev = (rev*10)+b;
		a = a/10;
	}
	System.out.println(rev);
	
	}

	public static void main(String[] args) {
		Reversenumber obj = new Reversenumber();
		obj.demo();

	}

}
