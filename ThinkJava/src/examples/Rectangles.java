package examples;

import java.awt.Point;
import java.awt.Rectangle;

public class Rectangles {

	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(0,0,100,200);
		
		System.out.println(box);
		System.out.println(findCentre(box));

	}
	//Method to get the cordinates of the centre of a rectangle.
	
	public static Point findCentre(Rectangle box) 
	{
	int x = box.x + box.width/2;
	int y = box.y + box.height/2;
		return new Point(x,y);
	}
	
	
	
}
