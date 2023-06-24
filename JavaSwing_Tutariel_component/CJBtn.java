import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class CJBtn {
    public static void main(String args[]) {
        JFrame frame = new JFrame("DefaultButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();


        Icon warnIcon = new ImageIcon("testing.gif");
        JButton btnMnemonic = new JButton("Mnemonic");
        JButton btnhtml = new JButton("<html><body>line <br/>line2</body><html>");

        container.add(btnMnemonic,BorderLayout.WEST);
        container.add(btnhtml,BorderLayout.EAST);
        container.add(new JButton(warnIcon),BorderLayout.CENTER);

        btnMnemonic.setMnemonic(KeyEvent.VK_B);
        btnhtml.putClientProperty("html.disable",Boolean.TRUE);




        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
