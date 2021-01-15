package test;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class query implements ActionListener {
    PreparedStatement pst;
    String jj[] = {" patient_id ", " name " + " age  ", " patient_case", "gender", " Room Number", " time_entered"};
    String NAME;
    JTextField name ,Name,Age,Gender,Case;
    JButton search;
    JTable table;
    String[][] data = new String[2][7];
    JPanel panel;

    String[] data2 = new String[7];

    query() {

//radio button
//text field
        name = new JTextField("");

        JLabel label1 = new JLabel();
        label1.setBounds(10, 60, 80, 25);
        label1.setText("name");
        name.setBounds(100, 60, 165, 25);
        JLabel label3 = new JLabel();
        label3.setText("please enter the name and the age of the patient u wanna search for!!");
        label3.setBounds(10, 20, 500, 25);

//button
        search = new JButton();
        search.setText("search");
        search.addActionListener(this);
        search.setBounds(100, 100, 100, 25);

   Name = new JTextField();
   Name.setBounds(100,200,200,25);
   
    Age = new JTextField();
   Age.setBounds(100,260,50,25);
   
    Gender = new JTextField();
   Gender.setBounds(100,320,100,25);
   
   Case = new JTextField();
   Case.setBounds(100,380,100,25);
         
   JLabel label2 = new JLabel();
        label2.setBounds(10, 200, 80, 25);
        label2.setText("Name");
    JLabel label4 = new JLabel();
        label4.setBounds(10, 260, 80, 25);
        label4.setText("Age");
    JLabel label = new JLabel();
        label.setBounds(10, 320, 80, 25);
        label.setText("gender");
    JLabel label5 = new JLabel();
        label5.setBounds(10, 380, 80, 25);
        label5.setText("case");    
        
//frame work
        JFrame frame = new JFrame();
        frame.setTitle("Query");
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(name);
        frame.add(search);
        frame.add(Name);
        frame.add(Age);
        frame.add(Case);
        frame.add(Gender);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
          NAME=name.getText();
try {
String n = null,a = null,c = null,g = null;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quarantine", "root", "spider");
          pst=con.prepareStatement("select name,age,patient_case,gender from patient where name =?;");
                
                System.out.println("conn");
               pst.setString(1, NAME);
               System.out.println("conn");
               ResultSet show = pst.executeQuery();
              
                System.out.println("conn");
           while(show.next()){
           n=show.getString("name");
            a=show.getString("age");
             g=show.getString("gender");
              c=show.getString("patient_case");
                    
           }
           Name.setText(n);
            Age.setText(a);
            Case.setText(c);
            Gender.setText(g);
            
            con.close();
           


        } catch (SQLException r) {
            System.out.println("Connection Failed! Check output console");
        }

        }

    }
}
