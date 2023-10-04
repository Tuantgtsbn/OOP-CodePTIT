package J07010;

public class SV {
	private String id_student,name_student,dob_student,class_student;
	private float gpa_student;
	public static int index=0;
	public SV(String name_student, String dob_student, String class_student, float gpa) {
		
		
		this.name_student = name_student;
		this.dob_student = dob_student;
		this.class_student = class_student;
		this.gpa_student = gpa;
		
		index+=1;
	}
	public String getId_student() {
		return id_student;
	}
	public String getName_student() {
		return name_student;
	}
	public String getDob_student() {
		return dob_student;
	}
	public String getClass_student() {
		return class_student;
	}
	public float getGpa_student() {
		return gpa_student;
	}
	public static int getIndex() {
		return index;
	}
	public void setId_student() {
		String tmp="B20DCCN"+String.format("%03d", index);
		this.id_student =tmp;
	}
	
	public void setDob_student(String dob_student) {
		this.dob_student = dob_student;
	}
	public void chuanHoaDob() {
		String tmp=getDob_student();
		StringBuilder dob=new StringBuilder(tmp);
		if(dob.charAt(2)!='/') {
			dob.insert(0, '0');
		}
		if(dob.charAt(5)!='/') {
			dob.insert(3, '0');
		}
		setDob_student(dob.toString());
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId_student()+" "+getName_student()+" "+getClass_student()+" "+ getDob_student()+" "+String.format("%.2f", getGpa_student());
	}
	
	
	
	
	
	
	
}
