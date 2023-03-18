import java.awt.*;

import javax.swing.plaf.PanelUI;

class sanu extends Frame {
    public static void main(String arg[]) {

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();

        p1.setBackground(Color.ORANGE);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.CYAN);

        Button b1 = new Button("PLAY");
        Button b2 = new Button("CONTROL");
        Button b3 = new Button("EXIT");

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        Choice c = new Choice();
        c.add("ONLINE");
        c.add("OFFLINE");
        c.add("FRIENDLY");
        c.add("PRACTICE");
        c.add("RANDOM");
        List t = new List();
        t.add("ONLINE");
        t.add("OFFLINE");
        t.add("FRIENDLY");
        t.add("PRACTICE");
        t.add("RANDOM");

        CheckboxGroup cg = new CheckboxGroup();

        Checkbox c1 = new Checkbox("satisfied", cg, true);
        Checkbox c2 = new Checkbox("not satisfied", false);
        p3.add(c);
        Frame f = new Frame();
        f.setLayout(new BorderLayout());
        f.setTitle("pubg");
        f.setSize(500, 500);
        f.add(p1, "North");
        f.add(p2, "South");
        f.add(c, "West");
        f.add(t, "East");
        // f.add(c2, "East");
        // f.add(p3, "West");
        f.setVisible(true);
    }

}