/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appservice;

import java.util.ArrayList;
import model.Grade;

/**
 *
 * @author Admin
 */
public interface IUserFeature {
    public void addFunction(Grade grade);
    
    public void update(Grade grade);
    
    public void delete(Grade grade);
    
    public ArrayList<Grade> search(String studentID);
    
}
