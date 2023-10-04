import java.util.*;
public class J02105 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		for(int i=0;i<n;i++) {
			List<Integer> tmp=new ArrayList<Integer>();
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				if(a[i][j]!=0) {
					tmp.add(j+1);
				}
			}
			list.add(tmp);
		}
		for(int i=0;i<list.size();i++) {
			System.out.print("List("+(i+1)+") = ");
			for(Integer z: list.get(i)) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
			
				
		
		
		
	}
}
