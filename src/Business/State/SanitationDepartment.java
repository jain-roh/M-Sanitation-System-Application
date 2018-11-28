/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author VAIBHAV RAJ
 */
public class SanitationDepartment extends State{
    
     public SanitationDepartment(String name){
        super(name,DepartmentType.Sanitation);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
  
}
