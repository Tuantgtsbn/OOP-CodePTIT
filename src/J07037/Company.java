package J07037;

public class Company {
	private String name_company,id_company;
	private int number_student;
	public Company(String a, String b, int c) {
		id_company=a;
		name_company=b;
		number_student=c;
	}
	public String getName_company() {
		return name_company;
	}
	public String getId_company() {
		return id_company;
	}
	public int getNumber_student() {
		return number_student;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id_company+" "+name_company+" "+number_student;
	}
	
	
}
