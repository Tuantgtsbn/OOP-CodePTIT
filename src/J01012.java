import java.util.*;
public class J01012 {
	public static int result(long n) {
		int result=0;
		int dem=0;
		while(n%2==0) {
			dem+=1;
			n/=2;
		}
		if(dem==0)return 0;
		else {
			result=dem;
			for(int i=2;i<=(int)Math.sqrt(n);i++) {
				if(n%i==0) {
					int mu=0;
					while(n%i==0) {
						mu++;
						n/=i;
					}
					result*=(mu+1);
					
				}
			}
			if(n!=1) result*=2;
			return result;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest =sc.nextInt();
		while(numTest-->0) {
			long n=sc.nextLong();
			System.out.println(result(n));
			
		}
	}

}
