import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolBar_CheckBox extends JFrame {
    public static void main(String[] args) {
        JToolBar_CheckBox that = new JToolBar_CheckBox();
        that.setVisible(true);
    }

    public JToolBar_CheckBox() {
        setSize(450, 350);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new ToolbarPanel(), BorderLayout.SOUTH);
    }
}

class ToolbarPanel extends JPanel {

    public ToolbarPanel() {
        setLayout(new BorderLayout());
        JToolBar toolbar = new JToolBar();
        for (int i = 1; i < 4; i++) {
            JCheckBox cbox = new JCheckBox("Checkbox #" + i);
            toolbar.add(cbox);
            cbox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JCheckBox source = (JCheckBox) (e.getSource());
                    System.out.println("Toolbar " + source.getText());
                }
            });
        }

        add(toolbar, BorderLayout.NORTH);
    }
}
