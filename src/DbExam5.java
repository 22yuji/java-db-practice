import java.util.List;

public class DbExam5 {
	
	private static ProductDao productDao;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		productDao = new ProductDao(DbUtil.getConnection());
		
		Product newProduct = new Product(null, "ボールペン", 200);
        productDao.register(newProduct);
        
		List<Product> list = productDao.findAll();
		
    	for(Product p : list) {
    		System.out.println("product_id:" + p.getProductId() + ", product_name:" + p.getProductName() + ", price:" + p.getPrice());
    	}
    }
}