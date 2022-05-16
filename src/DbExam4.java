import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbExam4 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// SQL query string
        String sql = "SELECT * FROM products";
        int param = 101;
        String param2 = "地球儀";
        sql = "SELECT * FROM products WHERE product_id = " + param + " OR product_name = '" + param2 + "'";
        
        try {
            // load JDBC Driver
            Class.forName("org.postgresql.Driver");

            // try-with-resource
            try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbconnection", "axizuser", "axiz");
                    PreparedStatement stmt = con.prepareStatement(sql)) {

            	//sql = "SELECT * FROM product WHERE product_id = " + param + " OR product_name = '" + param2 + "'";
            	
                // execute
                ResultSet rs = stmt.executeQuery();

                // output
                while (rs.next()) {
                    int id = rs.getInt("product_id");
                    String name = rs.getString("product_name");
                    int price = rs.getInt("price");

                    System.out.print(id + "\t");
                    System.out.print(name + "\t");
                    System.out.println(price);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
