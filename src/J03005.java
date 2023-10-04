import java.util.*;
public class J03005 {
	static StringBuilder chuanhoa(String a) {
		a=a.trim();
		String ds[]=a.split("\\s+");
		StringBuilder s=new StringBuilder();
		for(int i=1;i<ds.length;i++) {
			ds[i]=ds[i].trim();
			s.append(Character.toUpperCase(ds[i].charAt(0)));
			for(int j=1;j<ds[i].length();j++) {
				s.append(Character.toLowerCase(ds[i].charAt(j)));
			}
			s.append(" ");
		}
		s.deleteCharAt(s.length()-1);
		s.append(", ");
		s.append(ds[0].toUpperCase());
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=sc.nextInt();
		sc.nextLine();
		while(numTest-->0) {
			String s=sc.nextLine();
			System.out.println(chuanhoa(s));
		}
	}

}
