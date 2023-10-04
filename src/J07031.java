import java.util.*;
import java.io.*;

public class J07031 {
	public static boolean isPrime(int number) {
		if (number < 2)
			return false;
		else {
			for (int i = 2; i <= (int) Math.sqrt(number); i++) {
				if (number % i == 0)
					return false;
			}
			return true;
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> listInt1 = (ArrayList<Integer>) ois1.readObject();
		ArrayList<Integer> listInt2 = (ArrayList<Integer>) ois2.readObject();
		Set<Integer> st1 = new TreeSet<Integer>();
		for (Integer i : listInt1) {
			if (isPrime(i.intValue()) == true) {
				st1.add(i);
			}

		}
		Set<Integer> st2 = new HashSet<Integer>();
		for (Integer i : listInt2) {
			st2.add(i);

		}
		for (Integer i : st1) {
			if(i<500000) {
				if (isPrime(1000000 - i.intValue()) == true &&st1.contains(1000000-i)&& st2.contains(Integer.valueOf(1000000 - i.intValue()))== false&&st2.contains(Integer.valueOf( i.intValue()))== false) {
					System.out.println(i.intValue() + " " + (1000000 - i.intValue()));
				}
			}
			
		}

	}

}
