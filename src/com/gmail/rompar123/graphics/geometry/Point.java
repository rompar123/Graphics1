package com.gmail.rompar123.graphics.geometry;

public class Point{

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

}
