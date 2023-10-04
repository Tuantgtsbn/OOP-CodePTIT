package J05003;
import java.util.*;
public class SV {
	public String iD;
	public String name;
	public String birthDay;
	public String classes;
	public float GPA;
	public static int numSV=0;
	public SV() {
		iD=name=birthDay=classes="";
		GPA=0;
		numSV+=1;
	}
	
	public void chuanhoa() {
		String tmp=birthDay;
		StringBuilder s=new StringBuilder(tmp);
		if(Character.isDigit(s.charAt(1))==false) {
			s.insert(0,"0");
		}
		if(Character.isDigit(s.charAt(4))==false) {
			s.insert(3,"0");
		}
		
		birthDay=s.toString();
		
		
		
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public void setGPA(float gPA) {
		GPA = gPA;
	}

	public void setID() {
		if(numSV<10) {
			this.iD="B20DCCN00"+numSV;
		}else {
			this.iD="B20DCCN0"+numSV;
		}
	}
	@Override
	public String toString() {
		return iD+" "+name+" "+classes+" "+birthDay+" "+String.format("%.2f", GPA);
	}
	
	
	
	
	
}
