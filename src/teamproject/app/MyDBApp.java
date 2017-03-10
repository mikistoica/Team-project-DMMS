/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject.app;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 21281758
 */
public class MyDBApp {
    
    public static void main(String[] args) {
    }
    
    public Connection dbConnection;
    public void makeDbConnection() {
        try {
            /*String user = "saxon";
            String password = "password";
            String url = "jdbc:derby://localhost:1527/saxon";*/
            dbConnection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Mihaela\\Documents\\Database1.accdb");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
