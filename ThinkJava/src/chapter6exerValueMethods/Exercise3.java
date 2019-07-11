package chapter6exerValueMethods;

import java.util.Scanner;

public class Exercise3 {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		
		System.out.println("Enter x: ");
		x = console.nextInt();
		System.out.println("Enter y:");
		y = console.nextInt();
		System.out.println("Enter z:");
		z = console.nextInt();
		
		System.out.println("It is a triangle: " + isTriangle(x,y,z));

	}

	public static boolean isTriangle(int a,int b, int c)
	{
	if(c > a + b|| a > b + c || b > a + c)
		return false;
	
	else
		return true;
	}
	
}
