import java.util.*;
public class J01005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		while(numTest-->0) {
			int n,h;
			n=sc.nextInt();
			h=sc.nextInt();
			for(int i=1;i<=n-1;i++) {
				double result=h*Math.sqrt((double)i/n);
				String formatResult=String.format("%.6f", result);
				System.out.print(formatResult+" ");
				
			}
			System.out.println();
		}
	}

}
