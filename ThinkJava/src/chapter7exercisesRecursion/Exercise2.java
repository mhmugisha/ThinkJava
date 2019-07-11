//Error

package chapter7exercisesRecursion;

public class Exercise2 {

	public static void main(String[] args) {
		
		System.out.println(squareroot(9));
	}	
	public static double squareroot(double r) {
		double x0 = r/2;
		double x1 = (x0 + r/x0)/2;
		double x2 = (x1 + r/x1)/2;
		return x2;
		
		
		
		
		
		
//		if ((x1 - x0) < 0.0001 )
//		{
//			System.out.println(x1);
//			return x1;
//		}
//		else 
//		{
//		 squareroot(x1);	
//		}
//		return x1;
		
	}

}
