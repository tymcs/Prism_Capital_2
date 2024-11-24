
package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back;
    String pinnumber;
    
    BalanceEnquiry(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,0,900,900);
        add(Image);
        
        back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        Image.add(back);
        
         Connect c = new Connect();
         int balance = 0;
            try
            {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                
                
                while(rs.next())
                {
                    if(rs.getString("type").equals("Deposit") )
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    
                    } 
                    else
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    
                    }
                
                }
            } 
            catch(Exception e)
            { 
               System.out.println(e);
            }
            
            
        JLabel text = new JLabel("Your Current Account Balance is Tk. " + balance);
        text.setBounds(170,300,400,30);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        Image.add(text);
       
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    
    }
    public static void main(String args[])
    {
        new BalanceEnquiry("").setVisible(true);
    
    }
    
}
