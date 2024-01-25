package model;

import controller.*;
import java.util.*;
import java.sql.*;

public class Cad_Model {
    public static void main(String[] args) {
        Cad_userSQL();
    }

    public static void Cad_userSQL() {
        try{
        String strInsertMySQL = "insert into `mysql_connector`.`tbl_clientes` (`nome`,`senha`) values ('" + InterfaceUsuariosPadoka.UsuarioRegs + "','" + InterfaceUsuariosPadoka.SenhaRegs + "');";
            Connection conn = MySQLConnector.conectar();
            Statement stmSql = conn.createStatement();
            stmSql.addBatch(strInsertMySQL);
            stmSql.executeBatch();
            stmSql.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante o cadastro!! " + e);
        }
    }
}
