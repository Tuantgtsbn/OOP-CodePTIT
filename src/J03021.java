import java.util.*;

public class J03021{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numTest=Integer.parseInt(sc.nextLine());
		int[] a=new int[100];
		a[65]=2;
		a[66]=2;
		a[67]=2;
		a[68]=3;
		a[69]=3;
		a[70]=3;
		a[71]=4;
		a[72]=4;
		a[73]=4;
		a[74]=5;
		a[75]=5;
		a[76]=5;
		a[77]=6;
		a[78]=6;
		a[79]=6;
		a[80]=7;
		a[81]=7;
		a[82]=7;
		a[83]=7;
		a[84]=8;
		a[85]=8;
		a[86]=8;
		a[87]=9;
		a[88]=9;
		a[89]=9;
		a[90]=9;
		while(numTest-->0) {
			String s=sc.nextLine();
			s=s.toUpperCase();
			int left=0,right=s.length()-1;
			boolean result=true;
			while(left<right) {
				int numLeft=a[(int)s.charAt(left)];
				int numRight=a[(int)s.charAt(right)];
				if(numLeft!=numRight) {
					result=false;
					break;
				}
				left++;
				right--;
			}
			if(result==true) {
				System.out.println("YES");
			}else System.out.println("NO");
		}
	}

}
