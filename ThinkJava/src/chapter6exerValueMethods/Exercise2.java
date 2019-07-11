//This is exercise 6.2.

package chapter6exerValueMethods;

public class Exercise2 {

	public static void main(String[] args) {
		
		System.out.println("1. " + multadd(1.0, 2.0, 3.0));
		System.out.println("2. " + multadd(1.0, Math.sin(Math.PI/4), Math.cos(Math.PI/4)/2)); 
		System.out.println("3. " + multadd(1.0, Math.log(10), Math.log(20)));
		System.out.println("4. " + yikes(10));
		
	}

	public static double multadd(double a, double b, double c)
	{
		return a *b + c;
	}
	
	public static double yikes(double x) {
		
		double y = multadd(1, x*Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
		return y;
	}
	
}
