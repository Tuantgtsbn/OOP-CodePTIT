package J07034;

public class Subject {
	private String id_subject,name_subject;
	private int tc;
	public Subject(String a,String b,int c) {
		id_subject=a;
		name_subject=b;
		tc=c;
	}
	
	public String getId_subject() {
		return id_subject;
	}

	public String getName_subject() {
		return name_subject;
	}

	public int getTc() {
		return tc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id_subject+" "+name_subject+" "+tc;
	}
	
}
