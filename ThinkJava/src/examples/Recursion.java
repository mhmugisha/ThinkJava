package examples;

public class Recursion {

	public static void main(String[] args) {
	
		countdown(6);
		
	}

	public static void countdown(int n) {
		
		if(n == 0)
		{
			System.out.println("Blastoff!!!");
		}
		
		else 
		{
			System.out.println(n);
			countdown(n-1);
		}
	}
	
	
}
