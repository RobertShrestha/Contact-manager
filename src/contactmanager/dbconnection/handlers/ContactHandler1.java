/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contactmanager.dbconnection.handlers;

import contactmanager.dbconnection.DbConnection;
import contactmanager.objects.Contact;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ANUKUL CHHETRI
 */
public class ContactHandler1 {

    
    public static int insert(Contact contact) throws ClassNotFoundException, SQLException, IOException{
       // Customer customer=new Customer();
        DbConnection connection=new DbConnection();
        String sql="INSERT INTO contact(First_name,Last_name,Email,Phone,Mobile,DOB,Facebook,Twitter,Linkedin,Googleplus,Added_date,Modified_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt=connection.initStatement(sql);
        stmt.setString(1,contact.getFirstname());
        stmt.setString(2,contact.getLastname());
        stmt.setString(3,contact.getEmail());
        stmt.setString(4,contact.getPhone());
        stmt.setString(5,contact.getMobile());
        stmt.setString(6,contact.getDOB());
        stmt.setString(7,contact.getFacebook());
        stmt.setString(8,contact.getTwitter());
        stmt.setString(9,contact.getLinkedin());
        stmt.setString(10,contact.getGoogleplus());
        stmt.setString(11,contact.getAdded_date());
        stmt.setString(12,contact.getModified_date());
        int result=connection.executeNonQuery();
        JOptionPane.showMessageDialog(null,"data is inserted into database");
        connection.close();
        return result;
    }        
    public static ArrayList<Contact> getAll() throws SQLException, ClassNotFoundException{
        ArrayList<Contact> contacts=new ArrayList<Contact>();
        DbConnection connection=new DbConnection();
        String sql="SELECT Email,First_name,Last_name,DOB from contact";
        PreparedStatement stmt=connection.initStatement(sql);
        ResultSet rs=connection.executeReader();
            while(rs.next()){
            Contact c=new Contact();
            c.setDe(rs.getString("DOB"));
            c.setFn(rs.getString("First_name"));
            c.setLn(rs.getString("Last_name"));
            c.setEm(rs.getString("Email"));
            contacts.add(c);
            
        }
        connection.close();
        return contacts;        
    }
   /* private static Contact mapData(ResultSet rs) throws SQLException{
        Contact contact=new Contact();
        contact.setBlogId(rs.getInt("blog_id"));
        contact.setBlogTitle(rs.getString("blog_title"));
        contact.setBlogDescription(rs.getString("blog_description"));
        contact.setStatus(rs.getBoolean("status"));
        return blog;
    }*/
    }
    

    /*
    public static int Update(Contacts contact) throws ClassNotFoundException, SQLException, IOException{
        
        DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="UPDATE Suppliers set Company_Id='"+contact.getId()+"',Company_Name='"+supplier.getCompany_name()+"',customer_address='"+supplier.getNOMP()+ "',Typeofservice'"+supplier.getTypeofService()+"' WHERE customer_id=" +"' WHERE customer_id=" + supplier.getCompany_id();        
        int result =conn.execute(sql);
        conn.close();
        return result;
    }    

     public static int Delete(String Id) throws ClassNotFoundException, SQLException, IOException{
        DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="DELETE FROM Suppliers  WHERE Company_Name=" + Company_id;
        
        int result =conn.execute(sql);
        conn.close();
        return result;
    } 
     
     public static ArrayList<Supplier> getAll() throws ClassNotFoundException, SQLException, IOException
     {
         ArrayList<Supplier> suppliers=new ArrayList<Supplier>();
         DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="SELECT * FROM Suppliers";
        ResultSet rs=conn.executeQuery(sql);
        while(rs.next()){
            Supplier s=new Supplier();
            s.setCompany_id(rs.getInt("Company_Id"));
            s.setCompany_name(rs.getString("Company_Name"));
            s.setNOMP(rs.getInt("NOMP"));
            s.setTypeofService(rs.getString("Typeofservice"));
            suppliers.add(s);
        }
        conn.close();
        
        return suppliers;
     }
     
     public static Supplier getById(int Company_id) throws ClassNotFoundException, SQLException, IOException
     {
        Supplier supplier=null;
         DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="SELECT * FROM Suppliers WHERE Company_Id=" + Company_id;
        ResultSet rs=conn.executeQuery(sql);
        while(rs.next()){
            supplier=new Supplier();
            supplier.setCompany_id(rs.getInt("Company_Id"));
            supplier.setCompany_name(rs.getString("Company_Name"));
            supplier.setNOMP(rs.getInt("NOMP"));
            supplier.setTypeofService(rs.getString("Typeofservice"));
           
        }
        conn.close();
        
        return supplier;
     }    
     
     
     
     public static ArrayList<Supplier> getPaging(int offset,int limit) throws ClassNotFoundException, SQLException, IOException
     {

        String sql="SELECT * FROM Customers LIMIT " + offset + "," + limit;
        ArrayList<Supplier> suppliers=new ArrayList<Supplier>();
         DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
       
        ResultSet rs=conn.executeQuery(sql);
        while(rs.next()){
            Supplier s=new Supplier();
            s.setCompany_id(rs.getInt("Company_Id"));
            s.setCompany_name(rs.getString("Company_Name"));
            s.setNOMP(rs.getInt("NOMP"));
            s.setTypeofService(rs.getString("Typeofservice"));
            suppliers.add(s);
        }
        conn.close();
        
        return suppliers;
   
     }   

     public static int count() throws ClassNotFoundException, SQLException, IOException
     {
        int total=0;
         DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="SELECT count(Company_Id) as total FROM Suppliers ";
        ResultSet rs=conn.executeQuery(sql);
        while(rs.next()){
            
            total=rs.getInt("total");

           
        }
        conn.close();
        
        return total;
     }
     
     public static Supplier getByNumber(int number) throws ClassNotFoundException, IOException, SQLException
     {
        Supplier  supplier= new Supplier(); 
        DbConnection conn=new DbConnection();
        conn.open();
        String sql="SELECT * FROM Customers WHERE customer_phone=" + number;
        ResultSet rs=conn.executeQuery(sql);
        while(rs.next()){
            supplier=new Supplier();
            supplier.setCompany_id(rs.getInt("Company_Id"));
            supplier.setCompany_name(rs.getString("Company_Name"));
            supplier.setNOMP(rs.getInt("NOMP"));
            supplier.setTypeofService(rs.getString("Typeofservice"));
           
        }
        conn.close();
        
        return supplier;
     }
     public static int Loginsystem(String Username,String Password) throws ClassNotFoundException, SQLException, IOException{
        int count=0;
         DbConnection conn=new DbConnection();
        conn.open(); //Open the Connection
        String sql="SELECT Username, Password FROM user WHERE Username='"+Username+"'and Password'"+Password+"";
        DbConnection db=new DbConnection();
        ResultSet rs=db.executeQuery(sql);
        
         while(rs.next())
     {
         count=count+1;
         
     }
        conn.close();
        return count;
        
    } 
    }*/