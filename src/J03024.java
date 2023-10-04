import java.util.*;
public class J03024 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numTest=Integer.parseInt(sc.nextLine());
		while(numTest-->0) {
			String s=sc.nextLine().trim();
			int mark=1;
			int chan=0,le=0;
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i))==false) {
					mark=0;
					break;
				}
				if((int)s.charAt(i)%2==0) chan+=1;
				else le+=1;
				
			}
			if(mark==0)System.out.println("INVALID");
			else {
				if((s.length()%2==0 && chan>le)||(s.length()%2==1 && le>chan)) {
					System.out.println("YES");
				}else System.out.println("NO");
				
			}
			
		}
	}

}
