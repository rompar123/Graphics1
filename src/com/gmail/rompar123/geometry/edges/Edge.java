package com.gmail.rompar123.geometry.edges;

import com.gmail.rompar123.geometry.Point;

public abstract class Edge {

	protected Point[] points;
	
	protected Edge(Point p1, Point p2){
		Point pmin = p1.getX() < p2.getX() ? p1 : p2;
		Point pmax = p1.getX() > p2.getX() ? p1 : p2;
		points = init(pmin, pmax);
	}
	
	/**
	 * @return - an array of all the points existing on the edge
	 */
	protected abstract Point[] init(Point p1, Point p2);
	
	public boolean isOnEdge(Point p){
		if ( p.getX() <= points.length -1) { 
			return ( points[p.getX()].getY() == p.getY());
		} else {
			return false;
		}
	}
}
