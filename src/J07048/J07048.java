package J07048;
import java.util.*;
import java.io.*;
public class J07048 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("SANPHAM.in"));
		int number_product=Integer.parseInt(sc.nextLine());
		List<SanPham> list_products=new ArrayList<SanPham>();
		while(number_product-->0) {
			String id=sc.nextLine();
			String name=sc.nextLine();
			int price=Integer.parseInt(sc.nextLine());
			int month=Integer.parseInt(sc.nextLine());
			list_products.add(new SanPham(name, id, price, month));
			
		}
		Collections.sort(list_products, new Comparator<SanPham>() {

			@Override
			public int compare(SanPham o1, SanPham o2) {
				// TODO Auto-generated method stub
				if(o1.getPrice_product()!=o2.getPrice_product()) {
					return (int)o2.getPrice_product()-(int)o1.getPrice_product();
				}else {
					return o1.getId_product().compareTo(o2.getId_product());
				}
			}
			
		});
		for(SanPham i:list_products) {
			System.out.println(i);
		}

	}

}
