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
import Business.Role.AdminRole;

/**
 *
 * @author VAIBHAV RAJ
 */
public class WHO extends City {
    private static WHO business;
    private ArrayList<Country> countryList;
    public static WHO getInstance(){
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
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
    }
    private WHO(){
        super(null);
        countryList=new ArrayList<Country>();
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
            
        }
        return true;
    }
    
}
