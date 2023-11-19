import java.io.File;
import java.io.IOException;
import java.util.*;
class Subject{
	private String subId,subName;

	public Subject(String subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
	
}
class Teacher{
	private String teachName,teachId;
	private float teachHour;
	public Teacher(String teachId, String teachName) {
		super();
		this.teachName = teachName;
		this.teachId = teachId;
		this.teachHour=0;
	}
	

	public String getTeachName() {
		return teachName;
	}

	public String getTeachId() {
		return teachId;
	}
	public void update(float a) {
		teachHour+=a;
	}
	public String toString() {
		return this.teachName+" "+String.format("%.2f", this.teachHour);
	}
}
public class J06007 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("MONHOC.in"));
		int numSub=Integer.parseInt(sc.nextLine());
		List<Subject> ls1=new ArrayList<Subject>();
		for(int i=0;i<numSub;i++) {
			
			ls1.add(new Subject(sc.next(),sc.nextLine().trim()));
			
			
		}
		sc=new Scanner(new File("GIANGVIEN.in"));
		int numTeach=Integer.parseInt(sc.nextLine());
		List<Teacher> ls2=new ArrayList<Teacher>();
		for(int i=0;i<numTeach;i++) {
			
			ls2.add(new Teacher(sc.next(),sc.nextLine().trim()));
			
			
		}
		sc=new Scanner(new File("GIOCHUAN.in"));
		int numClass=Integer.parseInt(sc.nextLine());
		for(int i=0;i<numClass;i++) {
			String[] tokens=sc.nextLine().trim().split(" ");
			for(int j=0;j<ls2.size();j++) {
				if(ls2.get(j).getTeachId().equals(tokens[0])) {
					ls2.get(j).update(Float.parseFloat(tokens[2]));
					
				}
			}
			
		}
		for(Teacher i:ls2) {
			System.out.println(i);
		}
	}

}
