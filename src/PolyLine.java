import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon {

	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled) 
	{
		super(color, filled);
		this.location = new Point[4];
		
		Point pointLL = new Point();
		Point pointLR = new Point();
		
		pointLL.setLocation(pointUL.getX(), pointUL.getY()+thickness);
		pointLR.setLocation(pointUR.getX(), pointUR.getY()+thickness);
		
		this.location[0] = pointUL;
		this.location[1] = pointUR;
		this.location[2] = pointLR;
		this.location[3] = pointLL;
	}
	
	
}
