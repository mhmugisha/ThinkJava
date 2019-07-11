package chapter9ExerPointRectangle;

public class Exer10AbecedarianMineForLoop {

	public static void main(String[] args) {
		System.out.println(isAbecedarian("abcdefghijklmnopqrstuvwzyz"));

	}
	public static boolean isAbecedarian(String s) {
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