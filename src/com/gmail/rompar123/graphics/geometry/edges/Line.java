package com.gmail.rompar123.graphics.geometry.edges;

import java.util.ArrayList;

import com.gmail.rompar123.graphics.geometry.Point;

public class Line extends Edge {

	public Line(Point p1, Point p2){
		super (p1, p2);
	}
	
	@Override
	protected Point[] init(final Point p0, final Point p1) {
		final int deltaX = p1.getX() - p0.getX();
		final int deltaY = p1.getY() - p0.getY();
		final double deltaErr = (double)deltaY / deltaX;
		double error = Math.abs(deltaErr) - 0.5;
		ArrayList<Point> pointsList = new ArrayList<>(deltaX + 1);
		
		int y = p0.getY();
		for (int x = p0.getX(); x <= p1.getX(); x++){
			Point p = new Point(x ,y);
			error += deltaErr;
			if (error >= 0.5){
				y += 1;
				error -= 1;
			} else if (error <= -0.5){
				y -= 1;
				error += 1;
			}
			pointsList.add(p);
		}
		
		return pointsList.toArray(new Point[] {});
	}

}
