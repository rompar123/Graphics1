package com.gmail.rompar123.geometry;

public class Point implements Comparable<Point>{

	private int x,y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
		if (x < 0 || y < 0){
			throw new IllegalArgumentException("both x and y shouldn't be less than 0");
		}
	}
	
	public int getX(){ return x; }
	public int getY(){ return y; }

	@Override
	/**
	 * return the point closer to POSSITIVE_INF, on the X axes ,as the bigger
	 */
	public int compareTo(Point p) {
		return ( this.getX() - p.getX() );
	}
	
	@Override
	public boolean equals(Object point){
		if (point instanceof Point){
			Point p = (Point)point;
			if (this.getX() == p.getX() && this.getY() == p.getY()){
				return true;
			} else {/*default case false*/}
		} else {/*default case false*/}
		return false;
	}
}
