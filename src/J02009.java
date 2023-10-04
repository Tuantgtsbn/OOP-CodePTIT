import java.util.*;
public class J02009 {
	public static class Pair<K,V>{
		private K first;
		private V second;
		public Pair(K a, V b) {
			this.first=a;
			this.second=b;
		}
		public K getFirst() {
			return first;
		}
		public V getSecond() {
			return second;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());
		int time=0;
		List<Pair<Integer,Integer>> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(new Pair<Integer, Integer>(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(list,new Comparator<Pair<Integer, Integer>>() {

			@Override
			public int compare(J02009.Pair<Integer, Integer> o1, J02009.Pair<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getFirst()-o2.getFirst();
			}
			
		});
		for(int i=0;i<n;i++) {
			System.out.println(list.get(i).getFirst());
		}
		for(int i=0;i<n;i++) {
			if(time<list.get(i).getFirst()) {
				time=list.get(i).getFirst();
			}
			time=time+list.get(i).getSecond();
		}
		System.out.println(time);
		
		
		
		
		
	}

}
