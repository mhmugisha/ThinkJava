package chapter7exercisesRecursion;

public class Exercise5 {

	public static void main(String[] args) {
		System.out.println(Euler(3,2));	
		
	}

	public static double Euler(int x, int n) 
	{
		double sum = 0;
		for(int i = 0; i<=n; i++)
			
			{	
			double e = Math.pow(x, i)/factorial(i);
			 sum = sum + e;
			}
			return sum;
	}
	
	//Factorial recursion
	public static int factorial(int n) {
		
		if(n == 0)
			return 1;
		
		else
		{
			int recurse = factorial(n-1);
			int result = n*recurse;
			return result;
		}
		

	}
}