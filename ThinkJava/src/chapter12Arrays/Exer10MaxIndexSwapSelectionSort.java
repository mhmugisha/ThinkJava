// USING INDEX OF MAX ELEMENT AND SWAP TO SELECTION SORT
package chapter12Arrays;

public class Exer10MaxIndexSwapSelectionSort {

	public static void main(String[] args) 
	{
		int[] b = {4,5,9,100,24,0,857,96,13};
		sort(b);
		for(int i = 0; i<b.length; i++)
			System.out.print(b[i] + " ");
	}
/*___________________________________________________________*/
public static int indexOfMax(int[] arr, int lowIndex, int highIndex) 
{
		int indexOfMax = lowIndex;
		for (int i = lowIndex+1; i <= highIndex; i++) 
		{
			if (arr[i] > arr[indexOfMax]) 
			{
				indexOfMax = i;
			}
		}
		return indexOfMax; 
}
/*_____________________________________________________________*/
public static void swapElement(int[] arr, int index1, int index2) 
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp; 
	}
/*____________________________________________________________*/
//use length-1 bse no need to swap last element with itself
public static void sort(int[] arr) 
	{
		int length = arr.length;
		for (int i = 0; i < length-1; i++) 
		{
			int indexOfMax = indexOfMax(arr, i, length-1);
			swapElement(arr, i, indexOfMax);
		}
	}
}
