package J07051;
import java.util.*;
import java.io.*;
public class J07051 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("D:\\Java_workspace\\OOP-CodePTIT\\src\\J07051\\KHACHHANG.in"));
		int num=Integer.parseInt(sc.nextLine());
		List<Khach> list=new ArrayList<Khach>();
		while(num-->0) {
			list.add(new Khach(sc.nextLine().trim(), Integer.parseInt(sc.nextLine().trim()), sc.nextLine().trim(), sc.nextLine().trim(),Integer.parseInt(sc.nextLine().trim())));
			
		}
		Collections.sort(list, new Comparator<Khach>() {

			@Override
			public int compare(Khach o1, Khach o2) {
				// TODO Auto-generated method stub
				return (int)(o2.price()-o1.price());
			}
			
		});
		for(Khach i:list) {
			System.out.println(i);
		}
		

		
	}

}
