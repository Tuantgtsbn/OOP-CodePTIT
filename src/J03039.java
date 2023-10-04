import java.math.BigInteger;
import java.util.*;
public class J03039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			BigInteger a=new BigInteger(sc.next());
			BigInteger b=new BigInteger(sc.next());
			if(a.mod(b).equals(new BigInteger("0"))||b.mod(a).equals(new BigInteger("0")))System.out.println("YES");
			else System.out.println("NO");
		}

	}

}
