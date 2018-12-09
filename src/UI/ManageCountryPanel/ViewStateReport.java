/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManageCountryPanel;

import UI.WHO.*;
import Business.City.City;
import Business.Country.Country;
import Business.Request.Request;
import Business.State.State;
import Business.WHO;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import org.jfree.data.general.PieDataset;
//import sun.org.mozilla.javascript.internal.Token;

/**
 *
 * @author rohitjain
 */
public class ViewStateReport extends javax.swing.JPanel {

    /**
     * Creates new form ViewStateReport
     */
    
    State state;
    Country country;
    public ViewStateReport(JPanel userProcessContainer, State state, Country country,City city, 
            
           
            WHO who) {
        initComponents();
        
        this.state = state;
        this.country=country;
        populateCountryList();
       
    }
    
    
    private void populateCountryList()
    {
        for(State state:country.getStateDirectory().getStateList())
        {
            stateList.addItem(state);
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

        stateList = new javax.swing.JComboBox();
        Generate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 215, 211));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Generate.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        Generate.setForeground(new java.awt.Color(52, 73, 94));
        Generate.setText("SELECT");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 110, 123));
        jLabel1.setText("STATE REPORT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(stateList, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Generate)))))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Generate)
                    .addComponent(stateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        // TODO add your handling code here:
        
        if(stateList.getSelectedIndex()>=0)
        {
        State state=(State)stateList.getSelectedItem();
        JFreeChart chart = createChart(createDataset(state),state.getStateName()); 
               jPanel1.setLayout(new java.awt.BorderLayout()); 
      ChartPanel chartPanel = new ChartPanel( chart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 350 , 400) );       
jPanel1.add(chartPanel,BorderLayout.CENTER);
jPanel1.validate();
    //  jPanel1.add(chartPanel);
        }
    }//GEN-LAST:event_GenerateActionPerformed

    private static JFreeChart createChart( PieDataset dataset,String countryName ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         countryName+ " Country Report",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);
      return chart;
   }
    
    private static PieDataset createDataset(State state) {
      int countNew=0,countWorking=0,countBuilt=0,countRejected=0;
      for(Request request:state.getRequestList().values())
      {
          if(request.getStatus().getStatusId()==0)
              countNew++;
          else if(request.getStatus().getStatusId()==12)
              countRejected++;
          else if(request.getStatus().getStatusId()==11)
                    countBuilt++;
          else
              countWorking++;
        }
        
      DefaultPieDataset dataset = new DefaultPieDataset( );
      
      dataset.setValue( "New Request" , new Double( countNew ) );  
      dataset.setValue( "Working" , new Double( countWorking ) );   
      dataset.setValue( "Built" , new Double( countBuilt ) );   
            dataset.setValue( "Rejected" , new Double( countRejected ) );   
      return dataset;       
   }
    
    
    public void ExcelAnalytics() throws Exception
    {
         /*
                 try
            {
        //Create blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook();
      
      //Create a blank sheet
      XSSFSheet spreadsheet = workbook.createSheet( "All_Requests");

      //Create row object
      XSSFRow row;

      //This data needs to be written (Object[])
      Map <String, Object[]> allRequest = new TreeMap <String, Object[]>();
      
      int treeSize = state.getRequestList().values().size();
      int i=1;
      
      allRequest.put( Integer.toString(i), new Object[] 
      {"State", "City", "Request Number","Status","Budget"});
      
      for(Request request : state.getRequestList().values())
        {
          do
          {
              allRequest.put(Integer.toString(i),new Object[]{request.getState(),request.getCity(),request.getRequestNo(),request.getStatus(),request.getBudget()});
              
              i++;
              treeSize--;
          }
          while(treeSize>0);
        
      }
      
      
      //Iterate over data and write to sheet
      Set <String> keyid = allRequest.keySet();
      int rowid = 0;
      
      for (String key : keyid) 
      {
         row = spreadsheet.createRow(rowid++);
         Object [] objectArr = allRequest.get(key);
         int cellid = 0;
         
         for (Object obj : objectArr)
         {
            Cell cell = row.createCell(cellid++);
            cell.setCellValue((String)obj);
         }
      } 
      //Write the workbook in file system
      FileOutputStream out = new FileOutputStream(new File("C:\\NeU\\Application Engineering - Java\\MSanitation_Final_Project\\msanitation_project\\Excel Analytics.xlsx"));
      
      workbook.write(out);
      out.close();
      System.out.println("Writesheet.xlsx written successfully");
    
            }
            catch(Exception ex)
            {
               System.out.println(ex.getMessage());
            }
      
      */
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox stateList;
    // End of variables declaration//GEN-END:variables
}
