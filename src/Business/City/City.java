/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;
import Business.Employee.EmployeeDirectory;
import Business.Request.Request;
import Business.Role.Role;
import Business.State.StateDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author VAIBHAV RAJ
 */
public class City {
  private String CityName;
  private int CityID;
  private HashMap<Integer,Request> requestList;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
   
    
    public City()
            
    {
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();  
         requestList=new HashMap<Integer,Request>();
    }

    public HashMap<Integer,Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(HashMap<Integer,Request> requestList) {
        this.requestList = requestList;
    }

      

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public int getCityID() {
        return CityID;
    }

    public void setCityID(int CityID) {
        this.CityID = CityID;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
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
    
    
    public enum Type{
        Manager("Manager Organization"), Auditor("Auditor Organization"), Requestor("Requestor Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public City(String CityName) {
        this.CityName = CityName;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        
    }

    //public abstract ArrayList<Role> getSupportedRole();
    
    @Override
    public String toString() {
        return CityName;
    }
}
