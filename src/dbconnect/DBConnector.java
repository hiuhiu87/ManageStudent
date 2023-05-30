/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBConnector {

    protected Connection connection;

    public DBConnector() {
        try {
            String user = "sa";
            String pass = "Nhey1123@";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYSINHVIEN;encrypt=true;trustServerCertificate=true";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.connection = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection getConnection() {
        return connection;
    }

}
