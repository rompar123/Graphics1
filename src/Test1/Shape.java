package Test1;

import java.awt.Point;

public class Shape {

	private Point[] vertices;
	
	public Shape(Point[] vertices){
		this.vertices = vertices;
	}
	
	public Point[] getVertices(){
		return vertices;
	}
	
	public boolean isOnBoundry(int x, int y){
		return false; //TODO
	}
}
