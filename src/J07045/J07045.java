package J07045;
import java.util.*;
import java.io.*;
public class J07045 {
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		ArrayList<LoaiPhong> ds = new ArrayList<>();
		Scanner in =new Scanner(new File("D:\\Java_workspace\\OOP-CodePTIT\\src\\J07045\\PHONG.in"));
		int n=Integer.parseInt(in.nextLine());
		//List<LoaiPhong> list=new ArrayList<LoaiPhong>();
		while(n-->0) {
			ds.add(new LoaiPhong(in.nextLine()));
		}
		Collections.sort(ds);
		for (LoaiPhong tmp :ds) {
			System.out.println(tmp);
		}
	}

}
