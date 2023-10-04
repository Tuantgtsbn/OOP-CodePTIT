import java.util.*;
public class J03009 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			Set<String> set1=new TreeSet<>();
			Set<String> set2=new TreeSet<>();
			String s1=sc.nextLine().trim();
			String s2=sc.nextLine().trim();
			String[] S1=s1.split("\\s+");
			String[] S2=s2.split("\\s+");
			for(String s:S1) {
				set1.add(s);
			}
			
			for(String s:S2) {
				set2.add(s);
			}
			for(String s:set1) {
				if(set2.contains(s)!=true) {
					System.out.print(s+" ");
				}
			}
			System.out.println();
			
		}
//		sc.close();
		
	}

}
