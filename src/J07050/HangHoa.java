package J07050;

public class HangHoa {
	private String id_product,name_product,group_product;
	private float price_buy_product,price_sale_product,ln;
	public static int index=0;
	public String getId_product() {
		return id_product;
	}
	public void setId_product() {
		this.id_product = "MH"+String.format("%02d", index);
	}
	public String getName_product() {
		return name_product;
	}
	public void setName_product(String name_product) {
		this.name_product = name_product;
	}
	public String getGroup_product() {
		return group_product;
	}
	public void setGroup_product(String group_product) {
		this.group_product = group_product;
	}
	public float getPrice_buy_product() {
		return price_buy_product;
	}
	public void setPrice_buy_product(float price_buy_product) {
		this.price_buy_product = price_buy_product;
	}
	public float getPrice_sale_product() {
		return price_sale_product;
	}
	public void setPrice_sale_product(float price_sale_product) {
		this.price_sale_product = price_sale_product;
	}
	public static int getIndex() {
		return index;
	}
	public static void setIndex(int index) {
		HangHoa.index = index;
	}
	public HangHoa(String name_product, String group_product, float price_buy_product,
			float price_sale_product) {
		super();
		index+=1;
		setId_product();
		this.name_product = name_product;
		this.group_product = group_product;
		this.price_buy_product = price_buy_product;
		this.price_sale_product = price_sale_product;
		this.ln=this.price_sale_product-this.price_buy_product;
		
	}
	@Override
	public String toString() {
		return this.getId_product()+" "+this.getName_product()+" "+this.getGroup_product()+" "+String.format("%.2f", this.ln);
	}
	public float getLn() {
		return ln;
	}
	
	
}
