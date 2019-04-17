import java.awt.Color;
import java.awt.Point;

/**
 * Class to represent an IsoscelesTriangle object
 * @author ryfleming
 *
 */
public class IsoscelesTriangle extends Triangle{

	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled) 
	{
		super(pointLB, color, filled);
		location[1] = new Point(pointLB.x + base, pointLB.y);
		location[2] = new Point(pointLB.x + base/2, pointLB.y + height);
	}
	
}
