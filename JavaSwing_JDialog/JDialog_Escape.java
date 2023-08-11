import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class JDialogEscape extends JDialog {
    public JDialogEscape() {
        super((Frame) null, false);
    }

    protected JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        Action actionListener = new AbstractAction() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("about to disappear");
                setVisible(false);
            }
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", actionListener);

        return rootPane;
    }

}

public class JDialog_Escape {
    public static void main(String[] a) {
        JDialogEscape dlg = new JDialogEscape();
        dlg.add(new JButton("asdf"));
        dlg.setSize(300, 100);
        dlg.setVisible(true);
    }
}