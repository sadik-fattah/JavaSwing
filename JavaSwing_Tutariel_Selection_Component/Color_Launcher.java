import javax.swing.*;
import java.awt.*;

public class Color_Launcher {
    public static void main(String args[]) {
        Color colors[] = {Color.RED, Color.BLUE, Color.BLACK, Color.WHITE};
        JFrame frame = new JFrame("Editable JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JComboBox comboBox = new JComboBox(colors);
        comboBox.setEditable(true);
        comboBox.setEditor(new JComboBox_ColorEditor(Color.RED));
        frame.add(comboBox, BorderLayout.NORTH);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
