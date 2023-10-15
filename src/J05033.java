import java.util.*;
class Time implements Comparable<Time>{
	private int hour,minute,second;
	
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	
	@Override
	
	public int compareTo(Time o) {
		// TODO Auto-generated method stub
		if(this.getHour()!=o.getHour()) {
			return this.getHour()-o.getHour();
		}else {
			if(this.getMinute()!=o.getMinute()) {
				return this.getMinute()-o.getMinute();
			}else {
				return this.getSecond()-o.getSecond();
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getHour()+" "+this.getMinute()+" "+this.getSecond();
	}
	
	
	
}
public class J05033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		List<Time> ls=new ArrayList<Time>();
		while(numTest-->0) {
			ls.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
			sc.nextLine();
		}
		Collections.sort(ls);
		for(Time i :ls) {
			System.out.println(i);
		}

	}
	

}
