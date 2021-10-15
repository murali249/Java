package Dowhile;

public class Dowhileprime {
	void demo()
	{
	int a = 54;
		int b = 2;
		boolean notprime = false;
		while(b<a)
		{
		if(a%b==0) {
		//System.out.println("not prime");
		notprime = true;
		break;
		}
		b=b+1;
		}
		if(notprime == true) {
			System.out.println("Not prime");
		}
		else{
			System.out.println( "Prime");
		}
	}
public static void main(String[] args) {
	Dowhileprime obj = new Dowhileprime();
  obj.demo();

	}

}
