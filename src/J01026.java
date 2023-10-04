import java.util.*;

public class J01026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		while(numTest-->0) {
			long n=sc.nextLong();
			long b=(long)Math.sqrt(n);
			
			if(b*b!=n) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}

}
