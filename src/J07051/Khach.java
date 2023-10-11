package J07051;
import java.io.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Khach {
	public static int[] price_per_day= {25,34,50,80};
	public static int index=0;
	private String name,start_day,end_day,id;
	
	private int room,service;
	public Khach(String name, int room, String start_day, String end_day, int service) {
		super();
		this.name = name;
		this.start_day = start_day;
		this.end_day = end_day;
		this.room = room;
		this.service = service;
		index+=1;
		this.setId();
		
	}
	public void setId() {
		this.id = "KH"+String.format("%02d", index);
	}
	public String getId() {
		return id;
	}
	
	public static int getIndex() {
		return index;
	}
	public static void setIndex(int index) {
		Khach.index = index;
	}
	public static int[] getPrice_per_day() {
		return price_per_day;
	}
	public String getName() {
		return name;
	}
	public String getStart_day() {
		return start_day;
	}
	public String getEnd_day() {
		return end_day;
	}
	public int getRoom() {
		return room;
	}
	public int getService() {
		return service;
	}
	public String chuanhoaten() {
		String tmp=this.getName();
		String[] arr=tmp.trim().split("\\s+");
		StringBuilder a=new StringBuilder();
		for(String i:arr) {
			i=i.toLowerCase();
			a.append(String.valueOf(i.charAt(0)).toUpperCase());
			for(int j=1;j<i.length();j++) {
				a.append(i.charAt(j));
			}
			a.append(" ");
			
		}
		return a.toString();
		
		
	}
	public long songay() {
		String day_start=this.getStart_day();
		String[] arr1=day_start.split("/+");
		String day_end=this.getEnd_day();
		String[] arr2=day_end.split("/+");
		
		LocalDate startDate=LocalDate.of(Integer.parseInt(arr1[2]),Integer.parseInt(arr1[1]) , Integer.parseInt(arr1[0]));
		LocalDate endDate=LocalDate.of(Integer.parseInt(arr2[2]),Integer.parseInt(arr2[1]) , Integer.parseInt(arr2[0]));
		return ChronoUnit.DAYS.between(startDate, endDate)+1;
	}
	
	public long price() {
		String tmp=Integer.toString(this.getRoom());
		int floor=Integer.parseInt(String.valueOf(tmp.charAt(0)));
		return songay()*price_per_day[floor-1]+this.getService();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId()+" "+this.chuanhoaten()+this.getRoom()+" "+this.songay()+" "+this.price();
	}
	
	
	
	
	
	
}
