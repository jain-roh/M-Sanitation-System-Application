/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import Business.Request.Requestor;
import Business.Request.Status;
import java.util.Date;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author VAIBHAV RAJ
 */
public class RequestID {
    private int RequestID;
    private UserAccount userAccount;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

private float Long;
private float Lat;
private String RequestNo;
private Requestor requestor;
private Status status;
private Date DateTime;

private int CityID;
private String Notes;
private Double Budget;
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


    


    public float getLong() {
        return Long;
    }

    public void setLong(float Long) {
        this.Long = Long;
    }

    public float getLat() {
        return Lat;
    }

    public void setLat(float Lat) {
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
    return RequestID+"";
}
}
