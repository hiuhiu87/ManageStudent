/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dbconnect.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import model.Grade;

/**
 *
 * @author Admin
 */
public class GradeDAO implements IModelDAO<Grade>{
    
    public static GradeDAO getInstance() {
        return new GradeDAO();
    }
    
    public String getNameStudent(String idStudent){
         try {
            Connection con = new DBConnector().getConnection();
            
            String sql = "SELECT HOTEN FROM SINHVIEN \n"
                    + "WHERE MASV = ? ";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, idStudent);
            

            System.out.println(sql);
            
            ResultSet res = stm.executeQuery();
            String name = "";
            
            while(res.next()){
                name = res.getString(1);
            }
            
            System.out.println(res);
            System.out.println(sql);
            con.close();
            return name;
        } catch (SQLException e) {
            e.printStackTrace();
            return "Không Tìm Thấy Tên";
        }
    }
    
    @Override
    public int insert(Grade t) {
        try {
            Connection con = new DBConnector().getConnection();
            
            String sql = "INSERT INTO GRADE (MASV, DIEMTA, DIEMTIN, DIEMGD) \n"
                    + "VALUES (?, ?, ?, ?) ";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, t.getStudentCode());
            stm.setFloat(2, t.getEngScore());
            stm.setFloat(3, t.getItScore());
            stm.setFloat(4, t.getSportScore());

            System.out.println(sql);
            
            int res = stm.executeUpdate();
            
            System.out.println(res);
            System.out.println(sql);
            con.close();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Grade t) {
        try {
            Connection con = new DBConnector().getConnection();
            
            String sql = "UPDATE GRADE \n"
                    + "SET DIEMTA = ?, DIEMTIN = ?, DIEMGD = ? \n"
                    + "WHERE MASV = ?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setFloat(1, t.getEngScore());
            stm.setFloat(2, t.getItScore());
            stm.setFloat(3, t.getSportScore());
            stm.setString(4, t.getStudentCode());

            System.out.println(sql);
            
            int res = stm.executeUpdate();
            
            System.out.println(res);
            System.out.println(sql);
            con.close();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(Grade t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Grade> selectAll() {
        ArrayList<Grade> listGrades = new ArrayList<>();
        try {
            //step1: connect database
            Connection con = new DBConnector().getConnection();
            System.out.println(con);
            //step2: tao statement + thuc thi sql
            String queryString = "SELECT * FROM GRADE ";
            PreparedStatement stm = con.prepareStatement(queryString);
            
            ResultSet res = stm.executeQuery();
            
            System.out.println(queryString);
            while (res.next()) {
                Grade gr = new Grade();
                gr.setId(res.getString(1));
                gr.setStudentCode(res.getString(2));
                gr.setEngScore(res.getFloat(3));
                gr.setItScore(res.getFloat(4));
                gr.setSportScore(res.getFloat(5));
                listGrades.add(gr);
            }
            
            //step5: dong connection
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listGrades;
    }

    @Override
    public Grade selectById(Grade t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Grade> selectByCondition(String condition, String condition2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String> getColumnNames() {
        ArrayList<String> columnNames = new ArrayList<>();
        try {
            //step1: connect database
            Connection con = new DBConnector().getConnection();
            System.out.println(con);
            //step2: tao statement
            PreparedStatement stmt = con.prepareStatement("select * from GRADE");
            //retrieving the data
            ResultSet rs = stmt.executeQuery();
            //retrieving the ResultSetMetadata object
            ResultSetMetaData rsMetaData = rs.getMetaData();
            //retrieving the list of column names
            int count = rsMetaData.getColumnCount();

            for (int i = 1; i <= count; i++) {
                String columnName = rsMetaData.getColumnName(i);
                columnNames.add(columnName);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return columnNames;
    }
}
