package model;
import controller.*;
import java.sql.*;

public class MySQLConnector {
    public static void main(String[] args) {
        System.out.println("Conectando ao banco de dados...");
        conectar();
    }

    public static Connection conectar() {
        String status = "Nada aconteceu ainda...";
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "mysql_connector";
        String mysqlUser = "root";
        String mysqlPassword = "123456";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + "/" + mysqlDb + "?user=" + mysqlUser + "&password="+ mysqlPassword;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            status = "Conectado!";
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Erro na conexão: " + e);
        }
        System.out.println(status);
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        return conn;
        
    }
}
