package Dowhile;
//1+2+3...+10
public class Additionoffirst10 {

	void demo() {
		int a = 0;
		int b = 1;
		while(b<=10) {
			a = a+b;
			b++;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Additionoffirst10 obj = new Additionoffirst10();
		obj.demo();
		

	}

}
