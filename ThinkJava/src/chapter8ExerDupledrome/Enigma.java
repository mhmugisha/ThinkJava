package chapter8ExerDupledrome;

public class Enigma {

	public static void enigma(int x) {
		if (x == 0) 
		{
			return;
		} 
		
		else 
		{
			enigma(x / 2);
		}
		
		System.out.print(x % 2);
	}

	public static void main(String[] args) {
		enigma(0);
		System.out.println("");
	}
}
