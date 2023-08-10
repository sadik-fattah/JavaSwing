import javax.swing.*;
import java.awt.*;

public class Jtable_Selection_Modes {
    public static void main(String args[]) {

        final Object rowData[][] = { { "1", "one", "I" }, { "2", "two", "II" }, { "3", "three", "III" } };
        final String columnNames[] = { "#", "English", "Roman" };

        final JTable table = new JTable(rowData, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        JFrame frame = new JFrame("Resizing Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(scrollPane, BorderLayout.CENTER);

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        frame.setSize(300, 150);
        frame.setVisible(true);

    }
}
