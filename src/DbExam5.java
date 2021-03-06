import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class DbExam5 {
	
	private static ProductDao productDao;
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
	        // load JDBC Driver
			Class.forName("org.postgresql.Driver");

	        // try-with-resource
	        try (Connection con = DriverManager.getConnection
	            		("jdbc:postgresql://localhost:5432/dbconnection", "axizuser", "axiz");) {
	        	productDao = new ProductDao(con);
	            List<Product> list = productDao.findAll();
	                
	        	for(Product p : list) {
	        		System.out.println("product_id:" + p.getProductId() + ", product_name:" + p.getProductName() + ", price:" + p.getPrice());
	        	}
	        }
	    } catch (Exception e) {
	            e.printStackTrace();
	    }
    }
}