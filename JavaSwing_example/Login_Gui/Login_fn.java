import javax.swing.*;

public class Login_fn extends JFrame {
    private JPanel panel;
    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton submitButton;

    public Login_fn(){

    }
    public static void main(String[] args) {
        Login_fn form = new Login_fn();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setSize(500,500);
        form.pack();
        form.setVisible(true);
    }
}
