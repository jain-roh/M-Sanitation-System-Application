/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect.Server;

import Business.City.City;
import Business.Country.Country;
import Business.Request.Request;
import Business.Request.Requestor;
import Business.Request.Status;
import Business.State.State;
import Business.WHO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
//import org.json.JSONObject;

/**
 *
 * @author rohitjain
 */
public class FetchFromServer {
    
    private static final String host="jdbc:mysql://bhartiyaenterprisec.ipagemysql.com";
    private static final String username="msanitaion";
    private static final String password="Rohit@94";

    public static void FetchRequestAndStore(WHO system)
    {
        try {
  String url = "http://bhartiyamattress.com/fetchRequestFromApplication.php?lastid="+system.getLastFetchedID();
  URL obj = new URL(url);
  HttpURLConnection con = (HttpURLConnection) obj.openConnection();
  int responseCode = con.getResponseCode();
  System.out.println("\nSending 'GET' request to URL : " + url);
  System.out.println("Response Code : " + responseCode);
  BufferedReader in =new BufferedReader(
  new InputStreamReader(con.getInputStream()));
  String inputLine;
  StringBuffer response = new StringBuffer();
   while ((inputLine = in.readLine()) != null) {
     response.append(inputLine);
   } in .close();
   
   
    System.out.println(response.toString());
   JSONArray myresponse = new JSONArray(response.toString());
            System.out.println("JSON" + myresponse);
for(int i=0;i<myresponse.length();i++)
{
    JSONObject jObject=myresponse.getJSONObject(i);
    
    String State=jObject.getString("State");
    String ReqNo=jObject.getString("RequestNo");
    String RequestorName=jObject.getString("RequestorName");
    String Address=jObject.getString("Address");
    String RequestorEmail=jObject.getString("RequestorEmail");
    String RequestorMobile=jObject.getString("RequestorMobile");
    int ID=jObject.getInt("ID");
    Double latitude=jObject.getDouble("Latitude");
    Double longitude=jObject.getDouble("Longitude");
        String CountryName=jObject.getString("Country").toUpperCase();
        String ZipCode=jObject.getString("ZipCode");
        String City=jObject.getString("City");
        int Status=jObject.getInt("Status");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date reqDate=simpleDateFormat.parse(jObject.getString("RequestDate"));
        String mobileNumber=jObject.getString("RequestorMobile");
        boolean flag=false;
        Request request=new Request();
       request.setStatus(new Status(Status, "New  Request"));
        request.setRequestor(new Requestor(ID,RequestorName,RequestorEmail));
        request.setAddress(Address);
        request.setLat(latitude);
        request.setLong(longitude);
        request.setRequestID(ID);
        request.setRequestNo(ReqNo);
        request.setDateTime(reqDate);
        request.getRequestor().setRequestorPhoneNumber(mobileNumber);
        system.setLastFetchedID(ID);
        
        for(Country country:system.getCountryList())
        {
            if(CountryName.equalsIgnoreCase(country.getCountryName()))
            {
             flag=true;
                country.getRequestList().put(ID, request);
                for(State  state:country.getStateDirectory().getStateList())
                {
                    if(State.equalsIgnoreCase(state.getStateName()))
                    {
                state.getRequestList().put(ID, request);    
                for(City city:state.getCityDirectory().getCityList())
                {
                    if(City.equalsIgnoreCase(city.getCityName()))
                    {
                        city.getRequestList().put(ID, request);
                        break;
                        
                    }
                    else
                    {
                        continue;
                    }
                    
                }
                    }
                    else
                    {
                        continue;
                    }
                    break;
                }
                
                
                
            }
            else
            {
                continue;
            }
            break;
        }
        if(!flag)
        {
            request.setCountry(new Country(CountryName));
           // request.getCountry().setCountryName(CountryName);
            request.setCity(new City(City));
          //  request.getCountry().setCountryName(CountryName);
            request.setState(new State(State));
            //request.getCountry().setCountryName(CountryName);
            
            system.getRequestList().put(ID, request);
        }
    System.out.println(jObject);
} 
} catch(Exception e) {
    System.out.println(e);
  }
        
//        for(Country country:system.getCountryList())
//        {
//            
//        }
 }
}
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

