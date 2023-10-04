import java.util.*;
import java.io.*;
public class J07022 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("DATA_J07022.in"));
		List<String> list=new LinkedList<String>();
		try {
			while(sc.hasNextLine()) {
				String s=sc.nextLine().trim();
				String[] list_string=s.split("\\s+");
				for(String i :list_string) {
					if(i.equals("")!=true&&i.equals(" ")!=true) {
						try {
							i=i.trim();
							int a=Integer.parseInt(i);
						}
						catch (NumberFormatException e) {
							i=i.trim();
							list.add(i);
						}
					}
					
					
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			sc.close();
		}
		Collections.sort(list);
		for(String i:list) {
			System.out.print(i+" ");
		}
		
	}

}
