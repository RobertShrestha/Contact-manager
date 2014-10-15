/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contactmanager;

/**
 *
 * @author Rashna
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Email {
       private static String fname;
       private static String lname;
       private static String email;
       private static String date;
       private static String amt;

    /**
     * @param args the command line arguments
     */
   public static void main(String [] args) 
   { 
      
       try{
       BufferedReader reader=new BufferedReader(new FileReader("email.txt"));
        String line=""; 
            while( (line=reader.readLine())!=null ){
                String[] tokens=line.split(",");
            if(tokens.length >=4){
                
        System.out.println("FirstName:"+tokens[0] + " "  + "LastName:"+tokens[1] + " "  + "Email:"+tokens[2] + " "  + "Due Date:"+tokens[3] + " "  + "Amount:"+tokens[4]);
        fname=tokens[0];
        lname=tokens[1];
        email=tokens[2];
        date=tokens[3];
        amt=tokens[4];
        // Recipient's email ID 
      String to = email;

      // Sender's email ID 
      String from = email;

      //sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", "smtp.ntc.net.np");

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try{
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
         
         // Set the subject
         message.setSubject("Hello");

         // set the actual message
        message.setText("Dear "+fname+" "+lname+",\n"+"You have due of "+amt+" showing in our record. Please clear all the dues by "+date+".\n"+"Thank you.");
         // Send message
         Transport.send(message);
         System.out.println("Message sent successfully....");
      }catch (MessagingException mex) {
          mex.printStackTrace();
      }
         } 
                      
        }
        reader.close();
       } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
   }
}
   
