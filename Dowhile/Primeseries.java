package Dowhile;

public class Primeseries {

	void demo()
	{
		int num = 100;
		int b = 2;
		boolean prime = true;
	while(b<num) 
			{	
		if (num%b ==0)
					{
					//System.out.println(b + "check Not prime");
					prime = false;
					break;
					}	
		b =b+1;
		}
	if(prime == true) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("Not Prime number");
	}
	
		
		}
	
	public static void main(String[] args) {
		Primeseries obj = new Primeseries();
		obj.demo1();

	}
	
	void demo1()
	{
		int total = 100;
		int num = 2;
		while(num<total) {
			
			int b = 2;
			boolean prime = true;
		while(b<num) 
				{	
			if (num%b ==0)
						{
						//System.out.println(b + "check Not prime");
						prime = false;
						break;
						}	
			b =b+1;
			}
		if(prime == true) {
			//System.out.println("Prime number" + num);
			System.out.print(num + " ");
		}
		else {
			//System.out.println("Not Prime number" + num);
		}
		num++;
		}
	}
	

}
