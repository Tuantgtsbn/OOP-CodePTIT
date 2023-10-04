import java.util.*;

public class J03010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		while(numTest-->0) {
			String s=sc.nextLine().trim();
			s=s.toLowerCase();
			String[] a=s.split("\\s+");
			String tmp=a[a.length-1];
			for(int i=0;i<a.length-1;i++) {
				tmp=tmp+a[i].charAt(0);
			}
			if(map.containsKey(tmp)!=true) {
				map.put(tmp, 1);
				System.out.println(tmp+"@ptit.edu.vn");
			}else {
				int n=map.get(tmp);
				map.put(tmp,n+1);
				System.out.println(tmp+(n+1)+"@ptit.edu.vn");
				
			}
			
		}
	}

}
