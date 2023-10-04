import java.math.BigInteger;
import java.util.*;
public class J03015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
			BigInteger a=new BigInteger(sc.nextLine());
			BigInteger b=new BigInteger(sc.nextLine());
			BigInteger c= a.add(b.negate());
			System.out.println(c);

		
	}

}
