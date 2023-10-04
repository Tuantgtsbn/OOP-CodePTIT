package J07045;
import java.util.*;
import java.io.*;
public class J07045 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("PHONG.in"));
		int num=Integer.parseInt(sc.nextLine());
		List<Phong> list=new ArrayList<Phong>();
		while(num-->0) {
			String[] arr=sc.nextLine().strip().split("\\s+");
			list.add(new Phong(arr[0], arr[1], arr[2], arr[3]));
			
		}
		Collections.sort(list, new Comparator<Phong>() {

			@Override
			public int compare(Phong o1, Phong o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		for (Phong i :list) {
			System.out.println(i);
		}
	}

}
