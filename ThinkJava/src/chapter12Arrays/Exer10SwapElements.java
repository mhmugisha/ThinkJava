//Think Java page 162.
package chapter12Arrays;

public class Exer10SwapElements {

	public static void main(String[] args) {
//Direct swapping of two elements. 
		int[] array = { 5, 6, 7, 8, 3, 2 };

		int temp;
		temp = array[4];
		array[4] = array[5];
		array[5] = temp;

		for (int index = 0; index < array.length; index++)
			System.out.print(array[index] + " ");
		System.out.println();

		swapElements(array, 0, 5);
	}

/**********************************************************************/
//Method to swap 2 elements, given an array, & indices of the 
//elements to swap as parameters to the method.  
	public static void swapElements(int[] list, int num, int numb) 
	{
		int temp;
		temp = list[num];
		list[num] = list[numb];
		list[numb] = temp;
		for (int index = 0; index < list.length; index++)
			System.out.print(list[index] + " ");
	}
/********************************************************************/	
}
