/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import Business.Employee.EmployeeDirectory;
import Business.State.StateDirectory;
import Business.Role.CountryAdminRole;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author VAIBHAV RAJ
 */
public class Country {
    
private int CountryID;
private int  CountryCode;
private String CountryName;
private StateDirectory stateDirectory;
private CountryAdminRole countryAdmin;
private UserAccountDirectory userAccountDirectory;
private EmployeeDirectory employeeDirectory;

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
public Country(){
        stateDirectory=new StateDirectory();
        userAccountDirectory=new UserAccountDirectory();
        employeeDirectory=new EmployeeDirectory();
    } 

    public int getCountryID() {
        return CountryID;
    }

    public void setCountryID(int CountryID) {
        this.CountryID = CountryID;
    }

    public int getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(int CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public StateDirectory getStateDirectory() {
        return stateDirectory;
    }

    public void setStateDirectory(StateDirectory stateDirectory) {
        this.stateDirectory = stateDirectory;
    }

    public CountryAdminRole getCountryAdmin() {
        return countryAdmin;
    }

    public void setCountryAdmin(CountryAdminRole countryAdmin) {
        this.countryAdmin = countryAdmin;
    }
    @Override   
    public String toString()
    {
        return CountryName;
    }
}
