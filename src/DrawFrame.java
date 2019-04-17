import java.awt.Color;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JFrame;
/**
 * Class to construct DrawFrame object with embedded image containing shapes
 * @author ryfleming
 *
 */
public class DrawFrame extends JFrame {

	private DrawPanel drawPanel;
	
	public DrawFrame(String title) throws IOException 
	{
		super();
		setTitle(title);
		drawPanel = new DrawPanel();
		drawPanel.setBackground(Color.CYAN);
		
		Point pointUL = new Point(300,300);
		Point pointUR = new Point(500, 500);
		
		Point sqr = new Point(380, 275);
		Square square = new Square(sqr, 100, Color.WHITE, true);
		
		Point ova = new Point(260,250);
		Oval oval = new Oval(ova, 100, 200, Color.BLUE, true);
		
		Point circ = new Point(300,150);
		Circle circle = new Circle(circ, 100, Color.ORANGE, true);
		
		Point poly = new Point(125, 125);
		PolyLine polyLine = new PolyLine(poly, pointUL, 15, Color.BLACK, true);
		
		Point rTri = new Point(80, 300);
		RightTriangle rightTriangle = new RightTriangle(rTri, 100, -200, Color.MAGENTA, true);
		
		Point rect = new Point(300, 200);
		Rectangle rectangle = new Rectangle(rect, 200, 100, Color.DARK_GRAY, true);
		
		Point iso = new Point(150, 300);
		IsoscelesTriangle isoTriangle = new IsoscelesTriangle(iso, 200, -200, Color.RED, true);
		
		Point diam = new Point(18, 300);
		Diamond diamond = new Diamond(diam, 200, Color.YELLOW, true);
		
		drawPanel.addShape(rectangle);
		drawPanel.addShape(square);
		drawPanel.addShape(isoTriangle);
		drawPanel.addShape(diamond);
		drawPanel.addShape(polyLine);
		drawPanel.addShape(rightTriangle);
		drawPanel.addShape(circle);
		drawPanel.addShape(oval);
		
		add(drawPanel);
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		//PanelToImage.makePanelPNGImage(drawPanel, "lab10image");
	}
	
	public static void main(String[] args) throws IOException 
	{	
		DrawFrame frame = new DrawFrame("My Picture");
		
	}
}
