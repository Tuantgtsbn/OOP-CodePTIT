
import java.util.*;
public class J01004 {
		static boolean check(long n) {
		if(n<1)return false;
		if(n==2)return true;
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			if(check(n)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}

}
