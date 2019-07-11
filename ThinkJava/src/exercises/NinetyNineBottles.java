package exercises;

import java.util.Scanner;

public class NinetyNineBottles {

	static Scanner console = new Scanner(System.in);
	
	public static void decrement(int beers) 
	{
		if(beers == 0)
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya' can't take\r\n" + 
					"one down, ya' can't pass it around, 'cause there are no more\r\n" + 
					"bottles of beer on the wall!");
		
		else
		{
			System.out.println(beers + " bottles of beer on the wall, " + beers + " bottles of beer, ya' take one\r\n" + 
					"down, ya' pass it around, " + (beers -1) + " bottles of beer on the wall.");
			System.out.println();
			decrement(beers -1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter No. of Stanzas:");
		int y = console.nextInt();
		
		if (y < 0)
		{
			System.out.println("Enter 0 or Positive No.");
			return;
		}
		
		else 
		{
			decrement(y);	
		}
	}
}
