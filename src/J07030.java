import java.util.*;
import java.io.*;

public class J07030 {
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
		Set<Integer> st = new TreeSet<Integer>();
		for (Integer i : listInt1) {
			if (isPrime(i.intValue()) == true && i < 500000) {
				st.add(i);
			}

		}
		for (Integer i : st) {
			if (isPrime(1000000 - i.intValue()) == true && listInt2.contains(1000000 - i) == true) {
				System.out.println(i + " " + (1000000 - i));
			}
		}

	}

}
