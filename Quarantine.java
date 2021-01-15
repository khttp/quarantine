package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quarantine extends JFrame implements ActionListener{
    
    JButton doctor = new JButton();
    JButton patient= new JButton();
    JButton new_patient= new JButton();
    JButton dead_patient= new JButton();
    JButton staff = new JButton();
    JButton query = new JButton();
    JButton recovered =new JButton();
 Quarantine() {

   JPanel panel = new JPanel();
   panel.setBounds(0,0,200,500);
   panel.setBackground(Color.white);
           
//button work 
recovered.setText("recovered");
query.setText("query");
staff.setText("staff");
doctor.setText("doctors");
patient.setText("patients");
dead_patient.setText("dead_patients");
new_patient.setText("new_patients");
doctor.setBounds       (50, 100,200,50);
patient.setBounds      (50, 150,200,50);
new_patient.setBounds  (50, 200,200,50);
dead_patient.setBounds (50, 250,200,50);
staff.setBounds       (50, 300,200,50);
query.setBounds        (50, 350,200,50);
recovered.setBounds    (50,400,200,50);
query.addActionListener(this);
staff.addActionListener(this);
doctor.addActionListener(this);
patient.addActionListener(this);
dead_patient.addActionListener(this);
new_patient.addActionListener(this);
recovered.addActionListener(this);
query.setFocusable(false);
staff.setFocusable(false);
patient.setFocusable(false);
new_patient.setFocusable(false);
dead_patient.setFocusable(false);
doctor.setFocusable(false);
recovered.setFocusable(false);

        

//label work
JLabel label=new JLabel();  
label.setText("here we can help u get better") ;
ImageIcon image = new ImageIcon("C:\\Users\\tweety\\Documents\\NetBeansProjects\\test\\src\\test/logo.png");
label.setIcon(image);
label.setHorizontalTextPosition(JLabel.CENTER);
label.setVerticalTextPosition(JLabel.BOTTOM);
label.setVerticalAlignment(JLabel.CENTER);
label.setHorizontalAlignment(JLabel.LEFT);





//frame work
this.setSize(750, 550);
//this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
this.setUndecorated(false);




//frame title
this.setTitle("quarantine");

//that makes the program to stop after closing the program
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//prevent the change of size 
//i dont want thet so..
this.setResizable(true);//if u want it unchangeable set it to false


//
ImageIcon lam = new ImageIcon("C:\\Users\\tweety\\Documents\\NetBeansProjects\\test\\src\\test/logo.png");     
this.setIconImage(lam.getImage());
this.getContentPane().setBackground(Color.white);//background color
this.add(label,BorderLayout.EAST);
this.add(doctor);
this.add(patient);
this.add(new_patient);
this.add(dead_patient);
this.add(staff);
this.add(query);
this.add(recovered);
this.add(panel);



        


        


// making the frame visable
this.setVisible(true);

    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
      if(e.getSource()== new_patient) {
          
           {
            new new_patient();
          } 
          
        
      } else if(e.getSource()== query) {
          new query();
          
        }else if (e.getSource()==dead_patient){
            new dead();
        }
      
      else if(e.getSource()==doctor){
          new doctor();
      }else if (e.getSource()==patient){
           new patients();
      }     else if (e.getSource()==staff){
          new staff();
           
      }
       else if (e.getSource()==recovered){
           new recovered();
    }

}
}
