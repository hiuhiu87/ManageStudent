/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appservice;

import dao.GradeDAO;
import dao.StudentDAO;
import java.util.ArrayList;
import model.Grade;
import model.Student;

/**
 *
 * @author Admin
 */
public class UserService implements IUserFeature {

    private ArrayList<Grade> gradeLists;

    public UserService(ArrayList<Grade> gradeLists) {
        this.gradeLists = gradeLists;
    }

    public UserService() {
        this.gradeLists = GradeDAO.getInstance().selectAll();
    }

    public ArrayList<Grade> getGradeLists() {
        return gradeLists;
    }

    public void setGradeLists(ArrayList<Grade> gradeLists) {
        this.gradeLists = gradeLists;
    }

    @Override
    public void addFunction(Grade grade) {
        if (grade != null) {
            gradeLists.add(grade);
            GradeDAO.getInstance().insert(grade);
        }
    }

    @Override
    public void update(Grade grade) {
        if (grade != null) {
            GradeDAO.getInstance().update(grade);
        }
    }

    @Override
    public void delete(Grade grade) {
        if (grade != null) {
            gradeLists.remove(grade);
            GradeDAO.getInstance().delete(grade);
        }
    }

    @Override
    public ArrayList<Grade> search(String studentID) {
        ArrayList<Grade> resultList = new ArrayList<>();

        for (Grade grade : gradeLists) {
            if (grade.getId().contains(studentID)) {
                resultList.add(grade);
            }
        }

        return resultList;
    }

    public boolean checkValidStudentCode(String studentCode) {
        ArrayList<Student> studentListValid = StudentDAO.getInstance().selectAll();
        for (Student student : studentListValid) {
            if (!student.getStudentCode().equalsIgnoreCase(studentCode)) {
                return true;
            }
        }

        return false;
    }

    public ArrayList<Grade> searchFunction(String studentCode) {
        ArrayList<Grade> listSearchFound = new ArrayList<>();
        for (Grade grade : this.gradeLists) {
            if (grade.getId().equalsIgnoreCase(studentCode)) {
                listSearchFound.add(grade);
            }
        }
        return listSearchFound;
    }
}
