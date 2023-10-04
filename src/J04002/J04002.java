package J04002;
import java.util.*;
public class J04002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		String color=sc.next();
		Rectange P=new Rectange(width,height,color);
		if((int)width!=width||width<=0||(int)height!=height||height<=0)System.out.println("INVALID");
		else {
			StringBuilder s=new StringBuilder();
//			s.replace(0, 1, Character.toString(Character.toUpperCase(s.charAt(0))));
			String tmp=P.getColor();
			s.append(Character.toUpperCase(tmp.charAt(0)));
			for(int i=1;i<tmp.length();i++) {
				s.append(Character.toLowerCase(tmp.charAt(i)));
			}
			System.out.println((int)P.findPerimeter()+" "+(int)P.findArea()+" "+s);
			
			
			
		}
	}

}
