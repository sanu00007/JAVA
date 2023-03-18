import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class traffic_light extends JPanel implements ActionListener {
    JFrame frame;
    JRadioButton rb1, rb2, rb3;
    Box box;
    JTextField tf = new JTextField("click one", 10);
    ButtonGroup bg = new ButtonGroup();
    String str = "0";
    int r = 0, y = 0, g = 0;

    /*
     * public traffic_light()
     * {
     * super("trffic light");
     * }
     */
    public void start() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        rb1 = new JRadioButton("red");
        rb2 = new JRadioButton("yellow");
        rb3 = new JRadioButton("green");

        add(rb1);
        add(rb2);
        add(rb3);

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        add(tf);

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.add(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rb1) {
            str = "stop!";
            paint(getGraphics());
        }
        if (e.getSource() == rb2) {
            str = "ready!!!";
            paint(getGraphics());
        }
        if (e.getSource() == rb3) {
            str = "Go!";
            paint(getGraphics());
        }
        tf.setText(str);

    }

    public void paintComponent(Graphics g) {
        Graphics2D r2d = (Graphics2D) g;
        r2d.setColor(Color.BLACK);
        r2d.fillRect(115, 100, 50, 50);
        r2d.fillRect(115, 155, 50, 50);
        r2d.fillRect(115, 210, 50, 50);
        r2d.setColor(Color.BLACK);
        r2d.drawRect(115, 100, 50, 50);
        r2d.drawRect(115, 155, 50, 50);
        r2d.drawRect(115, 210, 50, 50);

        if (str == "stop!") {
            r2d.setColor(Color.RED);
            r2d.fillRect(115, 100, 50, 50);
        }
        if (str == "ready!!!") {
            r2d.setColor(Color.YELLOW);
            r2d.fillRect(115, 155, 50, 50);
        }
        if (str == "Go!") {
            r2d.setColor(Color.GREEN);
            r2d.fillRect(115, 210, 50, 50);
        }

    }

    public static void main(String args[]) {
        traffic_light tl = new traffic_light();
        tl.start();
    }
}