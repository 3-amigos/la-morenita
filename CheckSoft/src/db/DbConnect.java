/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import modules.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Alvaro
 */
public class DbConnect {
    Connection conn = null;
    
    public DbConnect() {
        try {
            connectDb();
        } catch(Exception e) {
            
        }
    }
    
    public static Connection connectDb() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/checksoftdb?user=root&password=SeanPrice123");
            
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
            System.err.println("SQLException: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("VendorError: " + e.getErrorCode());
            return null;
        }        
    }
    
    // query database and return an array full of user objects
    public User[] getUsers() {
        return new User[1];
    }
    
    //creates & executes query for user
    //returns a User object (null otherwise if no results returned)
    public User queryUser(String usr, String pwd) throws SQLException {
        Statement stmt = null;
        String query = "select * from checksoftdb.user where username = '" + 
                usr + "' AND password = '" + pwd + "';";
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs == null) {
                return null;               
            } else 
                return new User(0,usr,pwd);

        } catch (SQLException e ) {
            System.err.println("queryUser error: "+e.getMessage());
            return null;

        } finally {
            if (stmt != null) { stmt.close(); }
        }   
    }
    // query database and return an array full of check objects
    public Check[] getChecks() {
        return new Check[1];
    }
}
