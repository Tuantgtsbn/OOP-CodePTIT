import java.util.*;
public class J01024 {
	public static boolean check(long n) {
		while(n!=0) {
			int mod=(int)n%10;
			if(mod!=1&&mod!=2&&mod!=0)return false;
			n/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		while(numTest-->0) {
			long n=sc.nextLong();
			if(check(n)==true)System.out.println("YES");
			else System.out.println("NO");

		}
	}

}
