import java.util.*;
public class J02008 {
	public static long gcd(long a,long b) {
		if(b==0)return a;
		else return gcd(b,a%b);
	}
	public static long lcm(long a,long b) {
		return a*b/gcd(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		while(numTest-->0) {
			int n=sc.nextInt();
			long result=1;
			for(int i=1;i<=n;i++) {
				result=lcm(result,i);
			}
			System.out.println(result);
		}
	}

}
