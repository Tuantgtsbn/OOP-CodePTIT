import java.util.*;
public class J01014 {
	public static long result(long n) {
		long result=0;
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			while(n%i==0) {
				result=i;
				n/=i;
			}
		}
		if(n!=1) result=n;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		while(numTest-->0) {
			long n=sc.nextLong();
			System.out.println(result(n));
		}
	}

}
