/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.Country.Country;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.City.City;
import Business.Country.CountryDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author VAIBHAV RAJ
 */
public class WHO {
    private static WHO business;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;    
    private CountryDirectory countryDirectory;

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
    private static ArrayList<Country> countryList;
   
    
    public static WHO getInstance(){
     //business=null;
        if(business==null){
            business=new WHO();
          
        }
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
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }
    
    //List Not needed as we are working with DB
    public boolean checkIfUserIsUnique(String userName){
//        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
//            return false;
//        }
//        for(Country country:countryList){
//            
//        }
//        return true;
        return true;
    }
    
}
