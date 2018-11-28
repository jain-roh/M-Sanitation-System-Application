/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.City;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.State.StateDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author VAIBHAV RAJ
 */
public abstract class City {
  private String CityName;
  private int CityID;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ManagerCity managerCity;
    private AuditorCity auditorCity;
    private RequestorCity requestorCity;

    public ManagerCity getManagerCity() {
        return managerCity;
    }

    public void setManagerCity(ManagerCity managerCity) {
        this.managerCity = managerCity;
    }

    public AuditorCity getAuditorCity() {
        return auditorCity;
    }

    public void setAuditorCity(AuditorCity auditorCity) {
        this.auditorCity = auditorCity;
    }

    public RequestorCity getRequestorCity() {
        return requestorCity;
    }

    public void setRequestorCity(RequestorCity requestorCity) {
        this.requestorCity = requestorCity;
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

    public abstract ArrayList<Role> getSupportedRole();
    
    @Override
    public String toString() {
        return CityName;
    }
}
