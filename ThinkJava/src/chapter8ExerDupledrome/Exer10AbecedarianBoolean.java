/* A word is said to be "abecedarian" if the letters in the word 
 * appear in alphabetical order.  For example, the following are 
 * all 6-letter English abecedarian words:abdest, acknow, acorsy.
  a. Describe an algorithm for checking whether a given word 
  	(String) is abecedarian assuming that the word contains only
  	 lower-case letters.Your algorithm can be iterative or recursive.  
  b. Implement your algorithm in a method called isAbecedarian.*/

//Think Java page 104.

package chapter8ExerDupledrome;

public class Exer10AbecedarianBoolean {

	public static void main(String[] args) 
	{
		
		System.out.println(isAbecedarian(" "));
	}
	
	public static boolean isAbecedarian(String s) {

		int index = 0;
		char c = 'a'; 
		while (index < s.length()) 
		{
			if ( c > s.charAt(index)) 
			{
				return false;
			}
				c = s.charAt(index); 
				index = index + 1;
		}
		return true;
	}
}
