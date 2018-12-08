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
             
        populatNewRequestTable();
    }


protected void populatNewRequestTable()
{
    
     
     DefaultTableModel model = (DefaultTableModel) newRequestJTable1.getModel();
        
        model.setRowCount(0);
                DefaultTableModel model1 = (DefaultTableModel) newRequestJTable1.getModel();
        
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
        newRequestJTable1 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        viewRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(51, 110, 123));

        newRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(newRequestJTable1);

        backJButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(31, 58, 147));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewRequest.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viewRequest.setForeground(new java.awt.Color(219, 10, 91));
        viewRequest.setText("View Request");
        viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 110, 123));
        jLabel1.setText("All Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(viewRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(viewRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestActionPerformed

 if(!(newRequestJTable1.getSelectedRow()<0))
        {
            Request requestID1 = (Request) newRequestJTable1.getValueAt(newRequestJTable1.getSelectedRow(), 0);
            ManagerCityRequestViewJPanel mcvjp1 = new ManagerCityRequestViewJPanel(userProcessContainer, requestID1);
            userProcessContainer.add(mcvjp1);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        //    newRequestJTable1.getSelectionModel().clearSelection();
        }

    }//GEN-LAST:event_viewRequestActionPerformed

    public void AcceptRequest(Request requestID)
    {
         
        
    }
    
    
    
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable newRequestJTable1;
    private javax.swing.JButton viewRequest;
    // End of variables declaration//GEN-END:variables
}
