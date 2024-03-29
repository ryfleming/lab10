import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
/**
 * Class to represent an abstract Shape object. Parent class to all other shape classes
 * @author ryfleming
 *
 */
abstract public class Shape implements Drawable{

	protected Point[] location;
	private Color color;
	private boolean filled;
	
	public Shape(Color color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	public Color getColor() 
	{
		return color;
	}
	
	public boolean isFilled() 
	{
		return filled;
	}
	
	public Point[] getLocation() 
	{
		return location;
	}
	
	abstract public void draw(Graphics graphics);
}
