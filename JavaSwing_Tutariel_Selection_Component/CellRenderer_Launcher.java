import javax.swing.*;
import java.awt.*;

public class CellRenderer_Launcher {
    public static void main(String args[]) {
        Object elements[][] = {
                {new Font("Helvetica", Font.PLAIN, 20), Color.RED, new MyIcon(), "A"},
                {new Font("TimesRoman", Font.BOLD, 14), Color.BLUE, new MyIcon(), "A"},
                {new Font("Courier", Font.ITALIC, 18), Color.GREEN, new MyIcon(), "A"},
                {new Font("Helvetica", Font.BOLD | Font.ITALIC, 12), Color.GRAY, new MyIcon(), "A"},
                {new Font("TimesRoman", Font.PLAIN, 32), Color.PINK, new MyIcon(), "A"},
                {new Font("Courier", Font.BOLD, 16), Color.YELLOW, new MyIcon(), "A"},
                {new Font("Helvetica", Font.ITALIC, 8), Color.DARK_GRAY, new MyIcon(), "A"}};

        JFrame frame = new JFrame("Complex Renderer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ListCellRenderer renderer = new JComboBox_Cell_Renderer();
        JComboBox comboBox = new JComboBox(elements);
        comboBox.setRenderer(renderer);
        frame.add(comboBox, BorderLayout.NORTH);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
