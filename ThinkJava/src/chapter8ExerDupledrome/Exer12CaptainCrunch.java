package chapter8ExerDupledrome;

public class Exer12CaptainCrunch {

	public static void main(String[] args) {
		crunchCode("cab dad glide");

	}

	public static void crunchCode(String s) {
		
		for(int i = 0; i<s.length(); i++) 
		{
			if(s.charAt(i)>=97 && s.charAt(i)<=108)
			{
				System.out.print((char)(s.charAt(i)+13));
			}
			if(s.charAt(i)>108 && s.charAt(i)<=122)
				System.out.println();
			
		}
		
	}
	
	
}
