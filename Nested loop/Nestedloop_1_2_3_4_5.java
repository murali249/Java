package Class;

public class Nestedloop_1_2_3_4_5 {

	public static void main(String[] args) {
	Nestedloop_1_2_3_4_5 obj = new Nestedloop_1_2_3_4_5();
	obj.demo();
	
	}
		public void demo() {
			int count = 1;
			while(count<=4)
			{
			int no = 1; 
			while(no<=5)
			{
			System.out.print(no + " "); 
			no++; 
			} 
			System.out.println();
			count++;
			
			}	
		}
}
