import java.math.BigInteger;
import java.util.*;
public class J08024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			int n=Integer.parseInt(sc.nextLine());
			Deque<String> q=new ArrayDeque<String>();
			String m=Integer.toString(n);
			q.add("9");
			while(true) {
				String tmp=q.poll();
				BigInteger a=new BigInteger(tmp);
				if(a.remainder(new BigInteger(m)).equals(BigInteger.ZERO)) {
					System.out.println(tmp);
					break;
					
				}else {
					q.add(tmp+"0");
					q.add(tmp+"9");
				}
			}
		}
	}

}
