package diff_productSupplier;

public class Product {
	private String productName;
	private String purchasePrice;
	private String salesPrice;
	private String stock;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, String purchasePrice, String salesPrice, String stock) {
		super();
		this.productName = productName;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.stock = stock;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(String salesPrice) {
		this.salesPrice = salesPrice;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", purchasePrice=" + purchasePrice + ", salesPrice=" + salesPrice
				+ ", stock=" + stock + "]";
	}
	

}
