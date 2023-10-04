import java.util.*;
public class J01016 {
	public static boolean check(long n) {
		int dem=0;
		while(n!=0) {
			long mod=n%10;
			if(mod==4||mod==7)dem++;
			n/=10;
		}
		if(dem==4||dem==7)return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		if(check(n)==true) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
