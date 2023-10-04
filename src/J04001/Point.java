package J04001;
import java.util.*;
public class Point {
	public double x;
	public double y;
	public Point() {
		this.x=0;
		this.y=0;
	};
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public Point(Point y) {
		this.x=y.x;
		this.y=y.y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double distance(Point secondPoint) {
		double distanceX=Math.abs(this.x-secondPoint.x);
		double distanceY=Math.abs(this.y-secondPoint.y);
		return (double)Math.sqrt(Math.pow(distanceX, 2)+Math.pow(distanceY, 2));
	}
	public static double distance(Point p1, Point p2) {
		double distanceX=Math.abs(p1.x-p2.x);
		double distanceY=Math.abs(p1.y-p2.y);
		return (double)Math.sqrt(Math.pow(distanceX, 2)+Math.pow(distanceY, 2));
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
