/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management;
import java.sql.*;

/**
 *
 * @author TAMANNA
 */
public class Connect {
    
    Connection c;
    Statement s;
    public Connect()
    { 
        try
        {
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","codeforinterview");
            s = c.createStatement();
    
        } 
        catch(Exception e )
        {
            System.out.println(e);
        
        
        
        }
    
    }
    
        
}
