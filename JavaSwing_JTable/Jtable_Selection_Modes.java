import javax.swing.*;
import java.awt.*;


public class Jtable_Selection_Modes {
    public static void main(String args[]) {
        final Object rowData[][]={{"1","one","I"},{"2","Two","II"},{"3","three","III"}};
        final String columNumber[] = {"#" ,"English","Roman"};
        final JTable table =new JTable(rowData,columNumber);
        JScrollPane scrollPane = new JScrollPane(table);
        JFrame f = new JFrame("demo Table");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(scrollPane, BorderLayout.CENTER);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        f.setSize(300, 150);
        f.setVisible(true);

    }
}
