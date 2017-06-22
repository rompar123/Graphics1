package com.gmail.rompar123.graphics.geometry.edges;

import java.util.ArrayList;

import com.gmail.rompar123.graphics.geometry.Point;

public class Line extends Edge {

	public Line(Point p1, Point p2){
		super (p1, p2);
	}
	
//	@Override
//	protected Point[] init(final Point p0, final Point p1) {
//		final int deltaX = p1.getX() - p0.getX();
//		final int deltaY = p1.getY() - p0.getY();
//		final double deltaErr = (double)deltaY / deltaX;
//		double error = Math.abs(deltaErr) - 0.5;
//		ArrayList<Point> pointsList = new ArrayList<>(deltaX + 1);
//		
//		int y = p0.getY();
//		for (int x = p0.getX(); x <= p1.getX(); x++){
//			Point p = new Point(x ,y);
//			error += deltaErr;
//			if (error >= 0.5){
//				y += 1;
//				error -= 1;
//			} else if (error <= -0.5){
//				y -= 1;
//				error += 1;
//			}
//			pointsList.add(p);
//		}
//		
//		return pointsList.toArray(new Point[] {});
//	}
	
	@Override
	protected Point[] init(final Point p0, final Point p1) {
		ArrayList<Point> line = new ArrayList<Point>();
        
		int x0 = p0.getX();
		int x1 = p1.getX();
		int y0 = p0.getY();
		int y1 = p1.getY();
		
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
 
        int sx = x0 < x1 ? 1 : -1; 
        int sy = y0 < y1 ? 1 : -1; 
 
        int err = dx-dy;
        int e2;
 
        while (true) 
        {
            line.add(new Point(x0, y0));
 
            if (x0 == x1 && y0 == y1) 
                break;
 
            e2 = 2 * err;
            if (dx == 0)
            {
            	y0 = y0 + sy;
            }
            if (e2 > -dy) 
            {
            	err = err - dy;
                x0 = x0 + sx;
            }
            if (e2 < dx) 
            {
                err = err + dx;
                y0 = y0 + sy;
            }
        }                                
        return line.toArray(new Point[] {});
	}

}
