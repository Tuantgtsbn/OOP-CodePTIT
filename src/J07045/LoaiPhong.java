package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
	private String kyhieu,name,dongia,phi;

	public LoaiPhong(String tmp) {
		String[] arr=tmp.trim().split("\\s+");
		this.kyhieu = arr[0];
		this.name = arr[1];
		this.dongia = arr[2];
		this.phi = arr[3];
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
	public int compareTo(LoaiPhong i) {
		return this.getName().compareTo(i.getName());
	}
}
