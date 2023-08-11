import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class JTable_Vector_RowData {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       Vector<String> rowONE = new Vector<String>();
       rowONE.addElement("Row1-Column1");// =>0
        rowONE.addElement("Row1-Column2");//=>1
        rowONE.addElement("Row1-Column3");//=>2

        Vector<String> rowTwo = new Vector<String>();
        rowTwo.addElement("Row2-Column1");// =>0
        rowTwo.addElement("Row2-Column2");//=>1
        rowTwo.addElement("Row2-Column3");//=>2

        Vector<Vector> rowData = new Vector<Vector>();
        rowData.addElement(rowONE);// =>0
        rowData.addElement(rowTwo);//=>1

        Vector<String> columnNames = new Vector<String>();
        columnNames.addElement("Column One");// =>0
        columnNames.addElement("Column Two");//=>1
        columnNames.addElement("Column Three");//=>2

        JTable table = new JTable(rowData,columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(300, 150);
        frame.setVisible(true);

    }
}
