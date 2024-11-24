/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

/**
 *
 * @author TAMANNA
 */
public class FastCash extends JFrame implements ActionListener {
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balance,exit;
    String pinnumber;
    FastCash(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,0,900,900);
        add(Image);
        
        JLabel text = new JLabel("Select Withdrawl Amount ");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        Image.add(text);
        
        deposit = new JButton("TAKA 500");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        Image.add(deposit);
        
        withdrawl = new JButton("TAKA 1000");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        Image.add(withdrawl);
        
        fastcash = new JButton("TAKA 2000");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        Image.add( fastcash);
        
        ministatement= new JButton("TAKA 3000");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        Image.add(ministatement);
        
        pinchange = new JButton("TAKA 5000");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        Image.add(pinchange);
        
        balance = new JButton("TAKA 10000");
        balance.setBounds(355,485,150,30);
        balance.addActionListener(this);
        Image.add(balance);
        
        exit = new JButton("BACK");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        Image.add(exit);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    
    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == exit)
        {
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
        
        }
        else
        {
            String amount = ((JButton)ae.getSource()).getText().substring(5);
            Connect c = new Connect();
            try
            {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                
                int balance = 0;
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
                if(ae.getSource() != exit && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber +"','"+date+"','withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"TAKA " +amount+ " Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                        
            
            }
            catch(Exception e)
            {
                System.out.println(e);
            
            }
        
        }
    
    
    }
    public static void main(String args[])
    {
        new FastCash("");
    
    
    }
    
}
