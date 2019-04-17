import java.awt.Color;
import java.awt.Point;
/**
 * Class to represent a Square object
 * @author ryfleming
 *
 */
public class Square extends Rectangle {
	
	public Square(Point pointUL, int width, Color color, boolean filled) 
	{
		super(pointUL, width, width, color, filled);
	}
}
