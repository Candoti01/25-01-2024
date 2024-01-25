package model;
import java.sql.*;
import java.util.*;
import controller.*;

public class Log_Model {
    public static void main(String[] args) {
        TelaLogModel();
    }

    public static void TelaLogModel() {
        Connection conn = MySQLConnector.conectar();
        try {
            String strSqlSelect = "select * from `mysql_connector`.`tbl_clientes` where `nome` = '" + InterfaceUsuariosPadoka.UsuarioLogs + "' and `senha` = '" + InterfaceUsuariosPadoka.SenhaLogs + "';"; 
            Statement stmSql = conn.createStatement(); 
            ResultSet rsSql = stmSql.executeQuery(strSqlSelect);
                if(rsSql.next()) {
                    App.ComprarBolos();
                }else{
                    App.erro_log();
                }
        } catch (Exception e) {
            System.err.println("Erro!" + e);
        }
    }
}
