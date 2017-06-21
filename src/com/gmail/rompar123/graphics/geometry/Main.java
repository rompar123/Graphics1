package com.gmail.rompar123.graphics.geometry;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.gmail.rompar123.graphics.geometry.edges.Edge;
import com.gmail.rompar123.graphics.geometry.edges.Line;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<Edge> edgesList = new ArrayList<>();
		edgesList.add(new Line(new Point(50, 50), new Point(500, 500)));
		edgesList.add(new Line(new Point(500, 500), new Point(1200, 130)));
		edgesList.add(new Line(new Point(1200, 130), new Point(50, 50)));
		BufferedImage image = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
		
		for (Edge edge : edgesList) {
			for (Point p : edge.getPoints()){
				image.setRGB(p.getX(), p.getY(), Color.BLUE.getRGB());
			}
		}
		
		ImageIO.write(image, "png", new File("image2.png"));
	}

}
