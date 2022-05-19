package service;

import Dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class Search {

	private static ProductDao productDao;
	
	public static void main(String[] args) {
		
		productDao = new ProductDao(DbUtil.getConnection());
		
		Product product = productDao.findById(1);
        
		System.out.println("product_id:" + product.getProductId());
		System.out.println(", product_name:" + product.getProductName());
		System.out.println(", price:" + product.getPrice());
	}
}
