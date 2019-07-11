package chapter12Arrays;

public class Exercise5Factors {

	public static void main(String[] args) {
		
		int m = 36;
		int[] b = {3,6,12};
		System.out.println(areFactors(b,m));
	}

/************************************************************************/
//Return true if all elmts in an array are factors of the given no.
	public static boolean areFactors(int[] a, int n) {
		for(int i = 0; i<a.length; i++)
			if(n % a[i]!= 0)
			{
				return false;
			}
		return true;
	}
}
