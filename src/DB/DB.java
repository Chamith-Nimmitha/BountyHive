/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    
    public Connection get_connection(String db_name){
        
        String url = "jdbc:mysql://localhost:3306/"+db_name ;
        String user_name = "root";
        String password ="root";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            try {
                con = DriverManager.getConnection(url,user_name,password);
                return con;
            } catch (SQLException ex) {
                return null;
            }
        } catch (ClassNotFoundException ex) {
            return null;
        }
        
    }
    
}
