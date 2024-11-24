
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author TAMANNA
 */
public class SignupTwo extends JFrame implements ActionListener {
//    long random;
    JTextField tinTextField,nidTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion1,category,income,education,occupation;
    String formno;
    
    
    SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        //Additional Details
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details" );
        AdditionalDetails.setFont(new Font("Railway",Font.BOLD,22));
        AdditionalDetails.setBounds(290,80,400,30);
        add(AdditionalDetails);
        
        
        //Religion
        JLabel religion = new JLabel("RELIGION:" );
        religion.setFont(new Font("Railway",Font.BOLD,20));
        religion.setBounds(100,140,120,30);
        add(religion);
        
        String valReligion[] = {"Islam","Hinduism","Buddhism","Christianity","Indigenous and Animistic","Other"};
        religion1 = new JComboBox(valReligion);
        religion1.setBounds(300,140,400,30);
        religion1.setBackground(Color.white);
        add(religion1);
        
        //Category
        JLabel category1 = new JLabel("CATEGORY:" );
        category1.setFont(new Font("Railway",Font.BOLD,20));
        category1.setBounds(100,190,120,30);
        add(category1);
        
       
       
        String valCategory[] = {"Savings Account","Current Accounts","Fixed Deposit Accounts(FDR)","Recurring Deposit Accounts(RD)","Loan Accounts","Foreign Currency Account","Student Accounts","SME Accounts","NITA Accounts","Salary Accounts"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);
        
        //Income
        JLabel income1 = new JLabel("INCOME:" );
        income1.setFont(new Font("Railway",Font.BOLD,20));
        income1.setBounds(100,240,200,30);
        add(income1);
        
        String incomeCategory[] = {"Null","<25,000","<50,000","<75,000","<1,00000","<1,50,000","<2,50,000","<5,00000","Upto 10,000000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.white);
        add(income);
        
  
        //Educational
        JLabel educational = new JLabel("EDUCATIONAL" );
        educational.setFont(new Font("Railway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);
        
        JLabel qualification = new JLabel("QUALIFICATION:" );
        qualification.setFont(new Font("Railway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String educationValues[] = {"SSC","HSC","Graduate","Post-Graduate","Doctrate","Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.white);
        add(education);
        
        //Occupation
        JLabel occupation1 = new JLabel("OCCUPATION:" );
        occupation1.setFont(new Font("Railway",Font.BOLD,20));
        occupation1.setBounds(100,390,200,30);
        add(occupation1);
        
        String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        //TIN NO
        JLabel tin = new JLabel("TIN NO:" );
        tin.setFont(new Font("Railway",Font.BOLD,20));
        tin.setBounds(100,440,200,30);
        add(tin);
        
        tinTextField = new  JTextField();
        tinTextField.setFont(new Font("Railway",Font.BOLD,14));
        tinTextField.setBounds(300,440,400,30);
        add(tinTextField);
        
        //NID NO
        JLabel nid = new JLabel("NID NO:" );
        nid.setFont(new Font("Railway",Font.BOLD,20));
        nid.setBounds(100,490,200,30);
        add(nid);
        
        nidTextField = new  JTextField();
        nidTextField.setFont(new Font("Railway",Font.BOLD,14));
        nidTextField.setBounds(300,490,400,30);
        add(nidTextField);
       
        //Senior Citizen
        JLabel sor = new JLabel("SENIOR CITIZEN:" );
        sor.setFont(new Font("Railway",Font.BOLD,20));
        sor.setBounds(100,540,200,30);
        add(sor);
       
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.white);
        add(sno);
        
        
        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);
       
        
        JLabel eaccount= new JLabel("EXISTING ACCOUNT:" );
        eaccount.setFont(new Font("Railway",Font.BOLD,20));
        eaccount.setBounds(100,590,250,30);
        add(eaccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        
        ButtonGroup exaccountgroup = new ButtonGroup();
        exaccountgroup.add(eyes);
        exaccountgroup.add(eno);
        
 
        
        next = new JButton("NEXT");
        next.setBackground(Color.gray);
        next.setForeground(Color.white);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        
        setSize(800,850);
        setLocation(350,10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
//        String formno = "" + random ; //long
        String sreligion = (String)religion1.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected())
        {
            seniorcitizen = "No";
        }
        
   
        String existingaccount = null;
        if(eyes.isSelected())
        {
            existingaccount= "Yes";
          
        }
        else if(eno.isSelected())
        {
            existingaccount = "No";
        
        }
       
        String stin = tinTextField.getText();
        String snid = nidTextField.getText();
        
        
        try
           {
                Connect c = new Connect();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+stin+"','"+snid+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //Signup3 Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        
        
        catch(Exception e)
        { 
            System.out.println(e);
        }
        
    
    }
    
    public static void main(String args[])
    {
    new SignupTwo("");
    
    
    
    
    }
    
}
