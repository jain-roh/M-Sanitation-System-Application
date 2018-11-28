/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.AuditorRole;

/**
 *
 * @author VAIBHAV RAJ
 */
public class AuditorCity extends City {
    
      public AuditorCity() {
        super(Type.Auditor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AuditorRole());
        return roles;
    }
}
