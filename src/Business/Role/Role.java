/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;
import Business.WHO;
import Business.State.State;
import Business.City.City;
import Business.Country.Country;
import Business.Request.RequestID;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import java.util.ArrayList;

/**
 *
 * @author VAIBHAV RAJ
 */
public abstract class Role {
    private ArrayList<RequestID> workList;

    public ArrayList<RequestID> getWorkList() {
        return workList;
    }

    public void setWorkList(ArrayList<RequestID> workList) {
        this.workList = workList;
    }


    public Component createWorkArea(JPanel container, UserAccount userAccount, City inCity, State inState, WHO system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum RoleType{
        Admin("Admin"),
        Auditor("Auditor"),
        Manager("Manager"),
        StateAdmin("State Admin"),
        Requestor("Requestor"),
        CountryAdmin("Country Admin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            City city, 
            State state,
            Country country,
            WHO business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
