import java.util.*;
import java.io.*;
public class J07004 {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		int a[]=new int[1000];
		Scanner sc=new Scanner(new File("DATA_J07004.in"));
		while(sc.hasNextInt()) {
			a[sc.nextInt()]+=1;
		}
		for(int i=0;i<1000;i++) {
			if(a[i]>0) {
				System.out.println(i+" "+a[i]);
			}
		}
	}

}
