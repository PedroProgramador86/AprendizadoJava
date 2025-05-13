/**
* Para rodar no terminal
* javac Main.java && java Main
* ----------------------------------------------
* Para ativar o conector java

* Comando Para estabelecer uma conexão:
* export CLASSPATH=mysql-connector-j-8.4.0.jar:.

* */

import java.sql.Connection;         // Importando Conexão do SQL
import java.sql.DriverManager;      
import java.sql.ResultSet;
import java.sql.Statement;

public class MainDB01 {
    public static void main(String[] args) {
        // Parâmetros de conexão
        String url = "jdbc:mysql://acilab.com.br:3309/db2001";
        String user = "root";
        String password = "admin";

        try {
            // Estabelece a conexão
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");

            connection.close(); //Fecha a conexão

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}