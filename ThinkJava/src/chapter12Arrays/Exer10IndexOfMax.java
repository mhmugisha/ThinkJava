

package chapter12Arrays;

public class Exer10IndexOfMax 
{

	public static void main(String[] args) 
	{
		int n = 14;
		int[] b = {4,6,100,0,8,140,7};
		System.out.println("Index of largest element is: " + indexOfMax(b));
	}

	public static int indexOfMax(int[]a) 
	{
		//Initially assume that the element at 0 is the largest
		//Then keep comparing it with others. When u find element at index 
		//greater than element at maxIndex, update maxIndex with index. 
		int maxIndex = 0;
		for(int index = 1; index<a.length; index++)
		{
		if(a[maxIndex] < a[index])
			{
			maxIndex = index;
			}
		}
		return maxIndex;
	}
}
