/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.WHO;

import Business.WHO;
import Business.Employee.Employee;
import Business.State.State;
import Business.Country.Country;
import Business.Role.AdminRole;
import Business.Role.CountryAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class WHOManageCountryAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WHO who;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public WHOManageCountryAdminJPanel(JPanel userProcessContainer, WHO who) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.who = who;

        populateTable();
        populateCountryComboBox();
       
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) countryJTable.getModel();

        model.setRowCount(0);
        for (Country country : who.getCountryList()) {
                for (UserAccount userAccount : country.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = country.getCountryName();
                   
                    row[1] = userAccount.getUsername();

                    model.addRow(row);
                }
            
        }
    }

    private void populateCountryComboBox(){
        countryJComboBox.removeAllItems();
        
        for (Country country : who.getCountryList()){
            countryJComboBox.addItem(country);
        }
    }
    
//    private void populateEnterpriseComboBox(Country country){
//        enterpriseJComboBox.removeAllItems();
//        
//        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
//            enterpriseJComboBox.addItem(enterprise);
//        }
//        
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        countryJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        countryJComboBox = new javax.swing.JComboBox();
        userNameJLabel = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        passwordJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        NameJLabel = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setForeground(new java.awt.Color(210, 215, 211));

        countryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(countryJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(115, 101, 152));
        jLabel1.setText("Network");

        countryJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryJComboBoxActionPerformed(evt);
            }
        });

        userNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        userNameJLabel.setForeground(new java.awt.Color(115, 101, 152));
        userNameJLabel.setText("Username");

        submitJButton.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        submitJButton.setText("SUBMIT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        passwordJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passwordJLabel.setForeground(new java.awt.Color(115, 101, 152));
        passwordJLabel.setText("Password");

        NameJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        NameJLabel.setForeground(new java.awt.Color(115, 101, 152));
        NameJLabel.setText("Name");

        backJButton.setBackground(new java.awt.Color(149, 165, 166));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backJButton.setForeground(new java.awt.Color(31, 58, 147));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("ADD COUNTRY ADMIN CREDENTIALS ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userNameJLabel)
                                .addComponent(passwordJLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usernameJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordJPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(countryJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(NameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(countryJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameJLabel)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameJLabel)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void countryJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryJComboBoxActionPerformed

       
        
        
        
    }//GEN-LAST:event_countryJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        if(usernameJTextField.getText().equals(""))
      
        { 
         JOptionPane.showMessageDialog(this, "Please enter a user name");
         userNameJLabel.setForeground(Color.red);
        }
        else if(String.valueOf(passwordJPasswordField.getPassword()).equals(""))
         
        {
            
            JOptionPane.showMessageDialog(this, "Please enter a password");
            passwordJLabel.setForeground(Color.RED);
        }  
        
        else if(nameJTextField.getText().equals("")) 
        {
            
            JOptionPane.showMessageDialog(this, "Please enter a Name"); 
            NameJLabel.setForeground(Color.red);
        }
        
        else
        {
        Country country = (Country) countryJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        
        Employee employee = country.getEmployeeDirectory().createEmployee(name);
        
        UserAccount account = country.getUserAccountDirectory().createUserAccount(username, password, employee, new CountryAdminRole());
        populateTable();
        JOptionPane.showMessageDialog(this, "User succesfully created"); 
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameJLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox countryJComboBox;
    private javax.swing.JTable countryJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
