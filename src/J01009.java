import java.util.*;
public class J01009 {
	public static long sum(long a[],int n) {
		long sum=0;
		for(int i=1;i<=n;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[21];
		a[1]=1;
		for(int i=2;i<=20;i++) {
			a[i]=a[i-1]*i;
		}
		System.out.println(sum(a, n));

	}

}
