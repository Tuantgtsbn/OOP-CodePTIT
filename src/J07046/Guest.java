package J07046;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Guest {
	private String name_guest,id_guest,id_room,check_in,check_out;
	public static int index=0;
	public Guest(String name_guest, String id_room, String check_in, String check_out) {
		super();
		this.name_guest = name_guest;
		this.id_room = id_room;
		this.check_in = check_in;
		this.check_out = check_out;
		this.setId_guest();
	}
	public void setId_guest() {
		index+=1;
		this.id_guest ="KH"+String.format("%02d", index);
	}
	public String getName_guest() {
		return name_guest;
	}
	public String getId_guest() {
		return id_guest;
	}
	public String getId_room() {
		return id_room;
	}
	public String getCheck_in() {
		return check_in;
	}
	public String getCheck_out() {
		return check_out;
	}
	public static int getIndex() {
		return index;
	}
	public static int day_using(Guest a) {
		String date1=a.getCheck_in();
		String date2=a.getCheck_out();
		String[] Date1=date1.split("/");
		String[] Date2=date2.split("/");
		LocalDate check_in=LocalDate.of(Integer.parseInt(Date1[2]),Integer.parseInt(Date1[1]),Integer.parseInt(Date1[0]));
		LocalDate check_out=LocalDate.of(Integer.parseInt(Date2[2]),Integer.parseInt(Date2[1]),Integer.parseInt(Date2[0]));
//		if(check_in.equals(check_out))return 0;
		return (int) ChronoUnit.DAYS.between(check_in, check_out);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId_guest()+" "+this.getName_guest()+" "+this.getId_room()+" "+day_using(this);
	}
	
	
}
