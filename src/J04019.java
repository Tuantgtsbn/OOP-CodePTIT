import java.util.*;
class Point {
	private float x,y;
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
		
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public static Point nextPoint(Scanner sc) {
		return new Point(sc.nextFloat(),sc.nextFloat());
	}
	public static float distance(Point p1,Point p2) {
		return (float) Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
	}
	
	
}
class Triangle{
	private Point p1,p2,p3;
	private float d1,d2,d3;
	public Triangle(Point p1,Point p2,Point p3) {
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
	}
	public boolean valid() {
		d1=Point.distance(p1, p2);
		d2=Point.distance(p2, p3);
		d3=Point.distance(p3, p1);
		if(d1+d2==d3||d1+d3==d2||d2+d3==d1) return false;
		else return true;
	}
	public String getPerimeter() {
		return String.format("%.3f", (float)d1+d2+d3);
	}
	
}
public class J04019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t-- >0){
	        	sc.nextLine();
	            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
	            if(!a.valid()){
	                System.out.println("INVALID");
	            } else{
	                System.out.println(a.getPerimeter());
	            }
	        }
	}

}
