//ABECADARIAN - VOID 

/*A word is said to be "abecedarian" if the letters in the
word appear in alphabetical order. For example, the following 
are all 6-letter English abecedarian words.abdest, acknow, acorsy,
Needed: Method to identify word as abecedarian. */

package chapter8ExerDupledrome;

public class Exer10AbecedarianVoid {

	public static void main(String[] args) {

		isAbecedarian("mark");
	}

	//void method to identify abecedarian.
	public static void isAbecedarian(String s) {

		int index = 0;
		char c = 'a'; 
		boolean check = false;
		
		while (index < s.length()) 
		{
			if ( c > s.charAt(index)) 
			{
				check = true;
				break;
			}
				c = s.charAt(index); 
				index = index + 1;
		}
		if (check == false)
		System.out.println("Yes, this is Abecedarian:)");
		
		else
			System.out.println("No, this is not Abecedarian:(");
	}

}