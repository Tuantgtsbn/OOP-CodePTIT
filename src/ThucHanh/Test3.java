package ThucHanh;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			int len=Integer.parseInt(sc.nextLine());
			String s=sc.nextLine();
			int maxLength=find(s,len);
			System.out.println(maxLength);
//			System.out.println(s.length());
			
		}
		
	}
	public static int find(String s,int n) {
		int[][]dp=new int[n+10][n+10];
		for(int i=1;i<=n;i++) {
			for(int j=1;i<=n;j++) {
				if(i!=j) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[n-1][n];
		
	}

}
