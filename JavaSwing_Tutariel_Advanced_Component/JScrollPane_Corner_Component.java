import javax.swing.*;
import java.awt.*;

public class JScrollPane_Corner_Component {
    public static void main(String args[]) {
        final Object rows[][] = { { "one", "1" }, { "two", "2" }, { "three", "3" }, { "four", "4" },

        };
        final Object headers[] = { "English", "#" };

        JFrame frame = new JFrame("Table Printing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTable table = new JTable(rows, headers);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, new JButton("..."));

        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
