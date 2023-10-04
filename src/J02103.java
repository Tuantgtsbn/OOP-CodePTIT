
import java.util.*;
public class J02103 {
	public static void result(int a[][],int b[][],int n,int m) {
		int[][] c=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int z=0;z<m;z++) {
					c[i][j]+=a[i][z]*b[z][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		for(int test=1;test<=numTest;test++) {
			int n,m;
			n=sc.nextInt();
			m=sc.nextInt();
			int[][] a=new int[n][m];
			int[][] b=new int[m][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					b[i][j]=a[j][i];
				}
			}
			System.out.println("Test "+test+":");
			result(a, b, n, m);
			
			
		}
	}

}
