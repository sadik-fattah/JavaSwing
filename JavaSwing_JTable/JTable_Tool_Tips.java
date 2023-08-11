import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;

public class JTable_Tool_Tips extends JPanel {
    private boolean DEBUG = false;
    protected String[] columnToolTips = {null, null,
            "The person's favorite sport to participate in",
            "The number of years the person has program language",
            "If checked, the person passed"};

    public JTable_Tool_Tips() {
        super(new GridLayout(1,0));
        JTable table = new JTable(new MyTableModel()) {
            public String getToolTipText(MouseEvent e) {
                String tip = null;
                java.awt.Point p = e.getPoint();
                int rowIndex = rowAtPoint(p);
                int colIndex = columnAtPoint(p);
                int realColumnIndex = convertColumnIndexToModel(colIndex);

                if (realColumnIndex == 2) {
                    tip = "This person's favorite sport to "
                            + "participate in is: "
                            + getValueAt(rowIndex, colIndex);
                } else if (realColumnIndex == 4) {
                    TableModel model = getModel();
                    String firstName = (String)model.getValueAt(rowIndex,0);
                    String lastName = (String)model.getValueAt(rowIndex,1);
                    Boolean veggie = (Boolean)model.getValueAt(rowIndex,4);
                    if (Boolean.TRUE.equals(veggie)) {
                        tip = firstName + " " + lastName
                                + " is a vegetarian";
                    } else {
                        tip = firstName + " " + lastName
                                + " is not a vegetarian";
                    }
                } else {
                    tip = super.getToolTipText(e);
                }
                return tip;
            }
            protected JTableHeader createDefaultTableHeader() {

    return new JTableHeader(columnModel) {
        public String getToolTipText(MouseEvent e) {
            String tip = null;
            java.awt.Point p = e.getPoint();
            int index = columnModel.getColumnIndexAtX(p.x);
            int realIndex = columnModel.getColumn(index).getModelIndex();
            return columnToolTips[realIndex];
        }
    };
}
            };

        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    class MyTableModel extends AbstractTableModel {
        final String[] columnNames = { "First & Last Name", "Programing language", "Idea", "# of Years", "passed" };
        final Object[][] data = {
                { "Mary Campione", "java", "netbens", new Integer(5), new Boolean(false) },
                { "Alison Huml", "csharp", "vsstudio", new Integer(30), new Boolean(true) },
                { "Kathy Walrath", "basic", "vsStudio", new Integer(9), new Boolean(false) },
                { "Sharon Zakhour", "php", "apache ", new Integer(20), new Boolean(true) },
                { "Philip Milne", "c/c++", "vscode", new Integer(10), new Boolean(false) } };

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public boolean isCellEditable(int row, int col) {
            if (col < 2) {
                return false;
            } else {
                return true;
            }
        }
        public void setValueAt(Object value, int row, int col) {
            if (DEBUG) {
                System.out.println("Setting value at " + row + "," + col
                        + " to " + value
                        + " (an instance of "
                        + value.getClass() + ")");
            }

            data[row][col] = value;
            fireTableCellUpdated(row, col);

            if (DEBUG) {
                System.out.println("New value of data:");
                printDebugData();
            }
        }

        private void printDebugData() {
            int numRows = getRowCount();
            int numCols = getColumnCount();

            for (int i=0; i < numRows; i++) {
                System.out.print("    row " + i + ":");
                for (int j=0; j < numCols; j++) {
                    System.out.print("  " + data[i][j]);
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }
    }
    private static void createAndShowGUI() {

        JFrame frame = new JFrame("TableToolTipsDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new JTable_Tool_Tips();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}