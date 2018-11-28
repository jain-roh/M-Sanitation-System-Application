/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import java.util.ArrayList;

/**
 *
 * @author rohitjain
 */
public class CountryDirectory {
   private ArrayList<Country> countryList;

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    public CountryDirectory() {
        countryList = new ArrayList();
    }
}
