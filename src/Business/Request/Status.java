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
    @Override
    public String toString()
    {
        if(this.statusId==1)
        {
            return "Manager Acceptance";
        }
        else if(this.statusId==2)
        {
            return "Auditor Acceptance";
        }
            else if(this.statusId==3)
        {
            return "Auditing Complete";
        }
               else if(this.statusId==4)
        {
            return "Auditing Complete";
        }
               else if(this.statusId==5)
        {
            return "Management Proposal";
        }
               else if(this.statusId==6)
        {
            return "State Reversal";
        }
               else if(this.statusId==7)
        {
            return "Reversal Accepted";
        }
               else if(this.statusId==8)
        {
            return "State Acceptence";
        }
               else if(this.statusId==9)
        {
            return "State Fund Release";
        } 
               else if(this.statusId==10)
                       return "Lavatory Built";
               else if(this.statusId==11)
                   return "Rejected";
               else if(this.statusId==0)
               {
                   return "New Request";
               }
        return "";
                
    }
     
}
