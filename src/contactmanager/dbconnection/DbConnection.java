/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contactmanager.dbconnection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author ANUKUL CHHETRI
 */
public class DbConnection {
    Connection connection=null;
    PreparedStatement stmt=null;
    
    
    public DbConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost/workshop2", "root","");
        //connection.setAutoCommit(false);
        
    }
    
    public PreparedStatement initStatement(String sql) throws SQLException{
        stmt=connection.prepareStatement(sql);
        return stmt;
    }
    
    public int executeNonQuery() throws SQLException{
        return stmt.executeUpdate();
    }
    
    public ResultSet executeReader() throws SQLException{
        return stmt.executeQuery();
    }
    
    
    
    public void close() throws SQLException{
        if(!connection.isClosed()){
            connection.close();
            connection=null;
        }
    }
    
    

}