import java.util.*;
public class J02005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		int a[]=new int[1000];
		int b[]=new int[1000];
		for(int i=1;i<=n;i++) {
			int tmp=sc.nextInt();
			if(a[tmp]==0)a[tmp]++;
			
		}
		for(int i=1;i<=m;i++) {
			int tmp=sc.nextInt();
			if(b[tmp]==0)b[tmp]++;
		}
		for(int i=1;i<1000;i++) {
			if(a[i]==1||b[i]==1)System.out.print(i+" ");
		}
		
		

	}

}
