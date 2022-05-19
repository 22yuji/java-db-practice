package service;

import java.sql.Connection;

import Dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class Search {

	public Product findById(Integer productId) {
        try (Connection con = DbUtil.getConnection()) {
        	ProductDao productDao = new ProductDao(con);
            return productDao.findById(productId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
