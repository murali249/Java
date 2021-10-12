package Dowhile;

public class Dowhileprime {
	void demo()
	{
	int	a = 1;
	while(a<30)
	{
	if((a%1==a) & (a%a==1))
		System.out.println(a);	
		a=a+1;
	}
	}
public static void main(String[] args) {
	Dowhileprime obj = new Dowhileprime();
  obj.demo();

	}

}
