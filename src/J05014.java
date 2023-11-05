import java.util.*;
class Teacher1 implements Comparable<Teacher1>{
	private String id,name,uutien,cm;
	private float dtin,dcm,dtong;
	private static int cnt=0;

	public Teacher1(String name, String uutien, float dtin, float dcm) {
		super();
		this.name = name;
		this.uutien = uutien;
		this.dtin = dtin;
		this.dcm = dcm;
		cnt++;
		this.id=String.format("GV%02d", cnt);
	}
	void update() {
		
		char x=this.uutien.charAt(1);
		float tong=this.dtin*2+this.dcm;
		if(x=='1')tong+=2;
		else if(x=='2')tong+=1.5;
		else if(x=='3')tong+=1;
		this.dtong=tong;
		char y=this.uutien.charAt(0);
		if(y=='A')this.cm="TOAN";
		if(y=='B')this.cm="LY";
		if(y=='C')this.cm="HOA";
		
	}
	public  String check() {
		if(this.dtong>=18)return "TRUNG TUYEN";
		else return "LOAI";
	}
	@Override
	public int compareTo(Teacher1 o) {
		// TODO Auto-generated method stub
		if(o.dtong!=this.dtong)return (int)(o.dtong-this.dtong);
		else return this.id.compareTo(o.id);
	}
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.cm+" "+String.format("%.1f", this.dtong)+" "+this.check();
	}
	
	
	
}
public class J05014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		List<Teacher1> ls=new ArrayList<Teacher1>();
		while(num-->0) {
			Teacher1 tmp=new Teacher1(sc.nextLine(),sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
			tmp.update();
			ls.add(tmp);
			
		}
		Collections.sort(ls);
		for(Teacher1 i:ls) {
			System.out.println(i);
		}
	}

}
