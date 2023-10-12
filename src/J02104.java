import java.util.*;
public class J02104 {
	public static class  Pair<K,V> {
	    private K key;
	    private V value;

	    public Pair(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }

	    public K getKey() {
	        return key;
	    }

	    public V getValue() {
	        return value;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		List<Pair<Integer,Integer>>list=new ArrayList<Pair<Integer,Integer>>();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i][j]!=0) {
					list.add(new Pair(i+1,j+1));
				}
			}
		}
//		list.forEach(item->System.out.println("("+item.key+","+item.value+")"));
//		sc.close();
		for(Pair<Integer,Integer> item:list) {
			System.out.println("("+item.key+","+item.value+")");
		}
	}

}
