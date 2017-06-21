package com.gmail.rompar123.graphics.geometry.edges;

import com.gmail.rompar123.graphics.geometry.Point;

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
	
	public Point[] getPoints(){ return points; }
	/**
	 * @return - return the base point of the edge ( relative 0,0 point of this edge )
	 */
	public Point getBasePoint(){ return points[0]; }
	
	public boolean isOnEdge(Point p){
		if ( p.getX() <= points.length -1) { 
			return ( points[p.getX()].getY() == p.getY());
		} else {
			return false;
		}
	}
}
