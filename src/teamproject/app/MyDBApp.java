/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject.app;

import java.sql.*;

/**
 *
 * @author 21281758
 */
public class MyDBApp {
    
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:ucanaccess://C:\\Users\\deric\\Desktop\\DatabaseforProject.accdb");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery(
                "SELECT Customer_Fname + ' ' + Customer_Lname + ' ' + Username + ' ' + Email FROM Customer");
        while (rs.next()) {
            System.out.println(rs.getString(1));
}
    }
    
    public Connection dbConnection;
    public void makeDbConnection() {
        try {
            
            String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=DatabaseforProject.mdb";
            dbConnection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\21258784\\Desktop\\DatabaseforProject.accdb");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
