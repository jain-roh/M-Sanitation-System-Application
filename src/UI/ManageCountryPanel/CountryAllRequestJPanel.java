/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCountryPanel;

import UI.ManageCityPanel.*;
import Business.City.City;
import Business.Country.Country;
import Business.Request.Request;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WHO;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Avinash Chourasiya
 */
public class CountryAllRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCityJPanel
     */
    HashMap<Integer,Request> requestList;
 //   ArrayList<Request> requestList1;
    JPanel userProcessContainer;
    Country country;
    City city;
    State state;
    UserAccount account;
    
    public CountryAllRequestJPanel(JPanel userProcessContainer, UserAccount account,City city, 
            State state,
            Country country,
            WHO business) 
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        //requestList=new ArrayList<RequestID>();
        this.requestList=country.getRequestList();
        this.country = country;
        this.city = city;
        this.state = state;
        this.account = account;
        
//        account.setUsername("rohit");
//        account.setPassword("rohit");
//        city.setCityID(1);
//        city.setCityName("Mumbai");
        
        //Populate the requesting status table
        //requestList1=new ArrayList<RequestID>();
             
       populateCountryList();
       // populatNewRequestTable();
        displayList();
    }
  private void populateCountryList()
    {
        for(State state:country.getStateDirectory().getStateList())
            stateList.addItem(state);
    }
  public void displayList()
    {
              ArrayList<Request> reqList=new ArrayList<>();
        if(stateList.getSelectedIndex()==0)
        {
         reqList.addAll(country.getRequestList().values());
        }
        else
        {
            reqList.addAll(((State)stateList.getSelectedItem()).getRequestList().values());
        }
        
        int status=statusList.getSelectedIndex();
        
        reqList=getRequestListBasedOnStatus(reqList,status);
        if(reqList!=null)
        {
                DefaultTableModel model = (DefaultTableModel) stateRequestJTable.getModel();
        
        model.setRowCount(0);
                DefaultTableModel model1 = (DefaultTableModel) stateRequestJTable.getModel();
        
        model1.setRowCount(0);
        
        for (Request request : reqList)
        {

            Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getRequestor().getRequestorName();
            row[2]=request.getDateTime();
            row[3] = request.getStatus();
            row[4] = request.getRequestor().getRequestorEmail();
            
            row[5] = request.getCity();
            
            row[6] = request.getState();
            row[7]=request.getRequestor().getRequestorPhoneNumber();
            model.addRow(row);
            
          
     }
        }
    }
  
  private ArrayList<Request> getRequestListBasedOnStatus(ArrayList<Request> reqList,int status)
{
    ArrayList<Request> updatedReqList=new ArrayList<Request>();
    if(status==1)
    {
        for(Request req:reqList)
        {
            if(req.getStatus().getStatusId()==0)
            {
            updatedReqList.add(req);
            }
        }
    }
    else if(status==2)
    {
        for(Request req:reqList)
        {
            if(req.getStatus().getStatusId()>0 && req.getStatus().getStatusId()<5)
            {
            updatedReqList.add(req);
            }
        }
    }
    else if(status==3)
    {
        for(Request req:reqList)
        {
            if(req.getStatus().getStatusId()==5)
            {
            updatedReqList.add(req);
            }
        }
    }
        else if(status==4)
    {
        for(Request req:reqList)
        {
            if(req.getStatus().getStatusId()>5 && req.getStatus().getStatusId()<9)
            {
            updatedReqList.add(req);
            }
        }
    }
        else if(status==5)
    {
        for(Request req:reqList)
        {
            if(req.getStatus().getStatusId()==9)
            {
            updatedReqList.add(req);
            }
        }
    }
        else if(status==6)
    {
        for(Request req:reqList)
        {
            if(req.getStatus().getStatusId()==10)
            {
            updatedReqList.add(req);
            }
        }
    }
            else if(status==7)
    {
        for(Request req:reqList)
        {
            if(req.getStatus().getStatusId()==11)
            {
            updatedReqList.add(req);
            }
        }
    }
    else
                updatedReqList=reqList;
    return updatedReqList;
}
protected void populatNewRequestTable()
{
    
     
     DefaultTableModel model = (DefaultTableModel) stateRequestJTable.getModel();
        
        model.setRowCount(0);
                DefaultTableModel model1 = (DefaultTableModel) stateRequestJTable.getModel();
        
        model1.setRowCount(0);
        
        for (Request request : requestList.values())
        {

            Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getRequestor().getRequestorName();
            row[2]=request.getDateTime();
            row[3] = request.getStatus();
            row[4] = request.getRequestor().getRequestorEmail();
            
            row[5] = request.getCity();
            row[6] = request.getState();
            row[7] = request.getRequestor().getRequestorPhoneNumber();
            model.addRow(row);
            
                     
     }
       
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        stateRequestJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        stateList = new javax.swing.JComboBox();
        statusList = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(51, 110, 123));

        stateRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RequestNo", "Name", "Date", "Status", "Email Id", "City", "State", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(stateRequestJTable);

        backJButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(31, 58, 147));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 110, 123));
        jLabel1.setText("Requests under the Queue of Country");

        stateList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        stateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateListActionPerformed(evt);
            }
        });

        statusList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "New Request", "Working Request", "Proposal", "Reverted", "Accepted", "Built", "Rejected" }));
        statusList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(stateList, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusList, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void AcceptRequest(Request requestID)
    {
         
        
    }
    
    
    
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void stateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateListActionPerformed
        // TODO add your handling code here:

        //        if(cityList.getSelectedIndex()>0)
        //        {
            //        populateCityRequestTable((City)cityList.getSelectedItem());
            //        }
        //        else
        //        {
            //            populatNewRequestTable();
            //        }
        displayList();
    }//GEN-LAST:event_stateListActionPerformed

    private void statusListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusListActionPerformed
        // TODO add your handling code here:
        displayList();

    }//GEN-LAST:event_statusListActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox stateList;
    private javax.swing.JTable stateRequestJTable;
    private javax.swing.JComboBox statusList;
    // End of variables declaration//GEN-END:variables
}
