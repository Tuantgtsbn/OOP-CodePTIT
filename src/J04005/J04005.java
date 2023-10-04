package J04005;

import java.util.*;
public class J04005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String dob=sc.nextLine();
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		ThiSinh ts=new ThiSinh(name, dob, a, b, c);
		ts.setTongDiem();
		System.out.println(ts);
	}

}
