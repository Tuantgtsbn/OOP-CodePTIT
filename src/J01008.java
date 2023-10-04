import java.util.*;
public class J01008 {
	static void ptsnt(long n) {
		int i;
		for(i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				System.out.print(" "+i);
				int mu=0;
				while(n%i==0) {
					mu+=1;
					n/=i;
				}
				System.out.print("("+mu+")");
			}
		}
		if(n>1)System.out.print(" "+n+"(1)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		for(int i=1;i<=numTest;i++) {
			long n=sc.nextLong();
			System.out.print("Test "+i+":");
			ptsnt(n);
			System.out.println();
			
		}
	}

}
