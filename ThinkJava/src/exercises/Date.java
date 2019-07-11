package exercises;

public class Date {

	public static void main(String[] args) {
		
		American("Monday", 14, "June", 1988);
		System.out.println();
		European("Monday", 14, "June", 1988);
		
		System.out.println();
		System.out.println(89%100);
		

	}

	public static void American(String day, int date, String month, int year) 
	{
		System.out.println("American format:");
		System.out.print(day +", ");
		System.out.print(month + " " + date + ", " + year +".");
	}
	
	public static void European(String day, int date, String month, int year) 
	{
		System.out.println("European format:");
		System.out.print(day +", ");
		System.out.print(date + " " + month + ", " + year +".");
	}
	
	
}
