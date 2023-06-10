/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mahmoud
 */
public class DB {
   private static DB db = null;
    
    private DB(){
     
 }
 
public static DB getInstance(){
    if(db == null){
        db  = new DB();
        return db;
    }else{
        return db;
    }
} 

public Connection getConnection()throws ClassNotFoundException,SQLException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clinic","root","");
    return conn;
}
}
