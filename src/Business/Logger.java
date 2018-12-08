/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author rohitjain
 */
public class Logger {
    
    public static void logDetails(String className,String functionName,String logData)
    {
      Date date = new Date();
String today= new SimpleDateFormat("yyyy-MM-dd").format(date);
        
        String logFileName=today.toString().replace("-","_")+".log";
        try
        {
        File logFile = new File("LogFiles/"+logFileName);
        
logFile.createNewFile(); // if file already exists will do nothing 
//FileOutputStream log = new FileOutputStream(logFile, false); 
//log.close();;
String text = "\nClass - "+className+" In Function - "+functionName+": At"+date.toString()+" : \n"+logData;
Files.write(Paths.get(logFileName), text.getBytes());


        }
        catch(IOException ioex)
        {
            
        }
        
    }
    
}
