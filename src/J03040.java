import java.util.*;
public class J03040 {
	public static boolean check1(String tmp) {
		for(int i=1;i<tmp.length();i++) {
			if(Integer.parseInt(String.valueOf(tmp.charAt(i)))<=Integer.parseInt(String.valueOf(tmp.charAt(i-1))))return false;
		}
		return true;
	}
	public static boolean check2(String tmp) {
//		String tmp=s.substring(5,8)+s.substring(9, 11);
		for(int i=1;i<tmp.length();i++) {
			if(Integer.parseInt(String.valueOf(tmp.charAt(i)))!=Integer.parseInt(String.valueOf(tmp.charAt(i-1))))return false;
		}
		return true;
	}
	public static boolean check3(String tmp) {
//		String tmp=s.substring(5,8)+s.substring(9, 11);
		for(int i=0;i<tmp.length();i++) {
			if(Integer.parseInt(String.valueOf(tmp.charAt(i)))!=6&&Integer.parseInt(String.valueOf(tmp.charAt(i)))!=8)return false;
		}
		return true;
	}
	public static boolean check4(String tmp) {
//		String tmp=s.substring(5,8)+s.substring(9, 11);
		if(tmp.charAt(1)!=tmp.charAt(0)||tmp.charAt(2)!=tmp.charAt(0)||tmp.charAt(3)!=tmp.charAt(4))return false;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			String tmp=sc.nextLine().trim();
			String s=tmp.substring(5,8)+tmp.substring(9,11);
			if(check1(s)||check2(s)||check3(s)||check4(s))System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
		
	}

}
