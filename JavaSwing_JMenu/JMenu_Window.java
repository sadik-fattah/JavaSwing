import javax.swing.*;

public class JMenu_Window extends JFrame {
    private JMenuBar menuBar = new JMenuBar(); // Window menu bar
    public JMenu_Window(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar); // Add the menu bar to the window
        JMenu fileMenu = new JMenu("File"); // Create File menu
        JMenu elementMenu = new JMenu("Elements"); // Create Elements menu
        menuBar.add(fileMenu); // Add the file menu
        menuBar.add(elementMenu); // Add the element menu
    }
    public static void main(String[] args) {
        JMenu_Window window = new JMenu_Window("Sketcher");
        window.setBounds(30, 30, 300, 300);
        window.setVisible(true);
    }
}
