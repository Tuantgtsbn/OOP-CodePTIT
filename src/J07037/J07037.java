package J07037;
import java.io.*;
import java.util.*;
public class J07037 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("DN.in"));
		int nums_company=Integer.parseInt(sc.nextLine());
//		System.out.println(nums_company);
		List<Company> list=new ArrayList<Company>();
		while(nums_company-->0) {
			String id_company=sc.nextLine();
			String name_company=sc.nextLine();
			int number_sudent=Integer.parseInt(sc.nextLine());
			list.add(new Company(id_company, name_company, number_sudent));
			
		}
		Collections.sort(list, new Comparator<Company>() {

			@Override
			public int compare(Company o1, Company o2) {
				// TODO Auto-generated method stub
				return o1.getId_company().compareTo(o2.getId_company());
				
			}
			
		});
		for( Company i:list) {
			System.out.println(i);
		}
	}

}
