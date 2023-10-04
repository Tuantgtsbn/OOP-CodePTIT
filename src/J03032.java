import java.util.*;
public class J03032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			String s=sc.nextLine().trim();
			String[] arr=s.split("\\s+");
			for(String tmp:arr) {
				StringBuilder result=new StringBuilder(tmp);
				System.out.print(result.reverse()+" ");
			}
			System.out.println();
			
			
		}
	}

}
