/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author abdo
 */
public class recovered {
    recovered(){
        JLabel label = new JLabel();
        label.setText("the number of recoveed patients till now is : ");
        label.setBounds(10,100,400,50);
        String[] coulmbsName ={"dead_counter"};
          Object[][] data={{"100"}} ;
        JTextField field = new JTextField();
    field.setBounds(300, 100, 100,50 );
    field.setText("100");
    
  

        JFrame frame = new JFrame();
    frame.setTitle("recovery");
   
    frame.setSize(500, 500);
    frame.add(label);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.add (field);
    }
    
}
