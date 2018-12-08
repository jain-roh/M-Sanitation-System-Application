/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Email;


import java.util.*;
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  


/**
 *
 * @author rohitjain
 */
public class SendEmail {
    static String to = "rohit.jain058@gmail.com";//change accordingly  
    static String from = "msanitation@who.com";
    static String host = "localhost";
      
      
      public static void sendMail()
      {
      Properties properties = System.getProperties();  
     properties.setProperty("mail.smtp.host", host);
      Session session = Session.getDefaultInstance(properties);  
  try
      {  
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject("Ping");  
         message.setText("Hello, this is example of sending email  ");  
  

         Transport.send(message);  
         System.out.println("message sent successfully....");  
      }
catch(MessagingException mex)
{
    mex.printStackTrace();
}
catch(Exception ex)
{
    System.out.println(ex.getMessage());
}
      }
}

