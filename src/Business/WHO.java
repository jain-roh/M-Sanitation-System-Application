/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.City.City;
import java.util.ArrayList;
import Business.Country.Country;
import Business.Role.Role;
import Business.Country.CountryDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Request.Request;
import Business.Role.AdminRole;
import Business.State.State;
import Business.UserAccount.UserAccountDirectory;
import java.util.HashMap;

/**
 *
 * @author VAIBHAV RAJ
 */
public class WHO {
    private static WHO business;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;    
    private CountryDirectory countryDirectory;
    private HashMap<Integer,Request> requestList;

    public HashMap<Integer, Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(HashMap<Integer, Request> requestList) {
        this.requestList = requestList;
    }
    private int lastFetchedID;

    public int getLastFetchedID() {
        return lastFetchedID;
    }

    public void setLastFetchedID(int lastFetchedID) {
        this.lastFetchedID = lastFetchedID;
    }
    public CountryDirectory getCountryDirectory() {
        return countryDirectory;
    }

    public void setCountryDirectory(CountryDirectory countryDirectory) {
        this.countryDirectory = countryDirectory;
    }
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    public UserAccountDirectory getUserAccountDirectory() {
      //  userAccountDirectory=new UserAccountDirectory();
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    private ArrayList<Country> countryList;
   
    
    public static WHO getInstance(){
    // business=new WHO();
        if(business==null){
            business=new WHO();
            
        }
        //this.lastFetchedID=0;
        return business;
    }

    public Country createAndAddCountry(){
        Country country=new Country();
        countryList.add(country);
        return country;
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
    }
    private WHO(){
       // super(null);
        countryList=new ArrayList<Country>();
      countryDirectory=new CountryDirectory();
            employeeDirectory=new EmployeeDirectory();
           userAccountDirectory=new UserAccountDirectory();
           requestList=new HashMap<>();
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }
    
    //List Not needed as we are working with DB
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Country country:countryList){
            if(!country.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
            }
            for(State state:country.getStateDirectory().getStateList()){
                if(!state.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
                }
            for(City city:state.getCityDirectory().getCityList())
                if(!state.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
                }
                }
            }
        
        return true;
        //return true;
    }
    
}
