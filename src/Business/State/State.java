/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import java.util.ArrayList;
import Business.City.CityDirectory;
import Business.City.City;

/**
 *
 * @author VAIBHAV RAJ
 */
public abstract class State extends City {
    
    private int stateID;
    private String stateName;
    private ArrayList<City> city;
    private DepartmentType departmentType;
    private CityDirectory cityDirectory;

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    public enum DepartmentType{
        Sanitation("Sanitation");
        
        private String value;
        
        private DepartmentType(String value){
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
    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public ArrayList<City> getCity() {
        return city;
    }

    public void setCity(ArrayList<City> city) {
        this.city = city;
    }

    public CityDirectory getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(CityDirectory cityDirectory) {
        this.cityDirectory = cityDirectory;
    }
    
     public State(String name,DepartmentType type){
        super(name);
        this.departmentType=type;
        cityDirectory=new CityDirectory();
    }
    
}
