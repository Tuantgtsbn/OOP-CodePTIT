import java.util.*;
public class J02106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][3];
		int cnt=0;
		for(int i=0;i<n;i++) {
			int cnt1=0;
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
				if(a[i][j]==1)cnt1++;
				
			}
			if(cnt1*2>3)cnt++;
		}
		System.out.println(cnt);
	}

}
