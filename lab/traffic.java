
import java.awt.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.*;

public class traffic extends JFrame implements ItemListener {

    JRadioButton r1;

    JRadioButton r2;

    JRadioButton r3;

    JTextField t;

    ButtonGroup b;

    String msg = " ";

    int x = 0, y = 0, z = 0;

    public traffic(String msg)

    {

        super(msg);

        setLayout(new FlowLayout());

        r1 = new JRadioButton("RED");

        r2 = new JRadioButton("YELLOW");

        r3 = new JRadioButton("GREEN");

        t = new JTextField(10);

        b = new ButtonGroup();

        r1.addItemListener(this);

        r2.addItemListener(this);

        r3.addItemListener(this);

        add(r1);

        add(r2);

        add(r3);

        b.add(r1);

        b.add(r2);

        b.add(r3);

        add(t);

    }

    public void itemStateChanged(ItemEvent ie)

    {

        if (ie.getSource() == r1) {

            if (ie.getStateChange() == 1) {

                msg = "Stop!!";

                x = 1;

                repaint();

            }

            else {

                msg = "";

            }

        }

        if (ie.getSource() == r2) {

            if (ie.getStateChange() == 1) {

                msg = "Ready!";

                y = 1;

                repaint();

            }

            else {

                msg = "";

            }

        }

        if (ie.getSource() == r3) {

            if (ie.getStateChange() == 1) {

                msg = "Go!";

                z = 1;

                repaint();

            }

            else {

                msg = "";

            }

        }

        t.setText(msg);

    }

    public void paint(Graphics g)

    {

        g.drawRect(100, 100, 100, 260);

        g.drawOval(120, 120, 60, 60);

        g.drawOval(120, 200, 60, 60);

        g.drawOval(120, 280, 60, 60);

        if (x == 1) {

            g.setColor(Color.RED);

            g.fillOval(120, 120, 60, 60);

            g.setColor(Color.WHITE);

            g.fillOval(120, 200, 60, 60);

            g.setColor(Color.WHITE);

            g.fillOval(120, 280, 60, 60);

            x = 0;

        }

        if (y == 1) {

            g.setColor(Color.WHITE);

            g.fillOval(120, 120, 60, 60);

            g.setColor(Color.YELLOW);

            g.fillOval(120, 200, 60, 60);

            g.setColor(Color.WHITE);

            g.fillOval(120, 280, 60, 60);

            y = 0;

        }

        if (z == 1) {

            g.setColor(Color.WHITE);

            g.fillOval(120, 120, 60, 60);

            g.setColor(Color.WHITE);

            g.fillOval(120, 200, 60, 60);

            g.setColor(Color.GREEN);

            g.fillOval(120, 280, 60, 60);

            z = 0;

        }

    }

    public static void main(String args[])

    {

        traffic jf = new traffic("Traffic Light");

        jf.setSize(500, 500);

        jf.setVisible(true);

    }
}