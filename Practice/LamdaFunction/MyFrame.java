package Practice.LamdaFunction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame("MyFrame");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,300);
        //changing the layout of jFrame from BorderLayout to FlowLayout ;
        // because BorderLayout is been used as default for JFrame becaus of which multiple components we cant add
        //we cant add 2 buttons in Jframe without changing the layout.
            frame.setLayout(new FlowLayout());
        JButton button=new JButton("Click Me");
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"The button is clicked");
            }
        });

        JButton button1=new JButton("Want to make your day ?");
        frame.add(button1);
        button1.addActionListener((ActionEvent a)->{
            JOptionPane.showMessageDialog(frame,"Have a good Day !");
        });
    }
}
