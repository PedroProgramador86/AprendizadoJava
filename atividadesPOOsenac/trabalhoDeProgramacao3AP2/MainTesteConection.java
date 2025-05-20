

import java.sql.Connection;
import java.sql.SQLException;

public class MainTesteConection {

    public static void main (String[]args) throws SQLException {

        DBconection teste = new DBconection();
        Connection conn = teste.get();

    }
    
}
