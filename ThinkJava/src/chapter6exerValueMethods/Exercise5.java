
//I don't understand this question.

package chapter6exerValueMethods;

public class Exercise5 {

	public static void main(String[] args) {
	
		System.out.println(distance(4,2,7,6));
	}

	public static double distance(double x1, double y1, double x2, double y2)
	{
		double s = x2 - x1;
		double t = y2 -y1;
		double r = Math.sqrt(sumSquares(x1,y1,x2,y2));
		return r;
		
	}
	public static double sumSquares(double x1, double y1, double x2, double y2) {
		double s = x2 - x1;
		double t = y2 -y1;
		double m = (s*s + t*t);
		return m;
		
		
	}
	
}
