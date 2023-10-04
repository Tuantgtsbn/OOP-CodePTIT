package ThucHanh;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			String S=sc.next();
			long sum=0;
			List<Character> list=new ArrayList<Character>();
			for(int i=0;i<S.length();i++) {
				if(Character.isDigit(S.charAt(i))==true) {
					sum+=Integer.parseInt(String.valueOf(S.charAt(i)));
				}else {
					list.add(S.charAt(i));
				}
			}
			Collections.sort(list);
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println(sum);
		}
	}

}
