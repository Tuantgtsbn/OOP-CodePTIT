package J04003;
import java.util.*;
public class J04003 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		PhanSo ps1=new PhanSo(sc.nextLong(),sc.nextLong());
		PhanSo ps2=new PhanSo(sc.nextLong(),sc.nextLong());
		System.out.println(PhanSo.tongPs(ps1, ps2));
		sc.close();
		
	}

}
