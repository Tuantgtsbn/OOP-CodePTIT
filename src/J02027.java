
import java.util.*;
public class J02027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			int n,k;
			n=sc.nextInt();
			k=sc.nextInt();
			List<Integer>list=new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
//			System.out.println(list);
			long[]arr=new long[n];
			int index=0;
			for(int i=1;i<n;i++) {
				int start=index;
				while(list.get(i)-list.get(start)>=k) {
					start++;

				}
				arr[i]=arr[i-1]+i-start;
				if(start!=index)index=start-1;
				else index=start;
				
				
				
			}
			System.out.println(arr[n-1]);
			
		}
	}

}
