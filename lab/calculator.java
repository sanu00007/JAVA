import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.multi.MultiButtonUI;
import java.util.*;

import java.awt.event.*;

class calculator extends JFrame implements ActionListener {
  JTextField t;
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, bclr, beq, bdec;
  double a, b, result;
  int operation;

  calculator() {
    setTitle("           calculator");
    setSize(410, 550);
    t = new JTextField();
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");
    badd = new JButton("+");
    bsub = new JButton("-");
    bmul = new JButton("x");
    bdiv = new JButton("/");
    bdec = new JButton(".");
    bclr = new JButton("clear");
    beq = new JButton("=");
    t.setBounds(30, 35, 340, 55);
    add(t);
    b1.setBounds(30, 110, 70, 70);
    b2.setBounds(120, 110, 70, 70);
    b3.setBounds(210, 110, 70, 70);
    badd.setBounds(300, 110, 70, 70);
    add(b1);
    add(b2);
    add(b3);
    add(badd);
    b4.setBounds(30, 200, 70, 70);
    b5.setBounds(120, 200, 70, 70);
    b6.setBounds(210, 200, 70, 70);
    bsub.setBounds(300, 200, 70, 70);
    add(b4);
    add(b5);
    add(b6);
    add(bsub);
    b7.setBounds(30, 290, 70, 70);
    b8.setBounds(120, 290, 70, 70);
    b9.setBounds(210, 290, 70, 70);
    bmul.setBounds(300, 290, 70, 70);
    add(b7);
    add(b8);
    add(b9);
    add(bmul);
    b0.setBounds(120, 380, 70, 70);
    bdec.setBounds(30, 380, 70, 70);
    bdiv.setBounds(210, 380, 70, 70);
    beq.setBounds(300, 380, 70, 70);
    beq.setBackground(Color.LIGHT_GRAY);
    add(b0);
    add(bdec);
    add(bdiv);
    add(beq);
    setLayout(null);
    bclr.setBounds(30, 470, 340, 35);
    add(bclr);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmul.addActionListener(this);
    bdec.addActionListener(this);
    bdiv.addActionListener(this);
    beq.addActionListener(this);
    bclr.addActionListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      t.setText(t.getText().concat("1"));

    }
    if (e.getSource() == b2) {
      t.setText(t.getText().concat("2"));

    }
    if (e.getSource() == b3) {
      t.setText(t.getText().concat("3"));

    }
    if (e.getSource() == b4) {
      t.setText(t.getText().concat("4"));

    }
    if (e.getSource() == b5) {
      t.setText(t.getText().concat("5"));

    }
    if (e.getSource() == b6) {
      t.setText(t.getText().concat("6"));

    }
    if (e.getSource() == b7) {
      t.setText(t.getText().concat("7"));

    }
    if (e.getSource() == b8) {
      t.setText(t.getText().concat("8"));

    }
    if (e.getSource() == b9) {
      t.setText(t.getText().concat("9"));

    }
    if (e.getSource() == b0) {
      t.setText(t.getText().concat("0"));

    }
    if (e.getSource() == bclr) {
      t.setText("");
    }
    if (e.getSource() == bdec) {
      t.setText(t.getText().concat("."));

    }
    if (e.getSource() == badd) {
      a = Double.parseDouble(t.getText());
      operation = 1;
      t.setText("");

    }
    if (e.getSource() == bsub) {
      a = Double.parseDouble(t.getText());
      operation = 2;
      t.setText("");

    }
    if (e.getSource() == bmul) {
      a = Double.parseDouble(t.getText());
      operation = 3;
      t.setText("");

    }
    if (e.getSource() == bdiv) {
      a = Double.parseDouble(t.getText());
      operation = 4;
      t.setText("");

    }
    if (e.getSource() == beq) {
      b = Double.parseDouble(t.getText());
      if (operation == 1) {
        result = a + b;
      }
      if (operation == 2) {
        result = a - b;
      }
      if (operation == 3) {
        result = a * b;
      }
      if (operation == 4) {
        try {
          result = a / b;
        } catch (ArithmeticException o) {
          t.setText("Math error");
        }
      }
      t.setText(" " + result);
    }

  }

  public static void main(String arg[]) {
    calculator c = new calculator();
    c.setVisible(true);

  }

}
