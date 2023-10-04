import java.util.*;
public class J03025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			String a=sc.next();
			int left=0,right=a.length()-1;
			int cnt=0;
			while(left<right) {
				if(a.charAt(left)!=a.charAt(right)) {
					cnt+=1;
				}
				left++;
				right--;
			}
			if(cnt>1)System.out.println("NO");
			else if(cnt==1)System.out.println("YES");
			else {
				if(a.length()%2==0)System.out.println("NO");
				else System.out.println("YES");
			}
		}
		
	}

}
