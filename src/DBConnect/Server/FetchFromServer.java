/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect.Server;

import Business.Country.Country;
import Business.WHO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import org.json.JSONObject;

/**
 *
 * @author rohitjain
 */
public class FetchFromServer {
    
    private static final String host="jdbc:mysql://bhartiyaenterprisec.ipagemysql.com";
    private static final String username="msanitaion";
    private static final String password="Rohit@94";
}
//    public static void FetchRequestAndStore(WHO system)
//    {
//        try {
//  //String url = "http://bhartiyamattress.com/fetchRequestFromApplication.php?lastid="+system.getLastFetchedID();
//  URL obj = new URL(url);
//  HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//  int responseCode = con.getResponseCode();
//  System.out.println("\nSending 'GET' request to URL : " + url);
//  System.out.println("Response Code : " + responseCode);
//  BufferedReader in =new BufferedReader(
//  new InputStreamReader(con.getInputStream()));
//  String inputLine;
//  StringBuffer response = new StringBuffer();
//   while ((inputLine = in.readLine()) != null) {
//     response.append(inputLine);
//   } in .close();
   //print in String
   // System.out.println(response.toString());
//   JSONObject myresponse = new JSONObject(response.toString());
//for(int i=0;i<myresponse.length();i++)
//{
//    
//}
//   
//  } catch(Exception e) {
//    System.out.println(e);
//  }
//        
//        for(Country country:system.getCountryList())
//        {
//            
//        }
// }
//    }
//    public static void FetchRequestAndStore(WHO system)
//    {
//        try
//        {
//            
//        Class.forName("com.mysql.jdbc.Driver"); 
//    Connection con = DriverManager.getConnection( host, username, password );
//    Statement stmt = con.createStatement();
//     String strSelect = "select * from Request";
//      ResultSet rset = stmt.executeQuery(strSelect);
// System.out.println("The records selected are:");
//         int rowCount = 0;
//         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
//            String latitude = rset.getString("Latitude");
//          //  double price = rset.getDouble("price");
//            //int    qty   = rset.getInt("qty");
//            System.out.println(latitude);
//            ++rowCount;
//         }
//         System.out.println("Total number of records = " + rowCount);
// 
//    }
//    catch(SQLException sqex)
//    {
//        System.out.println(sqex.getMessage());
//    }
//        catch(ClassNotFoundException cnfex)
//        {
//            System.out.println(cnfex.getMessage());
//        }
//    }

