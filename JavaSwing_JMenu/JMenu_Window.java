import javax.swing.*;

public class JMenu_Window extends JFrame {
    final  JMenuBar menuBar = new JMenuBar();
    public JMenu_Window(String title) {
 setTitle(title);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setJMenuBar(menuBar);
 JMenu filemenu = new JMenu("الملفات");
 JMenu elementMenu = new JMenu("العناصر");
 menuBar.add(filemenu);
 menuBar.add(elementMenu);
    }
    public static void main(String[] args) {
        JMenu_Window window = new JMenu_Window("الدرس الاول");
        window.setBounds(30, 30, 300, 300);
        window.setVisible(true);
    }
}
