/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import dao.StudentDAO;
import imageconvert.ImageConvert;
import javax.swing.ImageIcon;
import model.Student;

/**
 *
 * @author Admin
 */
public class TestStudent {
    public static void main(String[] args) {
        Student st = new Student("PH42056","MinhHieu", "Minhhieu@gmai.com", "0982095565", true, "blabla", ImageConvert.convertImg("D:\\Downloads\\anh1.jpeg"));
        StudentDAO.getInstance().insert(st);
    }
}
