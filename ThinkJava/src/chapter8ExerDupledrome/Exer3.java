package chapter8ExerDupledrome;

public class Exer3 {

	public static void main(String[] args) {

		indexof("rwatamagufakachope", 't');
		
	}

	public static void countLetters(String s, char letter) {
		
		int count = 0;
		int index = 0;
		while (index < s.length()) 
		{
			if (s.charAt(index) == letter) 
			{
				count = count + 1;
			}
			index = index + 1;
		}
		System.out.println(count);
	}

	public static void indexof(String str, char xter) {
		int count = 0;
		int index = 0;
		while(index < str.length())
		{
			if(str.charAt(index) == xter)
			{
				System.out.println("The index of " + xter + " is: " + index);
			}
			
//			else 
//			{
//				System.out.println(xter + " not found!");
//			}
			
			index = index +1;
		}
		
		
	}
	
	
}
