/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.City.City;
import Business.Country.Country;
import Business.Request.Request;
import Business.State.State;
import Business.WorkQueue.WorkQueue;

import java.util.HashMap;

/**
 *
 * @author rohitjain
 */
public class FetchPastRequest {
    private HashMap<Integer,Request> pendingRequestList;
        public void FetchRequestAndStore(WHO system)
    {
        boolean flag;
        pendingRequestList=system.getRequestList();
        try {
            for(Request request:pendingRequestList.values())
            {
        for(Country country:system.getCountryList())
        {
            if(request.getCountry().getCountryName().equalsIgnoreCase(country.getCountryName()))
            {
                    
                country.getRequestList().put(request.getRequestID(), request);
                request.setCountry(country);
                for(State  state:country.getStateDirectory().getStateList())
                {
                    if(request.getState().getStateName().equalsIgnoreCase(state.getStateName()))
                    {
                state.getRequestList().put(request.getRequestID(), request);    
                for(City city:state.getCityDirectory().getCityList())
                {
                    if(request.getCity().getCityName().equalsIgnoreCase(city.getCityName()))
                    {
                        city.getRequestList().put(request.getRequestID(), request);
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
                
                
              system.getRequestList().remove(request.getRequestID());  
            }
            else
            {
                continue;
            }
            break;
        }
        
            }
 //   System.out.println(jObject);
}


   
   catch(Exception e) {
    System.out.println(e);
  }
        
//        for(Country country:system.getCountryList())
//        {
//            
//        }
 }
    
}
