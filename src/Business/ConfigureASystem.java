/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import Business.Role.AdminRole;
/**
 *
 * @author VAIBHAV RAJ
 */
public class ConfigureASystem {
    public static WHO configure(){
        
        WHO system = WHO.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("who", "who", employee, new AdminRole());
        
        return system;
    
}
}
