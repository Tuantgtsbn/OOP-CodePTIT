import java.io.*;
import java.util.*;
public class J07085 {
	public static String detectZero(String s) {
		StringBuilder a=new StringBuilder(s);
		while(a.charAt(0)=='0') {
			a.deleteCharAt(0);
		}
		return a.toString();
	}
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<String>arr=(ArrayList<String>) ois.readObject();
		for(String i:arr) {
			String tmp="";
			int sum=0;
			for(int j=0;j<i.length();j++) {
				if(Character.isDigit(i.charAt(j))) {
					tmp+=i.charAt(j);
					sum+=Integer.parseInt(String.valueOf(i.charAt(j)));
				}
			}
			System.out.println(detectZero(tmp)+" "+sum);
		}
		
	}

}
