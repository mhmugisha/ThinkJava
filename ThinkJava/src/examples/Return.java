//Think Java page 43

package examples;

import java.util.Scanner;

public class Return {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		double x;
		System.out.println("Enter x: ");
		x = console.nextDouble();
		
		printLog(x);
	}

	public static void printLog(double x) 
	{
		if(x<=0)
		{
			System.out.println("Error: Positive number neeeded!");
			return;
		}
		
		double result = Math.log(x);
		System.out.println("Log of " + x + " is : " + result);
	}
	
}
