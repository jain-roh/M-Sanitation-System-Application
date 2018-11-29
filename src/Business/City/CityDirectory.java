/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;

import java.util.ArrayList;
import Business.City.City.Type;

/**
 *
 * @author VAIBHAV RAJ
 */
public class CityDirectory {
   
     private ArrayList<City> cityList;

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public CityDirectory() {
        cityList = new ArrayList<City>();
    }
    
   
}
