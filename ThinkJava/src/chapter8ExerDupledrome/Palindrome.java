
// 	PALINDROME
package chapter8ExerDupledrome;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(palindromeBoolean("Able was I ere I saw Elba"));
		palindromeVoid("Able was I ere I saw Elba");
		

	}
/***********************************************************************/
//Boolean return method to check palindrome.
	public static boolean palindromeBoolean(String str) {
		int len = str.length();
		int i, j;
		j = len - 1; 
		
		String newStr = str.toLowerCase();
		for (i = 0; i <= (len - 1) / 2; i++) 
		{
			if (newStr.charAt(i) != newStr.charAt(j)) 
				return false;
			j--; 
		}
		return true; 
	}

/**********************************************************************/
	//Void method to check if string is a palindrome. 
	
	public static void palindromeVoid(String s) {
		boolean check = false;
		String str = s.toLowerCase();
		
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) 
				check = true;
			break;
		}	
				
		if(check == true)		
				System.out.println("Yes, this is a Palindrome:)");

				else
				System.out.println("Noo, this is not a Palindrome:(");
	}
}
