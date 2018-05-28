/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafixworlddb.grafixworlddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mathews C. Nyirongo
 */
public class ConnectionUtil {
    static String USER = "Mathews";
    static String HOST = "jdbc:sqlserver://localhost:3306;database=users";
    static String password = "123@abc";
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(HOST, USER, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
