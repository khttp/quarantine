package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class new_patient implements ActionListener {

    JTextField name, age;
    JButton submit;
    String Case, Name, gender;
    int Age;
    JRadioButton good, bad, serious, male, female;

    new_patient() {

//radio button
        good = new JRadioButton("good");
        bad = new JRadioButton("bad");
        serious = new JRadioButton("serious");
        male = new JRadioButton("male");
        female = new JRadioButton("female");
//text field
        name = new JTextField("");
        age = new JTextField("");

        JLabel label1 = new JLabel();
        label1.setBounds(10, 20, 80, 25);
        label1.setText("name");
        JLabel label2 = new JLabel();
        label2.setBounds(10, 60, 80, 25);
        label2.setText("age");
        name.setBounds(100, 20, 165, 25);
        age.setBounds(100, 60, 90, 25);

        JLabel label3 = new JLabel();
        label3.setText("case_state");
        label3.setBounds(10, 110, 80, 25);
        male.setBounds(200, 50, 100, 50);
        female.setBounds(300, 50, 100, 50);
        good.setBounds(100, 100, 100, 50);
        bad.setBounds(240, 100, 100, 50);
        serious.setBounds(380, 100, 100, 50);
        good.addActionListener(e-> Case="good");
        bad.addActionListener(e-> Case="bad");
        serious.addActionListener(e-> Case="serious");
        male.addActionListener(e-> gender="male");
        female.addActionListener(e-> gender="female");

        ButtonGroup group = new ButtonGroup();
        ButtonGroup group1 = new ButtonGroup();
        group.add(bad);
        group.add(good);
        group.add(serious);
        group1.add(male);
        group1.add(female);

//button
        submit = new JButton();
        submit.setText("submit");
        submit.addActionListener(this);
        submit.setBounds(100, 160, 100, 25);

//frame work
        JFrame frame = new JFrame();
        frame.setTitle("New Case");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(name);
        frame.add(age);
        frame.add(good);
        frame.add(bad);
        frame.add(serious);
        frame.add(submit);
        frame.add(male);
        frame.add(female);
        frame.setVisible(true);
        
         
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            Name = name.getText();
            Age = Integer.parseInt(age.getText());
        
           
               
            
            
        
        

    }

try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quarantine", "root", "spider");
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO patient( name , age,gender,patient_case) VALUES ('" + Name + "','" + Age + "','" + gender + "','" + Case + "');");
 System.out.println("xxxxxxxxx");
            con.close();
        } catch (SQLException r) {
            System.out.println("Connection Failed! Check output console");
    }
    }
}