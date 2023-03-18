import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Calculator extends Frame implements ActionListener {
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;

    JLabel l1;
    JLabel l2;
    JLabel l3;

    JTextField t1;
    JTextField t2;
    JTextField t3;

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;

    Calculator() {
        setTitle("CALCULATOR");
        setSize(900, 700);
        setLayout(new GridLayout(6, 2,10,0));
        setAlwaysOnTop(isAlwaysOnTop());
        l1 = new JLabel("FIRST DIGIT");
        l2 = new JLabel("SECOND DIGIT");
        l3 = new JLabel("RESULT");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(15);

        b1 = new JButton("+");
        b2 = new JButton("*");
        b3 = new JButton("-");
        b4 = new JButton("/");
        b5 = new JButton("%");
        b6 = new JButton("clear");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        add(l3);
        add(t3);

    }

    public void actionPerformed(ActionEvent e) {

        String a = t1.getText();
        String b = t2.getText();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        if (e.getSource() == b1) {
            int result = x + y;
            t3.setText(" " + result);

        } else if (e.getSource() == b2) {
            int result = x * y;
            t3.setText(" " + result);

        } else if (e.getSource() == b3) {
            int result = x - y;
            t3.setText(" " + result);

        } else if (e.getSource() == b4) {
            double result = (double) x / y;
            t3.setText(" " + result);

        } else if (e.getSource() == b5) {
            int result = x % y;
            t3.setText(" " + result);

        } else if (e.getSource() == b6) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String arg[]) {
        Calculator c = new Calculator();
        c.setVisible(true);

    }
}