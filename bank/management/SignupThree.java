/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author TAMANNA
 */
public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    String accountType;
    SignupThree(String formno)
    {
        this.formno = formno;
        setLayout(null);
        
        
        JLabel l1 = new JLabel("PAGE 3: ACCOUNT DETAILS");
        l1.setFont(new Font("Railway",Font.BOLD,22));
        l1.setBounds(280,5,400,40);
        add(l1);
        
        JLabel type = new JLabel("ACCOUNT TYPE");
        type.setFont(new Font("Railway",Font.BOLD,22));
        type.setBounds(100,50,200,30);
        add(type);
        
        r1 = new JRadioButton("SAVINGS ACCOUNT");
        r1.setFont(new Font("Railway",Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100,100,190,20);
        add(r1);
        
        r2 = new JRadioButton("CURRENT ACCOUNT");
        r2.setFont(new Font("Railway",Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(350,100,200,20);
        add(r2);
        
        r3 = new JRadioButton("FIXED DEPOSIT ACCOUNT");
        r3.setFont(new Font("Railway",Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100,140,240,20);
        add(r3);
        
        r4 = new JRadioButton("RECURRING DEPOSIT ACCOUNT(RD)");
        r4.setFont(new Font("Railway",Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(350,140,320,20);
        add(r4);
        
        r5 = new JRadioButton("LOAN ACCOUNT");
        r5.setFont(new Font("Railway",Font.BOLD,16));
        r5.setBackground(Color.white);
        r5.setBounds(100,180,180,20);
        add(r5);
        
        r6 = new JRadioButton("FOREIGN CURRENCY ACCOUNT");
        r6.setFont(new Font("Railway",Font.BOLD,16));
        r6.setBackground(Color.white);
        r6.setBounds(350,180,280,20);
        add(r6);
        
        r7 = new JRadioButton("STUDENT ACCOUNT");
        r7.setFont(new Font("Railway",Font.BOLD,16));
        r7.setBackground(Color.white);
        r7.setBounds(100,220,200,20);
        add(r7);
        
        r8 = new JRadioButton("SME ACCOUNT");
        r8.setFont(new Font("Railway",Font.BOLD,16));
        r8.setBackground(Color.white);
        r8.setBounds(350,220,180,20);
        add(r8);
        
        r9 = new JRadioButton("NITA ACCOUNT");
        r9.setFont(new Font("Railway",Font.BOLD,16));
        r9.setBackground(Color.white);
        r9.setBounds(100,260,180,20);
        add(r9);
        
        r10 = new JRadioButton("SALARY ACCOUNT");
        r10.setFont(new Font("Railway",Font.BOLD,16));
        r10.setBackground(Color.white);
        r10.setBounds(350,260,180,20);
        add(r10);
        
        
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        groupaccount.add(r5);
        groupaccount.add(r6);
        groupaccount.add(r7);
        groupaccount.add(r8);
        groupaccount.add(r9);
        groupaccount.add(r10);
        
        JLabel card = new JLabel("CARD NUMBER");
        card.setFont(new Font("Railway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4186");
        number.setFont(new Font("Railway",Font.BOLD,22));
        number.setBounds(330,300,250,30);
        add(number);
        
        JLabel carddetails = new JLabel("This is your 16-digit Card Number");
        carddetails.setFont(new Font("Railway",Font.BOLD,12));
        carddetails.setBounds(100,330,200,20);
        add(carddetails);
        
        JLabel pin = new JLabel("PIN NUMBER");
        pin.setFont(new Font("Railway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Railway",Font.BOLD,22));
        pinnumber.setBounds(330,370,200,30);
        add(pinnumber);
        
        JLabel pindetails = new JLabel("This is your 4-digit Pin Number");
        pindetails.setFont(new Font("Railway",Font.BOLD,12));
        pindetails.setBounds(100,400,200,20);
        add(pindetails);
        
        JLabel service = new JLabel("SERVICES REQUIRED");
        service.setFont(new Font("Railway",Font.BOLD,22));
        service.setBounds(100,430,250,30);
        add(service);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Railway",Font.BOLD,16));
        c1.setBounds(100,480,200,30);
        add(c1);
        
        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Railway",Font.BOLD,16));
        c2.setBounds(350,480,200,30);
        add(c2);
        
        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Railway",Font.BOLD,16));
        c3.setBounds(100,530,200,30);
        add(c3);
        
        c4 = new JCheckBox("E-MAIL & SMS ALERT");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Railway",Font.BOLD,16));
        c4.setBounds(350,530,200,30);
        add(c4);
        
        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Railway",Font.BOLD,16));
        c5.setBounds(100,580,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Railway",Font.BOLD,16));
        c6.setBounds(350,580,200,30);
        add(c6);
        
        c7 = new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Railway",Font.BOLD,12));
        c7.setBounds(100,620,600,30);
        add(c7);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.gray);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Railway",Font.BOLD,14));
        submit.setBounds(450,660,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.gray);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Railway",Font.BOLD,14));
        cancel.setBounds(580,660,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
//        String accountType;
        if(ae.getSource() == submit)
        {
            accountType = null;
            if(r1.isSelected())
            {
                accountType = "SAVINGS ACCOUNT";
            
            }
            
            else if(r2.isSelected())
            {
                accountType = "CURRENT ACCOUNT";
            
            }
            else if(r3.isSelected())
            {
                accountType = "FIXED DEPOSIT ACCOUNT";
            
            }
            else if(r4.isSelected())
            {
                accountType = "RECURRING DEPOSIT ACCOUNT(RD)";
            
            }
             else if(r5.isSelected())
            {
                accountType = "LOAN ACCOUNT";
            
            }
            
             else if(r6.isSelected())
            {
                accountType = "FOREIGN CURRENCY ACCOUNT";
            
            }
             else if(r7.isSelected())
            {
                accountType = "STUDENT ACCOUNT";
            
            }
             else if(r8.isSelected())
            {
                accountType = "SME ACCOUNT";
            
            }
            
             else if(r9.isSelected())
            {
                accountType = "NITA ACCOUNT";
            
            }
             else if(r10.isSelected())
            {
                accountType = "SALARY ACCOUNT";
            
            }
        
        }
        else if(ae.getSource() == cancel)
        { 
            setVisible(false);
            new Login().setVisible(true);
            
        
        }
        
        Random random = new Random();
        String cardnumber = "" + Math.abs((random.nextLong() % 9000000L)+ 5040936000000000L);
        String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
        
        String facility = "";
        
        if(c1.isSelected())
        {
          facility = facility + " ATM CARD";
        }
        else if(c2.isSelected())
        {
          facility = facility + " INTERNET BANKING";
        }
        else if(c3.isSelected())
        {
          facility = facility + " MOBILE BANKING";
        }
        else if(c4.isSelected())
        {
          facility = facility + " E-MAIL & SMS ALERT";
        }
        else if(c5.isSelected())
        {
          facility = facility + " CHEQUE BOOK";
        }
        else if(c6.isSelected())
        {
          facility = facility + " E-STATEMENT";
        }
//        else if(c7.isSelected())
//        {
//          facility = facility + " I here by declare that the above entered details are correct to the best of my knowledge. ";
//        }

          try
          {
              if(accountType.equals("") )
              {
                  JOptionPane.showMessageDialog(null,"Account Type is Required.");
              
              }
              else
              {
                  Connect conn = new Connect();
                  String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                  String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                  conn.s.executeUpdate(query1);
                  conn.s.executeUpdate(query2);
                  
                  JOptionPane.showMessageDialog(null, "CARD NUMBER: " + cardnumber +"\n PIN: " +pinnumber);
                  
                  setVisible(false);
                  new Deposit(pinnumber).setVisible(false);
              
              }
          
          }
          catch(Exception e)
          {
              System.out.println(e);
          
          
          }
          
          
    }
    
    public static void main (String args[])
    {
        new SignupThree("");
    
    
    }
    
}
