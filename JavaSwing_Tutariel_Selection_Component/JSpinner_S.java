import javax.swing.*;
import javax.swing.event.*;
class JSpinner_S extends JFrame{

}
/*
class JSpinner_S extends JFrame implements ChangeListener {/*
    // frame
    static JFrame f;

    // label
    static JLabel l, l1;

    // spinner
    static JSpinner_S s, s1, s2;

    // default constructor
    JSpinner_S()
    {
    }

    // main class
    public static void main(String[] args)
    {
        // create an object of the class
        JSpinner_S sp1 = new JSpinner_S();

        // create  a new frame
        f = new JFrame("spinner");

        // create a label
        l = new JLabel("select your date of birth");
        l1 = new JLabel("1 January 2000");

        // create a JSpinner with a minimum, maximum and step value
        s = new JSpinner_S();
        s1 = new JSpinner_S(new SpinnerNumberModel(1, 1, 31, 1));

        // setvalue of year
        s.setValue(2000);

        // store the months
        String months[] = { "January", "February", "March",
                "April", "May", "June", "July", "August",
                "September", "October", "Novemeber", "December" };

        // create a JSpinner with list values
        s2 = new JSpinner_S(new SpinnerListModel(months));

        // add change listener to spinner
        s.addChangeListener(sp1);
        s1.addChangeListener(sp1);
        s2.addChangeListener(sp1);

        // set Bounds for spinner
        s.setBounds(70, 70, 50, 40);
        s1.setBounds(70, 130, 50, 40);
        s2.setBounds(70, 200, 90, 40);

        // setbounds for label
        l.setBounds(10, 10, 150, 20);
        l1.setBounds(10, 300, 150, 20);

        // set layout for frame
        f.setLayout(null);

        // add label
        f.add(l);
        f.add(l1);
        f.add(s);
        f.add(s1);
        f.add(s2);

        // add panel to frame
        f.add(s);

        // set frame size
        f.setSize(400, 400);

        f.show();
    }

    // if the state is changed
    public void stateChanged(ChangeEvent e)
    {
        l1.setText(s1.getValue() + " " + s2.getValue() + " " + s.getValue());
    }
}*/