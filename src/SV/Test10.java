package SV;
import java.io.*;
import java.util.*;
public class Test10 {
    
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("LUYENTAP.in"));
		int numTest=Integer.parseInt(sc.nextLine());
//		System.out.println(numTest);
		List<SV> list=new ArrayList<SV>();
		while(numTest-->0) {
			String name=sc.nextLine();
//			sc.nextLine();
//			System.out.println(name);
//			long ld=Long.parseLong(sc.nextLine());
//			long sm=Long.parseLong(sc.nextLine());
//			sc.next();
			String s=sc.nextLine();
			String[]arr=s.split("\\s+");
			long ld=Long.parseLong(arr[0]);
			long sm=Long.parseLong(arr[1]);
			
			
			
			
			
			
			list.add(new SV(name,ld,sm));
		}
		Collections.sort(list,new Comparator<SV>() {

			@Override
			public int compare(SV o1, SV o2) {
				int cmpld=Long.compare(o2.getLd(), o1.getLd());
				if(cmpld!=0) {
					return cmpld;
				}
				else {
					int cmpsm=Long.compare(o1.getSm(),o2.getSm());
					if(cmpsm!=0) {
						return cmpsm;
					}else {
						return o1.getName().compareTo(o2.getName());
					}
				}
					
				
				
			}
			
		});
		for(SV i:list) {
			System.out.println(i);
		}
	}

}
