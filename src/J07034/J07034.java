package J07034;
import java.io.*;
import java.util.*;
public class J07034 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("MONHOC.in"));
		int nums_subject=Integer.parseInt(sc.nextLine());
//		System.out.println(nums_subject);
		List<Subject> list=new ArrayList<Subject>();
		while(nums_subject-->0) {
			String id_subject=sc.nextLine();
			String name_subject=sc.nextLine();
			int tc=Integer.parseInt(sc.nextLine());
			list.add(new Subject(id_subject, name_subject, tc));
			
		}
		Collections.sort(list, new Comparator<Subject>() {

			@Override
			public int compare(Subject o1, Subject o2) {
				// TODO Auto-generated method stub
				return o1.getName_subject().compareTo(o2.getName_subject());
				
			}
			
		});
		for( Subject i:list) {
			System.out.println(i);
		}
	}

}
