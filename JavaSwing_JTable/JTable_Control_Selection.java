import javax.swing.*;

public class JTable_Control_Selection {
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(4,5);

       table.setRowSelectionAllowed(false);
       table.setColumnSelectionAllowed(false);
       table.setCellSelectionEnabled(false);

        f.add(new JScrollPane(table));
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
