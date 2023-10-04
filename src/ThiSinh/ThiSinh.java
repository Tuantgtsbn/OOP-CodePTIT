package ThiSinh;

public class ThiSinh {
	private String name,dob;
	private float a,b,c,tongDiem;
	public ThiSinh(String name,String dob,float a,float b,float c) {
		this.name=name;
		this.dob=dob;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public float getA() {
		return a;
	}
	public float getB() {
		return b;
	}
	public float getC() {
		return c;
	}
	public float getTongDiem() {
		return tongDiem;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setA(float a) {
		this.a = a;
	}
	public void setB(float b) {
		this.b = b;
	}
	public void setC(float c) {
		this.c = c;
	}
	public void setTongDiem() {
		this.tongDiem =this.a+this.b+this.c;
	}
	@Override
	public String toString() {
		return this.name+" "+this.dob+" "+String.format("%.1f", this.tongDiem);
	}
	
	
}
