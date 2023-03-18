import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.event.*;

class simple extends JFrame implements ActionListener {
    JTextField t;
    JCheckBox b1, b2, b3;
    ButtonGroup bg;

    simple() {
        setTitle("patti");
        setSize(200, 200);
        setLayout(null);
        setDefaultCloseOperation(3);

        t = new JTextField();
        t.setBounds(20, 20, 60, 20);
        add(t);
        b1 = new JCheckBox("+");
        b1.setBounds(20, 80, 40, 40);
        add(b1);
        b2 = new JCheckBox("-");
        b2.setBounds(80, 80, 40, 40);
        add(b2);
        b3 = new JCheckBox("*");
        b3.setBounds(140, 80, 40, 40);
        add(b3);
        bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

            t.setText("add");
        } else if (e.getSource() == b2) {

            t.setText("sub");
        } else {

            t.setText("mul");
        }
    }

    public static void main(String arg[]) {
        simple s = new simple();
        s.setVisible(true);
    }
}