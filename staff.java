/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author abdo
 */
public class staff {

    JTable table;
  String[][] data=new String[10][5];

    staff() {
        JLabel label = new JLabel();
        label.setText("the patients in this quarantine : ");
        label.setBounds(10, 20, 400, 50);

        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quarantine", "root", "spider");

            Statement stmt = con.createStatement();
           
            ResultSet show = stmt.executeQuery("select * from nurses;");

            
            int i = 0;
            while (show.next()) {
                for (int j = 0; j<4; j++) {
                    //System.out.print(rs.getString(j+1));
                    data[i][j] = show.getString(j + 1);
                }
                i ++;
            }

            con.close();

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
        }

        JPanel panel = new JPanel(new GridLayout());
String  jj[] = {"id","name","salary","first_day"};
        JScrollPane scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(100, 500));
        scroll.setPreferredSize(new Dimension(100, 500));
        table = new JTable(data, jj);
        table.setBounds(10, 100, 500, 100);
        table.setFocusable(false);
        table.setFillsViewportHeight(false);
        table.add(scroll);
        panel.setBounds(9, 99, 500, 110);
        panel.add(new JScrollPane(table));
        JScrollPane pane = new JScrollPane(panel);

        JFrame frame = new JFrame();
        frame.setTitle("staff");
        frame.setSize(600, 500);
        frame.add(label);
        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
