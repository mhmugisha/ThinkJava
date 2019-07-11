package chapter12Arrays;

import java.util.Random;
import java.util.Scanner;

public class Exercise2Randoms {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int low = 0;
		int high = 0;
		System.out.println("Enter low:");
		low = console.nextInt();
		System.out.println("Enter high: ");
		high = console.nextInt();
		System.out.println(randomDouble1(low, high));
		System.out.println(randomDouble2(low, high));
		System.out.println(randomInt(low, high));
	}

/***********************************************************************/
	//Generating doubles using random.nextInt. Original condition was >. 
		public static double randomDouble1(double low, double high) {
				
				if (low >= high)
				{
					throw new IllegalArgumentException("high must be greater than low");			
				}
				
				Random random = new Random();
				return random.nextInt((int) ((high - low) +1)) + low;
			}
/***********************************************************************/
		//Generating random doubles using Math.random 
		public static double randomDouble2(int low, int high) 
		{
			if (low >= high)
			{
				throw new IllegalArgumentException("high must be greater than low");			
			}
			
			double result = (Math.random() * (high - low + 1)) + low;
			    return result;
		}
/************************************************************************/
		//Generating random integers btn low and high excluding high.
		public static int randomInt(int low, int high) 
		{
			if (low >= high)
			{
				throw new IllegalArgumentException("high must be greater than low");			
			}
				//Cast needed bse Math.random returns a double
			int result = (int) ((Math.random() * (high - low) + low));
			    return result;
		}
/**********************************************************************/
		
}
