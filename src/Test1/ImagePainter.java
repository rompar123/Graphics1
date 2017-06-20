package Test1;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class ImagePainter {

	BufferedImage image;
	
	public ImagePainter(int width, int height){
		this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	}
	
	public BufferedImage getImage(){
		return image;
	}
	
	/**
	 * adds the shape to the foregrount of the image
	 * @param shape
	 */
	public void addShape(Shape shape){
		int initX = 50;
		int initY = 50;
		Color defColor = Color.red;
		if (! (isOnBoundary(initX, initY, shape) || isColored(initX, initY, defColor)) ){
			floodFill(initX, initY, shape, defColor);
		}	
	}
	
	private void floodFill(int x, int y, Shape shape, Color c){
		if (x >= image.getWidth() || x < 0 || y >= image.getHeight() || y <0 ) { return; }
		if (! (isOnBoundary(x, y ,shape) || isColored(x, y, c)) ){
			image.setRGB(x, y, c.getRGB());
			floodFill(x+1, y, shape, c);
			floodFill(x-1, y, shape, c);
			floodFill(x, y+1, shape, c);
			floodFill(x, y-1, shape, c);
		}
	}
	
	private boolean isColored(int x, int y, Color c){
		int imageColor = image.getRGB(x, y);
		return ( imageColor == c.getRGB() );
	}
	
	private boolean isOnBoundary(int x, int y, Shape shape){
		return ( shape.isOnBoundry(x, y) );
	}
}
