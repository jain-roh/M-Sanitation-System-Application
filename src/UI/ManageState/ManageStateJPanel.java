/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageState;

import Business.City.City;
import Business.Country.Country;
import Business.Logger;
import Business.Request.Request;
import Business.Role.StateAdminRole;
import Business.State.*;
import Business.UserAccount.UserAccount;
import Business.WHO;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rohitjain
 */
public class ManageStateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCityJPanel
     */
    ArrayList<Request> requestList;
    JPanel userProcessContainer;
    StateAdminRole stateAdminRole;
    private Country country;
    private State state;
    private WHO who;
    City city;
    UserAccount userAccount;
    WHO business;
    
   
    public ManageStateJPanel(JPanel userProcessContainer, UserAccount account,City city, 
            State state,
            Country country,
            WHO who) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        requestList=new ArrayList<Request>();
        stateAdminRole=(StateAdminRole)account.getRole();
        this.country = country;
        this.state=state;
        this.userAccount = account;
        countryTextField.setText(country.getCountryName());
        stateTextField.setText(state.getStateName());
        this.who=who;
        populateCity();
             
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
/*
    public ManageStateJPanel(JPanel userProcessContainer, UserAccount account, City city, State state, Country country, WHO business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ManageStateJPanel(JPanel userProcessContainer, UserAccount account, City city, State state, Country country, WHO business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        addCityJLabel = new javax.swing.JLabel();
        addCityTextField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        cityComboBox = new javax.swing.JComboBox();
        AddCityManager = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        AddCityAuditor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updateRequest = new javax.swing.JButton();
        viewReports = new javax.swing.JButton();
        viewAllRequestsJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jButton1.setText("jButton1");

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

        addCityJLabel.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        addCityJLabel.setText("Add City :");

        AddButton.setText("Add City");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        AddCityManager.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        AddCityManager.setForeground(new java.awt.Color(31, 58, 147));
        AddCityManager.setText("Add City Manager");
        AddCityManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCityManagerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setText("State :");

        stateTextField.setEnabled(false);
        stateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextFieldActionPerformed(evt);
            }
        });

        AddCityAuditor.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        AddCityAuditor.setForeground(new java.awt.Color(52, 73, 94));
        AddCityAuditor.setText("Add City Auditor");
        AddCityAuditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCityAuditorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel6.setText("W E L C O M E !!");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setText("City List :");

        updateRequest.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        updateRequest.setForeground(new java.awt.Color(52, 73, 94));
        updateRequest.setText("Update Request");
        updateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRequestActionPerformed(evt);
            }
        });

        viewReports.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        viewReports.setForeground(new java.awt.Color(31, 58, 147));
        viewReports.setText("View Reports");
        viewReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportsActionPerformed(evt);
            }
        });

        viewAllRequestsJButton.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        viewAllRequestsJButton.setForeground(new java.awt.Color(52, 73, 94));
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(417, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AddButton)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addCityJLabel)
                                            .addComponent(jLabel7))
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cityComboBox, 0, 129, Short.MAX_VALUE)
                                            .addComponent(addCityTextField))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddCityManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(viewAllRequestsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(updateRequest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddCityAuditor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCityJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCityManager)
                    .addComponent(AddCityAuditor))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(updateRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewAllRequestsJButton)
                    .addComponent(viewReports))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 110, 123));
        jLabel5.setText("ADD CITY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void countryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryTextFieldActionPerformed

    private boolean CheckIfCityExists(String cityName)
        {
            for(City city : state.getCityDirectory().getCityList())
                {
                 if(city.getCityName().equalsIgnoreCase(cityName))
                    { 
                        return true;
                    }
                }
            return false;
        }
    
    
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
       
        if(addCityTextField.getText().equals("") )
        { 
            
            JOptionPane.showMessageDialog(this,"Please enter a value");
            addCityJLabel.setForeground(Color.red);
        }
        
        else if(CheckIfCityExists(addCityTextField.getText()))
        { 
            
            JOptionPane.showMessageDialog(this,"City already exists");
            addCityJLabel.setForeground(Color.red);
        }
        
            else
        {
             City city = new City();
            city.setCityName(addCityTextField.getText());
            state.getCityDirectory().getCityList().add(city);
             Logger.logDetails("ManageStateJPanel", "Add City", "New City Added: "+city.getCityName() + "By" + userAccount.getUsername());
            populateCity();
            addCityTextField.setText("");
            updateRequest();
        }   
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddCityManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCityManagerActionPerformed
        // TODO add your handling code here:
        if(cityComboBox.getSelectedItem()!=null)
        {
            City city = (City) cityComboBox.getSelectedItem();
            ManageStateAdminJPanel msajp = new ManageStateAdminJPanel(userProcessContainer, state,country,city,who,userAccount);
            userProcessContainer.add("managestateadminjapanel",msajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
        else
            JOptionPane.showMessageDialog(this, "Please select a City from the drop down");

    }//GEN-LAST:event_AddCityManagerActionPerformed

    private void stateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextFieldActionPerformed

    private void AddCityAuditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCityAuditorActionPerformed
        // TODO add your handling code here:
        if(cityComboBox.getSelectedItem()!=null)
        {
            City city = (City) cityComboBox.getSelectedItem();
            ManageStateAdminAuditorJPanel msajp = new ManageStateAdminAuditorJPanel(userProcessContainer, state,country,city,who,userAccount);
            userProcessContainer.add("managestateadminauditorjapanel",msajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            updateRequest();
        }
        
        else
            JOptionPane.showMessageDialog(this, "Please select a City from the drop down");

        
    }//GEN-LAST:event_AddCityAuditorActionPerformed

    private void updateRequest()
    {
      for(Request request:state.getRequestList().values())
        {
                for(City city:state.getCityDirectory().getCityList())
                {
                    if(request.getCity().getCityName().equalsIgnoreCase(city.getCityName()) && 
                            (!city.getRequestList().containsKey(request.getRequestID())))
                    {
                        city.getRequestList().put(request.getRequestID(), request);
                    }
                }
        }      
    }
    private void updateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRequestActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateRequestActionPerformed

    private void viewReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportsActionPerformed
        // TODO add your handling code here:
        
        ViewCityReport msajp = new ViewCityReport(userProcessContainer, state,country,null,who);
            userProcessContainer.add("managestateadminauditorjapanel",msajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_viewReportsActionPerformed

    private void viewAllRequestsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllRequestsJButtonActionPerformed
        
        StateAllRequestJPanel scajp = new StateAllRequestJPanel(userProcessContainer, userAccount,city,state,country,business);
        userProcessContainer.add("stateAllRequestJPanel",scajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewAllRequestsJButtonActionPerformed
   private void populateCity()
   {
       cityComboBox.removeAllItems();
       for(City city:state.getCityDirectory().getCityList())
       {
           cityComboBox.addItem(city);
       }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddCityAuditor;
    private javax.swing.JButton AddCityManager;
    private javax.swing.JLabel addCityJLabel;
    private javax.swing.JTextField addCityTextField;
    private javax.swing.JComboBox cityComboBox;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JButton updateRequest;
    private javax.swing.JButton viewAllRequestsJButton;
    private javax.swing.JButton viewReports;
    // End of variables declaration//GEN-END:variables
}
