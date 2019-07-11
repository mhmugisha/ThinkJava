package chapter12Arrays;

public class Exercise6Target {

	public static void main(String[] args) {
		
		int n = 12;
		int[]b = {1,3,4,10,14};
		
		System.out.println(Target(b,n));

	}

	public static int Target(int[]a, int target) {
		for(int i = 0; i<a.length; i++)
			if(a[i] == target)
			{
				return i;
			}
		return -1;
	}
	
	
}
