/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author TAMANNA
 */
public class Deposit extends JFrame implements ActionListener {
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    Deposit(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,0,900,900);
        add(Image);
        
        JLabel text = new JLabel("Enter Amount you want to deposit");
        text.setBounds(170,300,400,20);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        Image.add(text);
        
        amount = new  JTextField();
        amount.setFont(new Font("Railway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        Image.add(amount);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        deposit.addActionListener(this);
        Image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        Image.add(back);
        
        
                
        
        setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
        
    
    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == deposit)
        {
            String number = amount.getText();
            Date date = new Date();
            
            if(number.equals(""))
            {
             JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
            }
            else
            {
                try{
                Connect conn = new Connect();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"TAKA " +number+ " Deposited Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                }
                catch(Exception e)
                {
                  System.out.println(e);
                }
            }
        
        }
        else if (ae.getSource() == back)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    
    }
    
    public static void main(String args[])
    {
        new Deposit("");
    
    
    }
    
}
