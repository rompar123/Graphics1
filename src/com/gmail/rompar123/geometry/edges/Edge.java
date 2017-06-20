package com.gmail.rompar123.geometry.edges;

import com.gmail.rompar123.geometry.Point;

public abstract class Edge {

	protected Point[] points;
	
	protected Edge(Point p1, Point p2){
		points = init(p1, p2);
	}
	
	/**
	 * 
	 * @param p1
	 * @param p2
	 * @return - an array of all the points existing on the edge
	 */
	protected abstract Point[] init(Point p1, Point p2);
	
	public boolean isOnEdge(Point p){
		return ( points[p.getX()].getY() == p.getY());
	}
}
