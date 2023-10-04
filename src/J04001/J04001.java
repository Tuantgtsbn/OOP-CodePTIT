package J04001;
import java.util.*;
public class J04001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			Point p1=new Point(x1,y1);
			x1=sc.nextDouble();
			y1=sc.nextDouble();
			Point p2=new Point(x1,y1);
			double dis=Point.distance(p1, p2);
			String result=String.format("%.4f", dis);
			System.out.println(result);
		}
	}

}
