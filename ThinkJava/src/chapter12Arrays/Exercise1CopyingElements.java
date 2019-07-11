package chapter12Arrays;

import java.util.Scanner;

public class Exercise1CopyingElements {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char[] a = {1,2,3,4,5,6,10,23,29,40};
		int [] b = new int[10]; //= new int[10];
		
		for(int i = 0; i<a.length; i++)
		{
			b[i] = a[i];
		System.out.println(i + "." + b[i]);
		
		}
	}
			
}

