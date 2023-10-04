import java.math.BigInteger;
import java.util.*;
public class J03013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			BigInteger a=new BigInteger(sc.next());
			BigInteger b=new BigInteger(sc.next());
			BigInteger c= a.add(b.negate());
			String s=c.abs().toString();
			while(s.length()<Math.max(a.abs().toString().length(), b.abs().toString().length())) {
				s="0"+s;
			}
			System.out.println(s);
		}
	}

}
