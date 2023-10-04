package J07007;
import java.util.*;
import java.io.*;

public class WordSet {
	private Set<String>set=new LinkedHashSet<String>();
	public WordSet(String s) throws IOException{
		Scanner sc=new Scanner(new File(s));
//		Scanner sc=new Scanner(new File("DATA_J07007.in"));
//		Set<String> set=new LinkedHashSet<String>();
		while(sc.hasNext()) {
			this.set.add(sc.next().toLowerCase());
		}
		
	}
	
	@Override
	public String toString() {
		List<String> list=new ArrayList<String>(this.set);
		Collections.sort(list);
		String result="";
		for(String tmp: list) {
			result+=tmp+"\n";
		}
		return result;
	}
	
}
