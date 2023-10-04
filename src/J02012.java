import java.util.*;
public class J02012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int index=i-1;
			while(index>=0&&b[index]>a[i]) {
				b[index+1]=b[index];
				index--;
			}
			b[index+1]=a[i];
			System.out.print("Buoc "+i+":");
			for(int j=0;j<=i;j++) {
				System.out.print(" "+b[j]);
			}
			System.out.println();
		}
	}

}
