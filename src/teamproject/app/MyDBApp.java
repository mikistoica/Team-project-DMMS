/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject.app;

import java.sql.*;
import javax.swing.JOptionPane;
import teamproject.HomePage;

/**
 *
 * @author 21281758
 */
public class MyDBApp {
    
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:ucanaccess://C:\\Users\\21281758\\Desktop\\DatabaseforProject.accdb");
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
            dbConnection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\21281758\\Desktop\\DatabaseforProject.accdb");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void Search(String username,String password) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\21281758\\Desktop\\DatabaseforProject.accdb"); 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select username,password,firstname from Customer where username='" + 
                                    username + "' and password='" + password + "'");
            
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "Welcome " + rs.getString("firstname"));
               HomePage mn = new HomePage();
               mn.setVisible(true);
           }else{
               JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
           }
            rs.close();
            conn.close();
        }catch(Exception e){
           System.out.print(e.toString());
        }
    }
}
