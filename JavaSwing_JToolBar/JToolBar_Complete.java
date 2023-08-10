import javax.swing.*;
import java.awt.*;

public class JToolBar_Complete {
    public static void main(final String args[]) {
        JFrame frame = new JFrame("JToolBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JToolBar toolBar = new JToolBar();
toolBar.setRollover(true);

JButton button = new JButton("Button1");
toolBar.add(button);
toolBar.addSeparator();

toolBar.add(new JButton("Button2"));
toolBar.add(new JComboBox(new String[]{"A","B","C","D"}));
Container contentPane = frame.getContentPane();
contentPane.add(toolBar,BorderLayout.NORTH);
JTextArea textArea = new JTextArea();
JScrollPane scrollPane = new JScrollPane(textArea);
contentPane.add(scrollPane,BorderLayout.CENTER);


        frame.setSize(350, 150);
        frame.setVisible(true);
    }
}
