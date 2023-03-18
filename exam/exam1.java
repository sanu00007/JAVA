import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class registeration extends JFrame implements ActionListener {
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    FileWriter pw;
    JButton b1;

    JTextField t1;
    JTextField t2;
    JTextField t3;

    JRadioButton r1;
    JRadioButton r2;
    ButtonGroup bg = new ButtonGroup();

    JComboBox c1;

    registeration() {
        setSize(240, 385);
        setTitle("student registration");
        setLayout(null);
        setDefaultCloseOperation(3);
        l1 = new JLabel("NAME");
        l2 = new JLabel("AGE");
        l3 = new JLabel("ROLL_NO");
        b1 = new JButton("SUBMIT");
        l4 = new JLabel("GENDER");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        l1.setBounds(20, 20, 100, 40);
        t1.setBounds(120, 20, 100, 40);
        add(l1);
        add(t1);

        l2.setBounds(20, 70, 100, 40);
        t2.setBounds(120, 70, 100, 40);
        add(l2);
        add(t2);

        l3.setBounds(20, 120, 100, 40);
        t3.setBounds(120, 120, 100, 40);
        add(l3);
        add(t3);
        l4.setBounds(20, 170, 100, 40);
        add(l4);
        r1 = new JRadioButton("MALE");
        r2 = new JRadioButton("FEMALE");
        r1.setBounds(100, 170, 50, 50);
        r2.setBounds(170, 170, 50, 50);
        add(r1);
        add(r2);
        bg.add(r1);
        bg.add(r2);

        b1.setBounds(60, 300, 80, 35);
        add(b1);
        b1.addActionListener(this);
        String list[] = { "CSE", "ECE", "EEE", "CHEM", "ARCH" };
        c1 = new JComboBox<>(list);
        c1.setBounds(120, 250, 80, 40);
        add(c1);
        l5 = new JLabel("DEPARTMENT");
        l5.setBounds(20, 250, 100, 40);
        add(l5);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1) {
                pw = new FileWriter("student.txt", true);

                pw.write("\nNAME:" + t1.getText());
                pw.write("\nAGE:" + t2.getText());
                pw.write("\nROLL_NO:" + t3.getText());

                pw.flush();
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
            if (r1.isSelected()) {
                String gender = "male";
                pw.write("\nGENDER:" + gender);
                pw.write("\n");
                pw.flush();
                r1.setText("");

            } else {
                String gender = "female";
                pw.write("\nGENDER:" + gender);
                pw.write("\n");
                pw.flush();
                r2.setText("");
            }
            String department;
            department = (String) c1.getSelectedItem();
            pw.write("DEPARTMENT:" + department);
            pw.write("\n");
            pw.flush();
            pw.close();

        } catch (Exception o) {
            System.out.println(o);
        }

    }

    public static void main(String arg[]) throws Exception {
        registeration r = new registeration();
        r.setVisible(true);
    }
}