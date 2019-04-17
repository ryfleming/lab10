import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 * Class to construct DrawPanel used to draw shapes.
 * @author ryfleming
 *
 */
public class DrawPanel extends JPanel{

	ArrayList<Shape> shapeList;
	
	public DrawPanel() {
		super();
		shapeList = new ArrayList<Shape>();
	}
	
	public void addShape(Shape shape) {
		shapeList.add(shape);
	}
	
	
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D g2d = (Graphics2D)graphics;
		for(Shape shape: shapeList) {
			shape.draw(g2d);
		}
		
	}
}
