/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dbconnect.DBConnector;
import java.util.ArrayList;
import model.Student;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class StudentDAO implements IModelDAO<Student>{
    
    public static StudentDAO getInstance() {
        return new StudentDAO();
    }
    
    @Override
    public int insert(Student t) {
        try {
            Connection con = new DBConnector().getConnection();
            
            String sql = "INSERT INTO SINHVIEN \n"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?) ";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, t.getStudentCode());
            stm.setString(2, t.getName());
            stm.setString(3, t.getEmail());
            stm.setString(4, t.getPhone());
            stm.setBoolean(5, t.isGender());
            stm.setString(6, t.getAddress());
            System.out.println(sql);
            stm.setBytes(7, t.getAvatar());
            
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
    public int update(Student t) {
        try {
            Connection con = new DBConnector().getConnection();
            
            String sql = "UPDATE SINHVIEN \n"
                    + "SET HOTEN = ?, EMAIL = ?, SODT = ?, GIOITINH = ?, DIACHI = ?, HINH = ? \n"
                    + "WHERE MASV = ?";
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, t.getName());
            stm.setString(2, t.getEmail());
            stm.setString(3, t.getPhone());
            stm.setBoolean(4, t.isGender());
            stm.setString(5, t.getAddress());
            stm.setBytes(6, t.getAvatar());
            stm.setString(7, t.getStudentCode());
            
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
    public int delete(Student t) {
        try {
            //step1: connect database
            Connection con = new DBConnector().getConnection();
            System.out.println(con);
            
            //step2: thuc thi sql
            String queryString = "DELETE FROM GRADE \n"
                    + "WHERE MASV = ? \n"
                    + "DELETE FROM SINHVIEN \n"+
                                "WHERE MASV = ?";
            
            //step3: tao statement
            PreparedStatement ptm = con.prepareStatement(queryString);
            
            //step4: them vao ptm
            ptm.setString(1, t.getStudentCode());
            ptm.setString(2, t.getStudentCode());
            
            int res = ptm.executeUpdate();
            
            System.out.println(queryString);
            System.out.println("Dong thay doi: " + res);
            
            //step5: dong connection
            con.close();
            return res;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }
    }

    @Override
    public ArrayList<Student> selectAll() {
        ArrayList<Student> listStudents = new ArrayList<>();
        try {
            //step1: connect database
            Connection con = new DBConnector().getConnection();
            System.out.println(con);
            //step2: tao statement + thuc thi sql
            String queryString = "SELECT * FROM SINHVIEN ";
            PreparedStatement stm = con.prepareStatement(queryString);
            
            ResultSet res = stm.executeQuery();
            
            System.out.println(queryString);
            while (res.next()) {
                Student st = new Student();
                st.setStudentCode(res.getString(1));
                st.setName(res.getString(2));
                st.setEmail(res.getString(3));
                st.setPhone(res.getString(4));
                st.setGender(res.getBoolean(5));
                st.setAddress(res.getString(6));
                st.setAvatar(res.getBytes(7));
                
                listStudents.add(st);
            }
            
            //step5: dong connection
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listStudents;
    }

    @Override
    public Student selectById(Student t) {
        return null;
    }

    @Override
    public ArrayList<Student> selectByCondition(String condition, String condition2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<String> getColumnNames() {
        ArrayList<String> columnNames = new ArrayList<>();
        try {
            //step1: connect database
            Connection con = new DBConnector().getConnection();
            System.out.println(con);
            //step2: tao statement
            PreparedStatement stmt = con.prepareStatement("select * from SINHVIEN");
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
