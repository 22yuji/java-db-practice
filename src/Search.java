public class Search {

	private static ProductDao productDao;
	
	public static void main(String[] args) {
		
		productDao = new ProductDao(DbUtil.getConnection());
		
		Product product = productDao.findById(1);
        
		System.out.println("product_id:" + product.getProductId() + ", product_name:" + product.getProductName() + ", price:" + product.getPrice());

	}
}
