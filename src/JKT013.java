import java.util.*;
public class JKT013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			int n=Integer.parseInt(sc.nextLine());
			Deque<String> d1=new ArrayDeque<String>();
			Deque<String> d2=new ArrayDeque<String>();
			d1.add("6");
			d1.add("8");
			d2.add("6");
			d2.add("8");
			
			while(d1.peek().length()<n) {
				String tmp=d1.poll();
				d1.add(tmp+"6");
				d1.add(tmp+"8");
				d2.add(tmp+"6");
				d2.add(tmp+"8");
				
			}
			System.out.println(d2.size());
			Iterator<String> i=d2.descendingIterator();
			while(i.hasNext()) {
				System.out.print(i.next()+" ");
			}
			System.out.println();
		}
	}

}
