package ThucHanh;
import java.util.*;
import java.io.*;
public class Test9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("D:\\Java_workspace\\Java_Code_Ptit\\src\\ThucHanh\\MATRIX.in"));
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int i=sc.nextInt();
			sc.nextLine();
			int[][] arr=new int[n][m];
			List<Integer>list=new ArrayList<Integer>();
			for(int x=0;x<n;x++) {
				for(int y=0;y<m;y++) {
					arr[x][y]=sc.nextInt();
				}
				list.add(arr[x][i-1]);
			}
			Collections.sort(list);
			for(int x=0;x<n;x++) {
				for(int y=0;y<m;y++) {
					if(y==i-1) {
						System.out.print(list.get(x)+" ");
					}else {
						System.out.print(arr[x][y]+" ");
					}
				}
				System.out.println();
			}
		}
	}

}
