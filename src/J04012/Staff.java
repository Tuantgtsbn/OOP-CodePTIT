package J04012;

public class Staff {
	private String staffId,staffName,staffPosition;
	private long staffLcb,staffSnc;
	
	public Staff(String staffName, long staffLcb, long staffSnc,String staffPosition) {
		super();
		this.staffId = "NV01";
		this.staffName = staffName;
		this.staffPosition = staffPosition;
		this.staffLcb = staffLcb;
		this.staffSnc = staffSnc;
	}
	public long luongthang() {
		return staffLcb*staffSnc;
	}
	public long luongthuong() {
		if(staffSnc<22)return 0;
		else if(staffSnc<25)return (long)luongthang()/10;
		else if(staffSnc>=25)return (long)luongthang()*2/10;
		return staffLcb;
		
	}
	public long phucap() {
		if(staffPosition.equals("GD")) {
			return 250000;
		}else if(staffPosition.equals("PGD")) {
			return 200000;
		}else if(staffPosition.equals("TP")) {
			return 180000;
		}else return 150000;
	}
	public long thunhap(long a,long b,long c) {
		return a+b+c;
	}
	public String toString() {
		long a=luongthang();
		long b=luongthuong();
		long c=phucap();
		long d=thunhap(a, b, c);
		return staffId+" "+staffName+" "+a+" "+b+" "+c+" "+d;
	}
	
	
	
}
