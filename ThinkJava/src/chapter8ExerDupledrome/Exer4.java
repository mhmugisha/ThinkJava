
package chapter8ExerDupledrome;

public class Exer4 {

	public static void main(String[] args) {
		countXters("AllenDowney", 'A');
	}

//Method counts how many times a xter given as a par. appears
	public static void countXters(String s, char r) 
	{
		int index = 0;
		int count = 0;
		while(index < s.length())
		{	
			if(s.charAt(index)== r)
			{
				count = count + 1;
			}
		
			index = index + 1;
		}
		
		System.out.println(count);
		
	}
}