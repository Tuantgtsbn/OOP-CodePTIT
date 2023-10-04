import java.util.*;
public class J02017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> st=new Stack<>() ;
		for(int i=0;i<n;i++) {
			int tmp=sc.nextInt();
			if(st.empty()||(st.peek()+tmp)%2!=0) {
				st.push(tmp);
			}else {
				st.pop();
			}
		}
		System.out.println(st.size());
	}

}
