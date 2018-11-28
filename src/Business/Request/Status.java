/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

/**
 *
 * @author VAIBHAV RAJ
 */
public class Status {
private int statusId;
    private String statusMsg;
    
    public Status(int statusId,String statusMsg)
    {
        this.statusId=statusId;
        this.statusMsg=statusMsg;
    }
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }
     
}
