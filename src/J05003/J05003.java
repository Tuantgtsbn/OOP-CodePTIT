package J05003;
import java.util.*;
public class J05003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numSV=Integer.parseInt(sc.nextLine());
		List<SV> list=new ArrayList<SV>();
		while(numSV-->0) {
			String name=sc.nextLine();
			String classes=sc.nextLine();
			String birthDay=sc.nextLine();
			float GPA=Float.parseFloat(sc.nextLine());
			SV sv=new SV();
			sv.setBirthDay(birthDay);
			sv.setClasses(classes);
			sv.setGPA(GPA);
			sv.setName(name);
			sv.chuanhoa();
			sv.setID();
			list.add(sv);
			
		}
		for(SV i:list) {
			System.out.println(i.toString());
		}
	}

}
