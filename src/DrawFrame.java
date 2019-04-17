import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame {

	DrawPanel drawPanel;
	
	public DrawFrame(String title) 
	{
		super();
		setTitle(title);
		drawPanel = new DrawPanel();
		drawPanel.setBackground(Color.CYAN);
		
		Point pointUL = new Point(300,300);
		Point pointUR = new Point(500, 500);
		Square square = new Square(pointUL, 100, Color.BLUE, true);
		Oval oval = new Oval(pointUL, 100, 200, Color.BLUE, true);
		Circle circle = new Circle(pointUL, 100, Color.BLUE, true);
		PolyLine polyLine = new PolyLine(pointUL, pointUR, 30, Color.BLACK, true);
		RightTriangle rightTriangle = new RightTriangle(pointUL, 100, 200, Color.MAGENTA, true);
		Rectangle rectangle = new Rectangle(pointUL, 200, 100, Color.DARK_GRAY, true);
		IsoscelesTriangle isoTriangle = new IsoscelesTriangle(pointUL, 200, -200, Color.RED, true);
		Diamond diamond = new Diamond(pointUL, 200, Color.YELLOW, true);
		
		
		
		//drawPanel.addShape(circle);
		//drawPanel.addShape(oval);
		//drawPanel.addShape(square);
		//drawPanel.addShape(polyLine);
		//drawPanel.addShape(rightTriangle);
		//drawPanel.addShape(rectangle);
		//drawPanel.addShape(isoTriangle);
		drawPanel.addShape(diamond);
		
		
		add(drawPanel);
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		DrawFrame frame = new DrawFrame("My Picture");
	}
}
