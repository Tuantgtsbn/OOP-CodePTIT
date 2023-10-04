import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class J07002 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("DATA_J07002.in"));
		long sum=0;
		while(sc.hasNext()) {
			try {
				int x=Integer.parseInt(sc.next());
				sum+=x;
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		System.out.println(sum);
		
	}

}
