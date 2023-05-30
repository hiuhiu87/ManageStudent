/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author Admin
 */
public class UserDAO {
    public static UserDAO getInstance(){
        return new UserDAO();
    }
    
   public User selectById(String username) {
        User us = new User();
        try {
            //step1: connect database
            Connection con = new DBConnector().getConnection();
            System.out.println(con);
            //step2: tao statement + thuc thi sql
            String queryString = "SELECT * FROM USERP " +
                                "WHERE USERNAME = ?";
            PreparedStatement stm = con.prepareStatement(queryString);
            stm.setString(1, username);
            
            ResultSet res = stm.executeQuery();
            
            System.out.println(queryString);
            while (res.next()) {                
               us.setUsername(res.getString(1));
               us.setPassword(res.getString(2));
               us.setRole(res.getBoolean(3));
            }
            
            System.out.println("Ma Nhan Vien: " + us.getUsername());
            System.out.println("Mat Khau: " + us.getPassword());
            System.out.println("Role: " + us.isRole());
            //step5: dong connection
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return us;
    }
}
