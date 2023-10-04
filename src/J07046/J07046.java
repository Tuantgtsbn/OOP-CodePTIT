package J07046;
import java.util.*;
import java.io.*;
public class J07046 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc=new Scanner(new File("KHACH.in"));
		int number=Integer.parseInt(sc.nextLine());
		List<Guest> list_guest=new ArrayList<Guest>();
		while(number-->0) {
			String name=sc.nextLine();
			String id=sc.nextLine();
			String check_in=sc.nextLine();
			String check_out=sc.nextLine();
			list_guest.add(new Guest(name, id, check_in, check_out));
			
		}
		Collections.sort(list_guest, new Comparator<Guest>() {

			@Override
			public int compare(Guest o1, Guest o2) {
				// TODO Auto-generated method stub
				return Guest.day_using(o2)-Guest.day_using(o1);
			}
			
		});
		for(Guest i:list_guest) {
			System.out.println(i);
		}
		
	}

}
