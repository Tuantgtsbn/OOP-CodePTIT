package ThucHanh;
import java.util.*;
import java.io.*;
public class Test2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("D:\\Java_workspace\\Java_Code_Ptit\\src\\ThucHanh\\DAYSO.in"));
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			int n=sc.nextInt();
			List<Integer> list=new ArrayList<Integer>();
//			List<Integer>list=new ArrayList<Integer>()
			for(int i=0;i<n;i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
//			System.out.println(list);
			long sum=0;
			int mu=0;
			int index=n-1;
			while(index>=0==true) {
				
				if(index>=1) {
					int before=index-1;
					int sum1=list.get(index)+list.get(before);
					sum=(long)Math.pow(10, mu)*sum1+sum;
					index-=2;
					mu+=1;
					
				}else {
					sum=(list.get(index))*(long)Math.pow(10, mu)+sum;
					index-=1;
					mu+=1;
					
				}
				
				
			}
//			if(mod>0)sum=mod*(long)Math.pow(10, mu)+sum;
			
			System.out.println(sum);
		}
	}

}
