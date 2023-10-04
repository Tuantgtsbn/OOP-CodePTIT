import java.util.*;
public class J01006 {
	static long a[]=new long[93];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		
		a[1]=1;a[2]=1;
		for(int i=3;i<=92;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		while(numTest-->0) {
			int n=sc.nextInt();
			System.out.println(a[n]);
		}
	}

}
