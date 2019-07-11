package chapter8ExerDupledrome;

public class Exer11DupledromeVoid {

	public static void main(String[] args) {
		
		isDupledrome("letters");

	}
	public static void isDupledrome(String s) 
	{
		int length = s.length();
		boolean check = true;
		
		// can't be a dupledrome if s has odd number of letters
		if (length%2 != 0) 
		{
			System.out.println("No, it is not a dupledrone.");
			return;//needed to exit to stop index+2.This would cause
		}			//IndexOutOfBoundsException.

		int index = 0;
		while (index < length) 
		{
			if (s.charAt(index) != s.charAt(index + 1)) 
			{
				check = true;
				break;
			}
			index = index + 2;
		}
		if(check==true)
			System.out.println("Yes, it is a dupledrone.");
		
		else
			System.out.println("No, it is not a dupledrone.");
	}
}
