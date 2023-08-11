import javax.swing.*;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JColorChooser_Listening {
    public static void main(String args[]) {
        JFrame frame = new JFrame("JColorChooser Popup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel("www.guercifzone-ar.blogspot.com", JLabel.CENTER);
        label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 48));

        frame.add(label, BorderLayout.SOUTH);

        final JColorChooser colorChooser = new JColorChooser(label.getBackground());

        ColorSelectionModel model = colorChooser.getSelectionModel();
        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent changeEvent) {
                Color newForegroundColor = colorChooser.getColor();
                label.setForeground(newForegroundColor);
            }
        };
        model.addChangeListener(changeListener);

        frame.add(colorChooser, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
