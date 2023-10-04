import java.util.*;
public class J03007 {
	public static boolean check(int a) {
		if(a==2||a==3||a==5||a==7)return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		sc.nextLine();
		while(numTest-->0) {
			String s=sc.nextLine();
			char[] arr=s.toCharArray();
			int left=0,right=arr.length-1;
			int mark=1;
				while(left<right) {
					if(arr[left]!=arr[right]||check((int)arr[left]-(int)'0')==false) {
						mark=0;
						break;
					}
					left++;
					right--;

					
				}
				if(mark==1)System.out.println("YES");
				else System.out.println("NO");
				
			}
		}

	}


