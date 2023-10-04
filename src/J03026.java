import java.util.*;
public class J03026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			String a=sc.nextLine();
			String b=sc.nextLine();
			if(a.equals(b)) {
				System.out.println(-1);
			}else {
				System.out.println(Math.max(a.length(),b.length()));
			}
		}
	}

}
