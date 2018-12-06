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
    String to = "sonoojaiswal1988@gmail.com";//change accordingly  
      String from = "sonoojaiswal1987@gmail.com";
      String host = "localhost";
      
      
      public void sendMail()
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
    
}
      }
}

