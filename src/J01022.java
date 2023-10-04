import java.util.*;
public class J01022 {
	public static char result(long len[],int n,long k) {
		if(n==1&&k==1)return '0';
		else if(n==2&&k==1)return '1';
		else {
			if(k<=len[n-2])return result(len, n-2, k);
			else return result(len, n-1, k-len[n-2]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		long len[]=new long[93];
		len[1]=1;len[2]=1;
		for(int i=3;i<=92;i++)len[i]=len[i-1]+len[i-2];
		
		while(numTest-->0) {
			int n;
			long k;
			n=sc.nextInt();
			k=sc.nextLong();
			System.out.println(result(len,n,k));
		}
	}

}
