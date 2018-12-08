/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCountryPanel;

import UI.ManageCityPanel.*;
import UI.ManageCountryPanel.*;
import Business.City.City;
import Business.Country.Country;
import Business.Request.Request;
import Business.Request.Requestor;
import Business.Request.Status;
import Business.Role.CountryAdminRole;
import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WHO;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohitjain
 */
public class ManageCountryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCityJPanel
     */
    ArrayList<Request> requestList;
    JPanel userProcessContainer;
    CountryAdminRole countryAdminRole;
    private Country country;
    UserAccount userAccount;
    State state;
    City city;
    WHO business;
    public ManageCountryJPanel(JPanel userProcessContainer, UserAccount account,City city, 
            State state,
            Country country,
            WHO business) {
        initComponents();
        
        this.userAccount = account;
        this.userProcessContainer=userProcessContainer;
        requestList=new ArrayList<Request>();
        countryAdminRole=(CountryAdminRole)account.getRole();
        this.country = country;
        countryTextField.setText(country.getCountryName());
        this.state = state;
        this.city = city;
        this.business = business;
          
        populateState();
             
        /*RequestID request=new RequestID();
        request.setRequestID(1);
        request.setRequestNo("889");
        Status status=new Status(1,"New");
        Requestor requestor=new Requestor(1,"Rohit","rohit.jain058@gmail.com");
        request.setStatus(status);
        request.setRequestor(requestor);
      //  requests.add(request);
//        account.setUsername("rohit");
//        account.setPassword("rohit");
//        city.setCityID(1);
//        city.setCityName("Mumbai");
        */
        
        
        
        
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        addStateJLabel = new javax.swing.JLabel();
        addStateTextField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        stateComboBox = new javax.swing.JComboBox();
        AddStateAdmin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        viewAllRequestsJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(210, 215, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Country :");

        countryTextField.setEnabled(false);
        countryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryTextFieldActionPerformed(evt);
            }
        });

        addStateJLabel.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        addStateJLabel.setText("Add State :");

        AddButton.setText("Add State");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        AddStateAdmin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AddStateAdmin.setForeground(new java.awt.Color(219, 10, 91));
        AddStateAdmin.setText("Add State Admin");
        AddStateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStateAdminActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel4.setText("W E L C O M E !!");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("State List");

        viewAllRequestsJButton.setText("View All Requests");
        viewAllRequestsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllRequestsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(250, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(addStateJLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(addStateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(viewAllRequestsJButton))
                        .addGap(0, 246, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddStateAdmin)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStateJLabel)
                    .addComponent(addStateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(AddButton)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStateAdmin)
                    .addComponent(viewAllRequestsJButton))
                .addGap(108, 108, 108))
        );

        jLabel3.setBackground(new java.awt.Color(197, 239, 247));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 110, 123));
        jLabel3.setText("Add State");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void countryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryTextFieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
       
  
        if(addStateTextField.getText().equals("") )
        {  
            JOptionPane.showMessageDialog(this,"Please enter a value for state");
            addStateJLabel.setForeground(Color.red);
        }
            else
        {
             State state = new State();
            state.setStateName(addStateTextField.getText());
        
            country.getStateDirectory().getStateList().add(state);    
            populateState();
            addStateTextField.setText("");
        }   
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    
      private void updateRequest()
    {
      for(Request request:country.getRequestList().values())
        {
                for(State state:country.getStateDirectory().getStateList())
                {
                    if(request.getCity().getCityName().equalsIgnoreCase(state.getStateName()) && 
                            (!state.getRequestList().containsKey(request.getRequestID())))
                    {
                        state.getRequestList().put(request.getRequestID(), request);
                    }
                }
        }      
    }
    private void AddStateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStateAdminActionPerformed
        // TODO add your handling code here:
        if(stateComboBox.getSelectedItem()!=null)
        {
            State state = (State) stateComboBox.getSelectedItem();
            ManageCountryAdminJPanel mcajp = new ManageCountryAdminJPanel(userProcessContainer,state,country);
            userProcessContainer.add("managecountryadminjapanel",mcajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
        else
            JOptionPane.showMessageDialog(this, "Please select a state from the drop down");

    }//GEN-LAST:event_AddStateAdminActionPerformed

    private void viewAllRequestsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllRequestsJButtonActionPerformed
        // TODO add your handling code here:
            CountryAllRequestJPanel mcajp = new CountryAllRequestJPanel(userProcessContainer, userAccount,city,state,country,business);
            userProcessContainer.add("countryAllRequestJPanel",mcajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_viewAllRequestsJButtonActionPerformed
   private void populateState()
   {
       stateComboBox.removeAllItems();
       for(State state:country.getStateDirectory().getStateList())
       {
           stateComboBox.addItem(state);
       }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddStateAdmin;
    private javax.swing.JLabel addStateJLabel;
    private javax.swing.JTextField addStateTextField;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JButton viewAllRequestsJButton;
    // End of variables declaration//GEN-END:variables
}
