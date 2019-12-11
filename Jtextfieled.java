
package jtextfieled;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jtextfieled {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame("JText Field ");
        JPanel panel=new JPanel();
        frame.setBounds(400, 350, 350, 350);
        JTextField textfield=new JTextField( 10);
        textfield.setSize( 30, 20);
        textfield.setForeground(Color.blue);                        //اللون الخاص بالخط
        textfield.setFont(new Font("tahoma", 1 , 18));
        textfield.setBackground(new Color(255,140,140));            //نوع الخط وحجمه ولونه
        panel.add(textfield);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
    
}
