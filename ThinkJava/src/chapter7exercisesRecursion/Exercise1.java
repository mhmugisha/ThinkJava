
//Produces infinite loop of 10.

package chapter7exercisesRecursion;

public class Exercise1 {

	public static void main(String[] args) {
	
	
	loop(10);
		
	}

	
	public static void loop(int n) {
		int i = n;
		while(i>0)
			
		if(i%2==0)
		{
			i = i/2;
			
		}
		else
		{
			i = i +1;
		
		}
	}
		
}
