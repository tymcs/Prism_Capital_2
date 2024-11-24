/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author TAMANNA
 */
public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,
    districtTextField,divisionTextField,pinTextField;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    
    SignupOne()
    {
        setLayout(null);
        
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO." +random  );
        formno.setFont(new Font("Railway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel PersonalDetails = new JLabel("Page 1: Personal Details" );
        PersonalDetails.setFont(new Font("Railway",Font.BOLD,22));
        PersonalDetails.setBounds(290,80,400,30);
        add(PersonalDetails);
        
        JLabel name = new JLabel("NAME: " );
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new  JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("FATHER'S NAME: " );
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new  JTextField();
        fnameTextField.setFont(new Font("Railway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("DATE OF BIRTH: " );
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("GENDER: " );
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("MALE");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("FEMALE");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("E-MAIL ADDRESS: " );
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new  JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("MARITAL STATUS: " );
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married = new JRadioButton("MARRIED");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("UNMARRIED");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other = new JRadioButton("OTHER");
        other.setBounds(630,390,120,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        JLabel address = new JLabel("ADDRESS: " );
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new  JTextField();
        addressTextField.setFont(new Font("Railway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel district = new JLabel("DISTRICT: " );
        district.setFont(new Font("Railway",Font.BOLD,20));
        district.setBounds(100,490,200,30);
        add(district);
        
        districtTextField = new  JTextField();
        districtTextField.setFont(new Font("Railway",Font.BOLD,14));
        districtTextField.setBounds(300,490,400,30);
        add(districtTextField);
        
        JLabel division = new JLabel("DIVISION: " );
        division.setFont(new Font("Railway",Font.BOLD,20));
        division.setBounds(100,540,200,30);
        add(division);
        
        divisionTextField = new  JTextField();
        divisionTextField.setFont(new Font("Railway",Font.BOLD,14));
        divisionTextField.setBounds(300,540,400,30);
        add(divisionTextField);
        
        JLabel pincode= new JLabel("POST CODE: " );
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pinTextField = new  JTextField();
        pinTextField.setFont(new Font("Railway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
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
        String formno = "" + random ; //long
        String name = nameTextField.getText();//Set Text()
        String fname = fnameTextField.getText();
        String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        
        
        if(male.isSelected())
        {
            gender = "MALE";
        }
        else if(female.isSelected())
        {
            gender = "FEMALE";
        }
        
        String email = emailTextField.getText();
        
        String marital = null;
        if(married.isSelected())
        {
            marital = "MARRIED";
          
        }
        else if(unmarried.isSelected())
        {
            marital = "UNMARRIED";
        
        }
        else if(other.isSelected())
        {
            marital = "OTHER";
        
        }
        String address = addressTextField.getText();
        String district = districtTextField.getText();
        String division = divisionTextField.getText();
        String pin = pinTextField.getText();
        
        try
        {
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name is Required");
            
            }
            
            else if(fname.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Father's Name is Required");
            }
            else if(dob.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Date of Birth is Required");
            }
            
            
            else
            {
                Connect c = new Connect();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+district+"','"+division+"','"+pin+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }
        
    
    }
    
    public static void main(String args[])
    {
    new SignupOne();
    }
    
}
