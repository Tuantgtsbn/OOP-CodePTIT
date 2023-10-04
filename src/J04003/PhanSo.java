package J04003;

public class PhanSo {
	private long tu,mau;
	public PhanSo(long a,long b) {
		this.tu=a;
		this.mau=b;
	}
	
	public long getTu() {
		return tu;
	}
	public long getMau() {
		return mau;
	}
	public static long gcd(PhanSo a) {
			long t=a.getTu();
			long m=a.getMau();
			if(m==0)return t;
			else return gcd(new PhanSo(m, t%m));
		
	}
	public static PhanSo tongPs(PhanSo a,PhanSo b) {
		return new PhanSo(a.getTu()*b.getMau()+b.getTu()*a.getMau(), a.getMau()*b.getMau());
	}

	@Override
	public String toString() {
		long gcd=PhanSo.gcd(this);
		
		return this.getTu()/gcd+"/"+this.getMau()/gcd;
	}
	
	
}
