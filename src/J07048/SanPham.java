package J07048;

public class SanPham {
	private String name_product,id_product;
	private int price_product;
	private int warranty_product;
	public SanPham(String name_product, String id_product, int price_product, int warranty_product) {
		super();
		this.name_product = name_product;
		this.id_product = id_product;
		this.price_product = price_product;
		this.warranty_product = warranty_product;
	}
	public String getName_product() {
		return name_product;
	}
	public String getId_product() {
		return id_product;
	}
	public int getPrice_product() {
		return price_product;
	}
	public int getWarranty_product() {
		return warranty_product;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId_product()+" "+this.getName_product()+" "+this.getPrice_product()+" "+this.getWarranty_product();
	}
	
	
	
}
