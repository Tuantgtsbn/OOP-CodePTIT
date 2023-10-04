import java.util.*;
import java.io.*;
public class J07029 {
	public static boolean isPrime(int number) {
		if(number<2)return false;
		else {
			for(int i=2;i<=(int)Math.sqrt(number);i++) {
				if(number%i==0)return false;
			}
			return true;
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Integer> arrList=(ArrayList<Integer>)ois.readObject();
		int[] arrInt=new int[1000001];
		for(Integer i:arrList) {
			if(isPrime(i.intValue())==true) {
				arrInt[i]++;
			}
		}
		int cnt=0;
		for(int i=1000000;i>=0&&cnt<10;i--) {
			if(arrInt[i]>0) {
				cnt++;
				System.out.println(i+" "+arrInt[i]);
			}
		}
	}

}
