import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{

	ArrayList<Shape> shapeList;
	
	public void addShape(Shape shape) {
		shapeList.add(shape);
	}
	
	protected void paintCompenent(Graphics graphics) {
		
	}
}
