package Test1;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static final int width = 100;
	public static final int height = 100;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		{ // init Frame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(width, height);
			frame.setTitle("graphics test");
			frame.setContentPane(new JPanel());
			frame.setVisible(true);
		}
		
		ImagePainter ip = new ImagePainter(width, height);
		Point[] points= {new Point(0, 0), new Point(200, 0), new Point(200, 200), new Point(0, 200)};
		Shape shape1 = new Shape(points); 
		
		ip.addShape(shape1);
		
		frame.getContentPane().getGraphics().drawImage(ip.getImage(), 0, 0, null);
	}

}
