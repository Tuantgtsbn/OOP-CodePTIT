import java.util.*;
public class J01017 {
	public static boolean check(long n) {
		long cmp=n%10;
		n/=10;
		while(n!=0) {
			long mod=n%10;
			if(Math.abs(cmp-mod)!=1)return false;
			n/=10;
			cmp=mod;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		while(numTest-->0) {
			long n=sc.nextLong();
			if(check(n)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}

}
