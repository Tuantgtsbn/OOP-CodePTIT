import java.util.*;
import java.io.*;
public class J07015 {
	public static boolean isPrime(int number) {
		if(number<2)return false;
		else {
			for(int i=2;i<=(int)Math.sqrt(number);i++) {
				if(number%i==0)return false;
			}
			return true;
		}
	}
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream a=new FileInputStream("SONGUYEN.in");
		ObjectInputStream ois=new ObjectInputStream(a);
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		try {
			arrlist=(ArrayList<Integer>)ois.readObject();
		}
		catch (ClassCastException e) {
			// TODO: handle exception
		}
		
		int[] arr=new int[10005];
		for(Integer i :arrlist) {
			if(isPrime(i.intValue())==true) {
				arr[i.intValue()]+=1;
			}
		}
		for(int i=0;i<=10000;i++) {
			if(arr[i]>0) {
				System.out.println(i+" "+arr[i]);
			}
		}
		
	}

}
