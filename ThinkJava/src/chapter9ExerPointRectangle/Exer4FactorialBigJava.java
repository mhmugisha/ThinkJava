
//This is programme Big Java.

package chapter9ExerPointRectangle;

import java.math.BigInteger;

public class Exer4FactorialBigJava {

	public static void main(String[] args) {
	
		int x = 17;
		BigInteger small = BigInteger.valueOf(17);
		BigInteger big = BigInteger.valueOf(170000000);
		BigInteger total = small.add(big);
		BigInteger Quotient = big.divide(small);
		
		System.out.println(Quotient);

		//invoking factorialBig
		int i = 0;
		while (i <= 30) 
		{
		//	System.out.println(i + "! = " + factorialBig(i));
			i = i+1;
		}
	}
	
	//Method for factorial iterative void 
	public static void factorialVoid(int n) {
		int factorial = 1;
		for(int i = 1; i<=n; i++)
		{
			factorial *=i;
			System.out.println(i + " factorial = " + factorial);
		}
		
		}
	
	//Method for factorial iterative return
	public static int factorialIter(int n) {
		int factorial = 1;
		for(int i = 1; i<=n; i++)
		{
			factorial *=i;
		
		}
		return factorial;
		}

	//Method for factorial recursive
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
//Factorial method to handle big integers type BigInteger
	//public static BigInteger factorialBig(int n) 
	{
	//	if (n == 0) 
		{
		//return BigInteger.valueOf(1);
		} 
	//	else 
		{
		//Method multiply not visible - debug
			//return BigInteger.valueOf(n).multiply(factorial(n - 1));
		}
	}
}
