package LambdaFunction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame=new JFrame("MyWindow");
        frame.setSize(233,448);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton button=new JButton("click me !");
        frame.add(button);
        //addActionLister is a functional interface ,only 1 abstract method ,so the instance
        // can be created using annonymous class impl /through Lamda also

      /*  button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(null,"Hey button clicked");
            }
        });*/

        button.addActionListener((ActionEvent e)->{
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null,"Hey Button Clicked");
        });

    }
}
