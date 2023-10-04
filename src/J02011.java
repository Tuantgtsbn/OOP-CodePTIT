import java.util.*;
public class J02011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++) {
			int min=a[i-1];
			int indexMin=i-1;
			for(int j=i;j<n;j++) {
				if(a[j]<min) {
					min=a[j];
					indexMin=j;
				}
			}
			int tmp=a[i-1];
			a[i-1]=a[indexMin];
			a[indexMin]=tmp;
			System.out.print("Buoc "+i+":");
			for(int j=0;j<n;j++) {
				System.out.print(" "+a[j]);
			}
			System.out.println();
		}
	}

}
