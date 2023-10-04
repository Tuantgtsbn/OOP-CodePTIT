import java.util.*;
public class J03027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(st.isEmpty()==true||s.charAt(i)!=st.peek()) {
				st.add(s.charAt(i));
			}else {
				st.pop();
			}
		}
		if(st.isEmpty())System.out.println("Empty String");
		else {
			for(char i:st) {
				System.out.print(i);
			}
		}
		
		
	}

}
