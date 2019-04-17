import java.awt.Color;
import java.awt.Point;
/**
 * Class to represent a RightTriangle object
 * @author ryfleming
 *
 */
public class RightTriangle extends Triangle {
	
	public RightTriangle(Point pointRA, int base, int height, Color color, boolean filled) {
		super(pointRA, color, filled);
		location[1] = new Point(pointRA.x + base, pointRA.y);
		location[2] = new Point(pointRA.x, pointRA.y + height);
	}

}
