import javax.swing.*;
import java.awt.*;

public class Launcher_ColorEditor {
    public static void main(String args[]) {
        Color colors[] = {Color.RED,Color.BLUE,Color.BLACK,Color.WHITE};
        JFrame f= new JFrame("Editor color ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         final JComboBox comboBox = new JComboBox(colors);
         comboBox.setEditable(true);
         comboBox.setEditor(new JCombo_ColorEditor(Color.RED));
         f.add(comboBox,BorderLayout.NORTH);
         f.setSize(300,300);
         f.setVisible(true);
    }
}
