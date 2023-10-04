import java.util.*;
public class J02034 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mark[]=new int[205];
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			mark[a[i]]=1;
		}
		if(a[n-1]==n)System.out.println("Excellent!");
		else {
			for(int i=1;i<=a[n-1];i++) {
				if(mark[i]==0)System.out.println(i);
			}
	
		}
		
	}
}
