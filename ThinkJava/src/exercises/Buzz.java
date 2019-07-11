package exercises;

public class Buzz {

	public static void main(String[] args) {
		
	checkFermat(6,8,10,2);	
		
	}

	public static void checkFermat(int a, int b, int c, int n) {
		
	int z = (int)Math.pow(a,n) + (int)Math.pow(b, n); 
	int t = (int)Math.pow(c, n);
	
	if (z==t)
		System.out.println("Holy smokes, Fermat was wrong!");
	else
		System.out.println("That doesn't work");
	
		
	}
	
	
	
		
}
