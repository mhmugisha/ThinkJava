package chapter8ExerDupledrome;

public class Exer10AbecedarianMineForLoop {

	public static void main(String[] args) {
		System.out.println(isAbecedarian("abcdfhg"));

	}
	/*_______________________________________________*/
	//in our for loop, we have to use i+1 because we
	//want after every iteration of the outer loop, j does
	//not start again say from 1. It starts from the current 
	//position of i plus 1 - the next character unchecked
	//because the other x-ters have been checked already.
	//The loop condition could be i<s.length() 
	//i<=s.length()-1. Both bring us to the end of s.
	public static boolean isAbecedarian(String str) {
        
		String s = str.toLowerCase();//take care of uppers
       
    	  for(int i = 0; i < s.length(); i++) 
    	   {
        	for(int j = i+1; j< s.length(); j++) 
        	   {
        		if(s.charAt(j) < s.charAt(i)) 
        			{
        			return false;
        			}
        		
        		}
        	
    	   }
		return true;
        
 }
}