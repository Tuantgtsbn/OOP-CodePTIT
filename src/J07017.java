import java.util.*;
import java.io.*;
public class J07017 {
	public static class Pair<K,V>{
		private K first_value;
		private V second_value;
		public Pair(K a,V b){
			first_value=a;
			second_value=b;
		}
		
		public K getFirst_value() {
			return first_value;
		}

		public V getSecond_value() {
			return second_value;
		}

		public boolean isPrime() {
			int fv=(Integer)getFirst_value();
			int sv=(Integer)getSecond_value();
			boolean check1=true;
			for(int i=2;i<(int)Math.sqrt(fv)+1;i++) {
				if(fv%i==0) {
					check1=false;
					break;
				}
				
			}
			boolean check2=true;
			for(int i=2;i<(int)Math.sqrt(sv)+1;i++) {
				if(sv%i==0) {
					check2=false;
					break;
				}
			}
			if(check1&&check2)return true;
			return false;
			
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			
			return first_value+" "+second_value;
		}
		
		
	}
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }

}
