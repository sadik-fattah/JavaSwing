import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JToolBar_Various_Buttons {
    public static void main(String[] argv) throws Exception {
        JToolBar toolbar = new JToolBar();
        ImageIcon icon = new ImageIcon("icon.gif");
        Action action = new AbstractAction("Button Label", icon) {
            public void actionPerformed(ActionEvent evt) {
            }
        };

        JButton c1 = new JButton(action);
        c1.setText(null);
        c1.setMargin(new Insets(0, 0, 0, 0));
        toolbar.add(c1);

        JToggleButton c2 = new JToggleButton(action);
        c2.setText(null);
        c2.setMargin(new Insets(0, 0, 0, 0));
        toolbar.add(c2);

        JComboBox c3 = new JComboBox(new String[] { "A", "B", "C" });
        c3.setPrototypeDisplayValue("XXXXXXXX"); // Set a desired width
        c3.setMaximumSize(c3.getMinimumSize());
        toolbar.add(c3);
    }
}
