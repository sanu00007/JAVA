import java.io.*;
import java.awt.event.*;
import javax.swing.*;

class NegativeValueException extends Exception {
    NegativeValueException(String msg) {
        super(msg);

    }

}

class Employee {
    String Emp_name;
    String Emp_id;
    String Address;
    long Mobile_no;

    Employee(String Emp_name, String Emp_id, String Address, long Mobile_no) {
        this.Emp_name = Emp_name;
        this.Emp_id = Emp_id;
        this.Address = Address;
        this.Mobile_no = Mobile_no;

    }

}

class AssociateProfessor extends Employee {
    double BP;
    double DA;
    double HRA;
    double PF;
    double fund;
    String Designation;

    AssociateProfessor(String Emp_name, String Emp_id, String Address, long Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mobile_no);
        this.BP = BP;

    }
}

class Professor extends Employee {
    double BP;
    double DA;
    double HRA;
    double PF;
    double fund;
    String Designation;

    Professor(String Emp_name, String Emp_id, String Address, long Mobile_no, double BP) {
        super(Emp_name, Emp_id, Address, Mobile_no);
        this.BP = BP;
    }
}

class problem extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2;

    problem() {
        setSize(400, 350);
        setTitle("details");
        setLayout(null);
        setDefaultCloseOperation(3);
        l1 = new JLabel("EMPLOYEE NAME");
        t1 = new JTextField();

        l1.setBounds(10, 10, 90, 40);
        t1.setBounds(110, 10, 90, 40);

        add(l1);
        add(t1);

        l2 = new JLabel("EMPLOYEE ID");
        t2 = new JTextField();

        l2.setBounds(10, 60, 90, 40);
        t2.setBounds(110, 60, 90, 40);

        add(l2);
        add(t2);

        l3 = new JLabel("ADDRESS");
        t3 = new JTextField();

        l3.setBounds(10, 110, 90, 40);
        t3.setBounds(110, 110, 90, 40);

        add(l3);
        add(t3);

        l4 = new JLabel("MOBILE");
        t4 = new JTextField();

        l4.setBounds(10, 160, 90, 40);
        t4.setBounds(110, 160, 90, 40);

        add(l4);
        add(t4);

        l5 = new JLabel("BASIC PAY");
        t5 = new JTextField();

        l5.setBounds(10, 210, 90, 40);
        t5.setBounds(110, 210, 90, 40);

        add(l5);
        add(t5);

        b1 = new JButton("PRO");
        b1.setBounds(40, 260, 100, 30);
        add(b1);

        b2 = new JButton("ASSOCIATEPROFESSOR");
        b2.setBounds(200, 260, 100, 30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        try {
            FileWriter pw = new FileWriter("file1.txt", true);
            if (e.getSource() == b1) {
                Professor P = new Professor(t1.getText(), t2.getText(), t3.getText(), Long.parseLong(t4.getText()),
                        Double.parseDouble(t5.getText()));
                if (Double.parseDouble(t5.getText()) < 0) {
                    try {
                        pw.close();
                        throw new NegativeValueException("BASIC PAY IS NEGATIVE");

                    } catch (NegativeValueException N) {
                        System.out.println(N);

                    }
                }

                P.DA = 0.97 * Double.parseDouble(t5.getText());
                P.HRA = 0.01 * Double.parseDouble(t5.getText());
                pw.write("\nNAME:" + P.Emp_name + "\n");
                pw.write("ID:" + P.Emp_id + "\n");
                pw.write("ADDRESS:" + P.Address + "\n");
                pw.write("NUMBER:" + P.Mobile_no + "\n");
                pw.write("DESIGNATION:professor\n");
                pw.write("BASIC PAY:" + P.BP + "\n");
                pw.write("DA:" + P.DA);
                pw.write("\nHRA:" + P.HRA + "\n");
                pw.flush();
                pw.close();
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");

            }
            if (e.getSource() == b2) {
                AssociateProfessor a = new AssociateProfessor(t1.getText(), t2.getText(), t3.getText(),
                        Long.parseLong(t4.getText()), Double.parseDouble(t5.getText()));
                if (Double.parseDouble(t5.getText()) < 0) {
                    try {
                        pw.close();
                        throw new NegativeValueException("BASIC PAY IS NEGATIVE");

                    } catch (NegativeValueException N) {
                        System.out.println(N);

                    }
                }
                a.DA = 0.95 * Double.parseDouble(t5.getText());
                a.HRA = 0.012 * Double.parseDouble(t5.getText());
                pw.write("NAME:" + a.Emp_name + "\n");
                pw.write("ID:" + a.Emp_id + "\n");
                pw.write("ADDRESS:" + a.Address + "\n");
                pw.write("NUMBER:" + a.Mobile_no + "\n");
                pw.write("DESIGNATION:ASSOCIATIVE\n");
                pw.write("BASIC PAY:" + a.BP + "\n");
                pw.write("DA:" + a.DA);
                pw.write("\nHRA:" + a.HRA + "\n");
                pw.flush();
                pw.close();
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");

            }

        } catch (Exception D) {
            System.out.println(D);
        }

    }

    public static void main(String arg[]) {
        problem f = new problem();
        f.setVisible(true);

    }

}