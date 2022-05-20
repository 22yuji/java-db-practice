package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Product;

public class ProductDao {

	Connection connection;
	
	private static final String SQL_SELECT = "SELECT * FROM products WHERE product_id = ?";
	
	public ProductDao(Connection connection) {
		this.connection = connection;
	}
	
	public Product findById(int productId) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT)) {
            stmt.setInt(1, productId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("price"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}