package com.gmail.rompar123.geometry.edges;

import com.gmail.rompar123.geometry.Point;

public class Line extends Edge {

	public Line(Point p1, Point p2){
		super (p1, p2);
	}
	
	@Override
	protected Point[] init(Point p1, Point p2) {
		Point pMin = p1.compareTo(p2) < 0 ? p1 : p2;
		Point pMax = pMin.equals(p1) ? p1 : p2;
		int size = Math.abs(p1.getX() - p2.getX()) +1;
		Point[] retPoints = new Point[size];
		int indexOffset = pMin.getX();
	
		
		return retPoints;
	}

}
