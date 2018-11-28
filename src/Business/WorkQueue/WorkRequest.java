/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author VAIBHAV RAJ
 */
public abstract class WorkRequest {
    
   private int RequestID;
private int StatusID;
private int RequesterID;
private float Long;
private float Lat;
private int RequestNo;

private Date DateTime;

private int CityID;

private String Notes;

private Double Budget;

public WorkRequest(){
        DateTime = new Date();
    }

    public int getRequestID() {
        return RequestID;
    }

    public void setRequestID(int RequestID) {
        this.RequestID = RequestID;
    }

    public int getStatusID() {
        return StatusID;
    }

    public void setStatusID(int StatusID) {
        this.StatusID = StatusID;
    }

    public int getRequesterID() {
        return RequesterID;
    }

    public void setRequesterID(int RequesterID) {
        this.RequesterID = RequesterID;
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

    public int getRequestNo() {
        return RequestNo;
    }

    public void setRequestNo(int RequestNo) {
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

}
