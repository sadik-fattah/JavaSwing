import javax.swing.*;

public class JTable_Control_Selection {
    public static void main(String[] a) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(4, 5);

        table.setRowSelectionAllowed(false);
        table.setColumnSelectionAllowed(false);
        table.setCellSelectionEnabled(false);

        frame.add(new JScrollPane(table));

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
