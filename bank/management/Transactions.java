/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author TAMANNA
 */
public class Transactions extends JFrame implements ActionListener {
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balance,exit;
    String pinnumber;
    Transactions(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,0,900,900);
        add(Image);
        
        JLabel text = new JLabel(" Please Select your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        Image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        Image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        Image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        Image.add( fastcash);
        
        ministatement= new JButton("Mini Statement");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        Image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        Image.add(pinchange);
        
        balance = new JButton("Balance Enquiry");
        balance.setBounds(355,485,150,30);
        balance.addActionListener(this);
        Image.add(balance);
        
        exit = new JButton("Exit");
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
            System.exit(0);
        
        }
        else if(ae.getSource() == deposit)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        
        }
        else if(ae.getSource() == withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        
        }
        else if(ae.getSource() == fastcash)
        {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        
        
        }
        else if(ae.getSource() == pinchange)
        {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == balance)
        {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== ministatement)
        {
//            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        
        }
    
    
    }
    public static void main(String args[])
    {
        new Transactions("");
    
    
    }
    
}
