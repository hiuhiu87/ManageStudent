/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import dao.UserDAO;

/**
 *
 * @author Admin
 */
public class TestUser {
    public static void main(String[] args) {
        UserDAO.getInstance().selectById("ADMIN1");
    }
}
