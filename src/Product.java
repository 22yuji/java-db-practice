//Entity
public class Product {
	private Integer productId;
	private String productName;
	private Integer price;
	
	public Product() {
	}
	public Product(Integer productId, String productName, Integer price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getProductId() {
		return productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getPrice() {
		return price;
	}
}
