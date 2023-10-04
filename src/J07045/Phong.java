package J07045;

public class Phong {
	private String kyhieu,name,dongia,phi;

	public Phong(String kyhieu, String name, String dongia, String phi) {
		super();
		this.kyhieu = kyhieu;
		this.name = name;
		this.dongia = dongia;
		this.phi = phi;
	}

	public String getKyhieu() {
		return kyhieu;
	}

	public String getName() {
		return name;
	}

	public String getDongia() {
		return dongia;
	}

	public String getPhi() {
		return phi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getKyhieu()+" "+this.getName()+" "+this.getDongia()+" "+this.getPhi();
	}
	
}
