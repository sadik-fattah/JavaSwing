import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JTable_Model_Selected extends JPanel {
    private boolean DEBUG = false;
    private boolean ALLOW_COLUMN_SELECTION = false;
    private boolean ALLOW_ROW_SELECTION = true;

    public JTable_Model_Selected() {
        super(new GridLayout(1, 0));
        final String[] columnNames = { "First & Last Name", "Programing language", "Idea", "# of Years", "passed" };

        final Object[][] data = {
                { "Mary Campione", "java", "netbens", new Integer(5), new Boolean(false) },
                { "Alison Huml", "csharp", "vsstudio", new Integer(30), new Boolean(true) },
                { "Kathy Walrath", "basic", "vsStudio", new Integer(9), new Boolean(false) },
                { "Sharon Zakhour", "php", "apache ", new Integer(20), new Boolean(true) },
                { "Philip Milne", "c/c++", "vscode", new Integer(10), new Boolean(false) } };
final JTable table = new JTable(data,columnNames);
table.setPreferredScrollableViewportSize(new Dimension(500,70));
table.setFillsViewportHeight(true);
table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

if (ALLOW_ROW_SELECTION){
    ListSelectionModel rowSh = table.getSelectionModel();
    rowSh.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting())
                return;
            ListSelectionModel lsm = (ListSelectionModel) e.getSource();
            if (lsm.isSelectionEmpty()){
                System.out.println("no  rows as selected");
            }else {
                int selectedRows  = lsm.getMinSelectionIndex();
                System.out.println("Rows" + selectedRows +"is now selected ");
            }
        }
    });
}else {
    table.setRowSelectionAllowed(false);
}
if(ALLOW_COLUMN_SELECTION){
    if (ALLOW_ROW_SELECTION){
        table.setCellSelectionEnabled(true);
    }
    table.setColumnSelectionAllowed(true);
    ListSelectionModel colsm = table.getColumnModel().getSelectionModel();
    colsm.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting())
                return;
            ListSelectionModel lsm = (ListSelectionModel) e.getSource();
            if (lsm.isSelectionEmpty()){
                System.out.println("No column ar selected");
            }else {
                int selectCol = lsm.getMinSelectionIndex();
                System.out.println("column" + selectCol + "is now selected");
            }
        }
    });
}

if (DEBUG){
    table.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            printDebugData(table);
        }
    });
}
JScrollPane scrollPane = new JScrollPane(table);
add(scrollPane);
    }

    private void printDebugData(JTable table) {
int numRows = table.getRowCount();
int numCols = table.getColumnCount();
javax.swing.table.TableModel model =table.getModel();
System.out.println("Value of data:");

for (int i =0;i<numRows;i++){
    System.out.println(" row"+i+":");
    for (int j = 0;j<numCols;j++){
        System.out.println(" "+model.getValueAt(i,j));
    }
    System.out.println();
}
        System.out.println("-----------------------------------");
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple Table Selection ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable_Model_Selected newContentPane = new JTable_Model_Selected();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.setSize(600,300);
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