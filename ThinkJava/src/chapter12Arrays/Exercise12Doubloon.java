//Method to determine a string is a doubloon - in which every 
//character appears strictly twice. 

package chapter12Arrays;

public class Exercise12Doubloon {

	public static void main(String[] args) {

		doubloon("Shanghaiings");
		System.out.println(isDoubloon("Shanghaiings"));

	}

/************************************************************/
	//Void doubloon method. 
	public static void doubloon(String s) {

		String l = s.toLowerCase();
		boolean check = true;

		for (int i = 0; i < l.length(); i++) 
		{
			int count = 0;
			for (int j = 0; j < l.length(); j++) 
			{
				if (l.charAt(i) == l.charAt(j))
					count++;
			}
			
			if (count != 2) 
			{
				check = false;
				break;
			}
		}	
			
		if (check == true) {
				System.out.println("True, this is a doubloon:).");
			} else
				System.out.println("False, this is not a doubloon(:");
	}
/***********************************************************/	
//Boolean method to return true or false for a doubloon.	
	static boolean isDoubloon(String str)
    {
       String s = str.toLowerCase();// to accomodate both cases
		int len = s.length();
       char[] ar = new char[len]; //Char Array
       
       ar = s.toCharArray();
       
       int count = 0;
       for(int i=0;i<len;i++)
       {
           for(int j=0;j<len;j++)
           {
               if(ar[i]==ar[j]) //When Values are Equal
               {
                   count++; //Increment the count
               }
           }
       }
 //If the counted value is equal to twice the length 
 //then every element appears exactly twice
       if(count == (len*2))
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
