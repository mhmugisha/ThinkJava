


package chapter8ExerDupledrome;

import java.util.Scanner;

public class Exer9 {

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter string: ");

		String s = console.next();

		first(s);
		last(s);
		middle(s);
		System.out.println();
		palindrome(s);

	}
//Method to print character at index 0 - the first character.
	public static void first(String s) {
		System.out.println(s.charAt(0));
	}
//Method to print last character.
	public static void last(String s) {
		System.out.println(s.charAt(s.length() - 1));
	}
//Method to print any other character except the first and the last.
	public static void middle(String s) {
		for (int i = 1; i <= s.length() - 2; i++)

			System.out.print(s.charAt(i));
	}
//Void method to check if string is a palindrome. 
	public static void palindrome(String s) {
		boolean check = false;
		
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) == s.charAt(s.length() - 1 - i)) 
				check = true;
			break;
		}	
				
		if(check == true)		
				System.out.println("Yes, this is a Palindrome:)");

				else
				System.out.println("Noo, this is not a Palindrome:(");

	}

}
