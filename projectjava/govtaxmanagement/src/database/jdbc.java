package database;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class jdbc {
    public jdbc(){
   // }
   // public void connect{
        try{
            
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6696263",
                    "sql6696263",
                    "dHqGrEmbfF"
            );
            
            
          Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM login_details");

            
            
           // while(resultSet.next())
            {
                
                  //  System.out.println("UID is " + resultSet.getString("aid"));
                  //  System.out.println("Password is "+resultSet.getString("password"));
                   // System.out.println("and password to be updated");
                
            }
            
        connection.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

    
    }
   public static boolean check(String id,String pass){
    boolean tru=false;
         try{
            
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6696263",
                    "sql6696263",
                    "dHqGrEmbfF"
            );
            
            
          Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM login_details");

            
            
            while(resultSet.next())
            {
                
                  String did=resultSet.getString("aid");
                  String dpass = resultSet.getString("password");
                  if(did.equals(id) && dpass.equals(pass)){
                  tru=true;
                  }
                  
                
            }
            
            
        connection.close();
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
         return tru;
   }
   
        
    
}