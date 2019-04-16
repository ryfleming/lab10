import java.awt.Color;
import java.awt.Graphics;

public class Polygon extends Shape{

	public Polygon(Color color, boolean filled) 
	{
		super(color, filled);
	}
	
	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(getColor());
		int[] xCoord = new int[getLocation().length];
		int[] yCoord = new int[getLocation().length];
		int nPoints = getLocation().length;
		
		for (int index = 0; index < getLocation().length; ++index) {
			xCoord[index] = (int)getLocation()[index].getX();
			yCoord[index] = (int)getLocation()[index].getY();
		}
		
		graphics.drawPolygon(xCoord, yCoord, nPoints);
		if(isFilled()) {
			graphics.fillPolygon(xCoord, yCoord, nPoints);
		}
		
	}

}
