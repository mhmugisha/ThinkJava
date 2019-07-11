package chapter8ExerDupledrome;

public class Exer10AbecedarianMineWhileLoop {

	public static void main(String[] args) {
		System.out.println(isAbecedarian("abctuvwyz"));

	}
	public static boolean isAbecedarian(String str) {
		String s = str.toLowerCase();
		
		int i = 0;
       
    	   while(i<s.length()) {
        	for(int j = i+1; j<s.length(); j++) {
        		if(s.charAt(j) < s.charAt(i)) 
        		{
        			return false;
        		}
        		
        	}
        	i++;
        }
		return true;
 }
}