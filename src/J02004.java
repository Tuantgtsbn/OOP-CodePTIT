import java.util.*;
public class J02004 {
	public static boolean check(long a[],int n) {
		int left=0,right=n-1;
		while(left<right) {
			if(a[left]!=a[right])return false;
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		while(numTest-->0) {
			int n=sc.nextInt();
			long []a=new long[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
				
			}
			if(check(a,n)==true)System.out.println("YES");
			else System.out.println("NO");
			}
		
	}

}
