package J07010;
import java.util.*;
import java.io.*;
public class J07010 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("SV.in"));
		int number_student=Integer.parseInt(sc.nextLine());
		List<SV> list_sv=new ArrayList<SV>();
		while(number_student-->0) {
			String name=sc.nextLine();
			String lop=sc.nextLine();
			String dob=sc.nextLine();
			float gpa=Float.parseFloat(sc.nextLine());
			SV a=new SV(name,dob,lop,gpa);
			a.setId_student();
			a.chuanHoaDob();;
			list_sv.add(a);
		}
		sc.close();
//		PrintWriter pw=new PrintWriter(new File("D:\\Java_workspace\\Java_Code_Ptit\\src\\J07010\\result.txt"));
		for(SV a:list_sv) {
			System.out.println(a.toString());
		}
		
	}

}
