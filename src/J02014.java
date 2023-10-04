import java.util.*;
public class J02014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		while(numTest-->0) {
			
			int n=sc.nextInt();
			long a[]=new long[n];
			long sum=0;
			long sumLeft[]=new long[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
				sum+=a[i];
				sumLeft[i]=sum;
			}
			boolean check=false;
			int index=0;
			for(int i=0;i<n-1;i++) {
				if(sumLeft[i]*2==sum+a[i]) {
					check=true;
					index=i;
					break;
					
				}
			}
			if(check==true)System.out.println(index+1);
			else System.out.println(-1);
			
		}
	}

}
