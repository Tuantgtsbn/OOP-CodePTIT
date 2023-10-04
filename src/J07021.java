import java.util.*;
import java.io.*;
public class J07021 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("DATA_J07021.in"));
		try {
			while(sc.hasNextLine()) {
				String s=sc.nextLine().trim();
				if(s.equals("END")!=true) {
					if(s.equals("")!=true) {
						String[] tmp=s.split("\\s+");
						StringBuilder name=new StringBuilder();	
						for(String word:tmp) {
							name.append(String.valueOf(word.charAt(0)).toUpperCase());
							for(int i=1;i<word.length();i++) {
								name.append(String.valueOf(word.charAt(i)).toLowerCase());
								
							}
							name.append(" ");
						}
						name.deleteCharAt(name.length()-1);
						System.out.println(name);
					}
				
				}else {
					return;
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			
		}
		finally {
			sc.close();
		}
	}

}
