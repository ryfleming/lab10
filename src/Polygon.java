import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

abstract class Polygon extends Shape{

	public Polygon(Color color, boolean filled) 
	{
		super(color, filled);
	}
	
	@Override
	public void draw(Graphics graphics) {
		Graphics2D g2d = (Graphics2D)graphics;
		g2d.setColor(this.getColor());
		
		int[] xCoord = new int[getLocation().length];
		int[] yCoord = new int[getLocation().length];
		int nPoints = getLocation().length;
		
		for (int index = 0; index < getLocation().length; ++index) {
			xCoord[index] = (int)getLocation()[index].getX();
			yCoord[index] = (int)getLocation()[index].getY();
		}
		
		g2d.drawPolygon(xCoord, yCoord, nPoints);
		if(isFilled()) {
			g2d.fillPolygon(xCoord, yCoord, nPoints);
		}
		
	}

}
