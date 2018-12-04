/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import java.util.ArrayList;
import Business.City.CityDirectory;
import Business.City.City;
import Business.Employee.EmployeeDirectory;
import Business.Request.Request;
import Business.UserAccount.UserAccountDirectory;
import java.util.HashMap;

/**
 *
 * @author VAIBHAV RAJ
 */
public  class State {
    
    private int stateID;
    private String stateName;
   private HashMap<Integer,Request> requestList;
    private ArrayList<City> city;
    private DepartmentType departmentType;
    private CityDirectory cityDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;

    public State() {
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        cityDirectory = new CityDirectory();
         requestList=new HashMap<Integer,Request>();
    }
    public State(String state)
    {
        this.stateName=state;
    }

    public HashMap<Integer,Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(HashMap<Integer,Request> requestList) {
        this.requestList = requestList;
    }

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
    @Override
    public String toString()
    {
        return stateName;
    }
    //public State(String name,DepartmentType type){
    //    super(name);
    //    this.departmentType=type;
    //    cityDirectory=new CityDirectory();
    //} 
    
}
