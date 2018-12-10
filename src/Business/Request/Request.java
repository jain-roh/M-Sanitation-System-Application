/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import Business.City.City;
import Business.Country.Country;
import Business.State.State;
import java.util.Date;
import Business.UserAccount.UserAccount;

/**
 *
 * @author VAIBHAV RAJ
 */
public class Request {
    private int RequestID;
    private UserAccount userAccount;

  

private Double Long;
private Double Lat;
private String RequestNo;
private Requestor requestor;
private Status status;
private Date DateTime;
private State state;
private City city;
private Country country;
private String  Address;
private int CityID;
private String Notes;
private Double Budget;

private UserAccount managerUserAccountr;
private UserAccount stateAdminUserAccountr;

    public UserAccount getManagerUserAccountr() {
        return managerUserAccountr;
    }

    public void setManagerUserAccountr(UserAccount managerUserAccountr) {
        this.managerUserAccountr = managerUserAccountr;
    }

    public UserAccount getStateAdminUserAccountr() {
        return stateAdminUserAccountr;
    }

    public void setStateAdminUserAccountr(UserAccount stateAdminUserAccountr) {
        this.stateAdminUserAccountr = stateAdminUserAccountr;
    }


  public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Requestor getRequestor() {
        return requestor;
    }

    public void setRequestor(Requestor requestor) {
        this.requestor = requestor;
    }


    public int getRequestID() {
        return RequestID;
    }

    public void setRequestID(int RequestID) {
        this.RequestID = RequestID;
    }


    


    public Double getLong() {
        return Long;
    }

    public void setLong(Double Long) {
        this.Long = Long;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double Lat) {
        this.Lat = Lat;
    }

    public String getRequestNo() {
        return RequestNo;
    }

    public void setRequestNo(String RequestNo) {
        this.RequestNo = RequestNo;
    }

    public Date getDateTime() {
        return DateTime;
    }

    public void setDateTime(Date DateTime) {
        this.DateTime = DateTime;
    }

    public int getCityID() {
        return CityID;
    }

    public void setCityID(int CityID) {
        this.CityID = CityID;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public Double getBudget() {
        return Budget;
    }

    public void setBudget(Double Budget) {
        this.Budget = Budget;
    }
@Override
public String toString()
{
    return RequestNo+"";
}
}
