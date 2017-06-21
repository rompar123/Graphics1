package com.gmail.rompar123.graphics.geometry;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.gmail.rompar123.graphics.geometry.edges.Edge;
import com.gmail.rompar123.graphics.geometry.edges.Line;

public class Main {

	public static void main(String[] args) throws IOException {
		Edge line1 = new Line(new Point(5, 5), new Point(500, 500));
		BufferedImage image = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
		
		for (Point p : line1.getPoints()){
			image.setRGB(p.getX(), p.getY(), Color.BLUE.getRGB());
		}
		
		ImageIO.write(image, "png", new File("image1.png"));
	}

}
