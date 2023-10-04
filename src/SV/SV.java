package SV;

public class SV {
 private String name;
 private long ld,sm;
 public SV(String name,long ld,long sm) {
	 this.name=name;
	 this.ld=ld;
	 this.sm=sm;
 }
 
public String getName() {
	return name;
}

public long getLd() {
	return ld;
}

public long getSm() {
	return sm;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return name+" "+ld+" "+sm;
}
 
}
