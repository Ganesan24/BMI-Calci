import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class BMI extends JFrame implements ActionListener {
    JPanel p2 = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p3 = new JPanel();
    JLabel l1 = new JLabel("BODY MASS INDEX");
    JLabel l2 = new JLabel("AGE");
    JLabel l3 = new JLabel("HEIGHT (cm)");
    JLabel l4 = new JLabel("WEIGHT (kg)");
    JLabel l5 = new JLabel("BMI value:");
    JTextField f1 = new JTextField();
    JTextField f2 = new JTextField();
    JTextField f3 = new JTextField();
    JLabel result = new JLabel();
    JButton b = new JButton("Click here");
    JLabel footer = new JLabel();
    ImageIcon icon = new ImageIcon("src/images/bmichart.png");

    // ----------------------------------------------------
    BMI() {
        setSize(500, 500);
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.red);
        p2.setBackground(Color.lightGray);
        p1.add(l1);
        p2.add(l2);
        p2.add(l3);
        p2.add(l4);
        p2.add(l5);
        p2.setLayout(new GridLayout(2, 2));
        p2.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        p3.setPreferredSize(new Dimension(500, 120));
        p1.setPreferredSize(new Dimension(500, 100));
        l1.setFont(new Font("Calibri", Font.ITALIC, 25));
        p2.add(f1);
        p2.add(f2);
        p2.add(f3);
        p2.add(result);
        f1.setFont(new Font("", Font.BOLD, 30));
        f2.setFont(new Font("", Font.BOLD, 30));
        f3.setFont(new Font("", Font.BOLD, 30));
        p3.add(b, BorderLayout.CENTER);
        b.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    // ---------------------------------------------
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            float age = Float.parseFloat(f1.getText());
            float height = Float.parseFloat(f2.getText()) / 100;
            float weight = Float.parseFloat(f3.getText());
            float bmivalue = weight / (height * height);
            result.setText("bmi value: " + bmivalue);
            p3.add(footer);
            footer.setPreferredSize(new Dimension(500, 120));
            footer.setIcon(icon);
            b.setVisible(false);

        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        new BMI();
    }
}
