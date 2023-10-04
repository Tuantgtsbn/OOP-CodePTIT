import java.util.*;
public class J02013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			boolean isSorted=true;
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					isSorted=false;
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
			if(isSorted==true) {
				return;
			}
			System.out.print("Buoc "+(i+1)+":");
			for(int j=0;j<n;j++) {
				System.out.print(" "+a[j]);
			}
			System.out.println();
			
		}
	}

}
