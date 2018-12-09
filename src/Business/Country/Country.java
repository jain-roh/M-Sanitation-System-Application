/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import Business.Employee.EmployeeDirectory;
import Business.Request.Request;
import Business.State.StateDirectory;
import Business.Role.CountryAdminRole;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
private HashMap<Integer,Request> requestList;
 private EnterpriseType enterpriseType;
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
public enum EnterpriseType{
        Sanitation("Sanitation");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
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
public Country(String name,EnterpriseType type){
    
    this.enterpriseType=enterpriseType;
    this.CountryName=name;
    stateDirectory=new StateDirectory();
        userAccountDirectory=new UserAccountDirectory();
        employeeDirectory=new EmployeeDirectory();
        requestList=new HashMap<>();
    } 
public Country(String CountryName)
{
    this.CountryName=CountryName;
        stateDirectory=new StateDirectory();
        userAccountDirectory=new UserAccountDirectory();
        employeeDirectory=new EmployeeDirectory();
        requestList=new HashMap<>();

}

    public int getCountryID() {
        return CountryID;
    }

    public HashMap<Integer,Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(HashMap<Integer,Request> requestList) {
        this.requestList = requestList;
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
