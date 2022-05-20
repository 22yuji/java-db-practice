package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://192.168.100.42/dbconnection", "axizuser", "axiz");
        } catch (Exception e) {
            // 本来は専用の例外クラスを作成したほうがよい
            throw new RuntimeException(e);
        }
    }
}
