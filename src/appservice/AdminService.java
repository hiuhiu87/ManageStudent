/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appservice;

import dao.StudentDAO;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author Admin
 */
public class AdminService implements IAdminFeature{
    
    private ArrayList<Student> studentLists;

    public AdminService() {
        this.studentLists = new ArrayList<>();
    }

    public AdminService(ArrayList<Student> studentLists) {
        this.studentLists = studentLists;
    }
    
    

    public ArrayList<Student> getStudentLists() {
        return studentLists;
    }

    public void setStudentLists(ArrayList<Student> studentLists) {
        this.studentLists = studentLists;
    }
    

    @Override
    public void addFunction(Student st) {
        if (st != null) {
            this.studentLists.add(st);
            StudentDAO.getInstance().insert(st);
        }
    }

    @Override
    public void updateFunction(Student st) {
        if (st != null) {
            StudentDAO.getInstance().update(st);
        }
    }

    @Override
    public void deleteFunction(Student st) {
        if (st != null) {
            this.studentLists.remove(st);
            StudentDAO.getInstance().delete(st);
        }
    }
    
    
    
}
