import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J07003 {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("DATA_J07003.in"));
		BigInteger a=new BigInteger(sc.next());
		while(a.compareTo(new BigInteger("9"))==1) {
			String tmp=a.toString();
			int len=tmp.length();
			String tmp1=tmp.substring(0,len/2);
			String tmp2=tmp.substring(len/2);
//			System.out.println(tmp1+" "+tmp2);
			
			a=new BigInteger(tmp1).add(new BigInteger(tmp2));
			System.out.println(a);
		}
		
	}

}
