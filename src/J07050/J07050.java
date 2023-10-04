package J07050;
import java.io.*;
import java.util.*;
public class J07050 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("MATHANG.in"));
		int num=Integer.parseInt(sc.nextLine());
		List<HangHoa> list=new ArrayList<HangHoa>();
		while(num-->0) {
			list.add(new HangHoa(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
			
		}
		Collections.sort(list, new Comparator<HangHoa>() {

			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return (int)(o2.getLn()-o1.getLn());
			
			}
			
		});
		for(HangHoa i :list) {
			System.out.println(i);
		}
	}

}
