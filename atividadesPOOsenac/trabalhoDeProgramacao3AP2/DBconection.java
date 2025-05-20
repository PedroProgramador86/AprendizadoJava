// 1. Importação do javaSQL
import java.sql.*;

public class DBconection {

    private static final String URL = "jdbc:mysql://acilab.com.br:3309/pedro_luna";
    private static final String USER = "root";
    private static final String PASS = "admin";
    public static Connection get() throws SQLException {

        return DriverManager.getConnection(URL, USER, PASS);

    }

}