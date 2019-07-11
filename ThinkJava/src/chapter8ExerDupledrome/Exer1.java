package chapter8ExerDupledrome;

import java.util.Scanner;

public class Exer1 {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Enter string: ");
	
	String t = console.next();
	
		reverse(t);

	}

	public static void reverse(String s) {
		for(int i = s.length()-1; i >=0; i--)
			System.out.print(s.charAt(i));
	}
}
