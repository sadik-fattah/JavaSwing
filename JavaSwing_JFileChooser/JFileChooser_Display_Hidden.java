import javax.swing.*;

public class JFileChooser_Display_Hidden {
    public static void main(String[] a) {

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileHidingEnabled(false);

        fileChooser.showOpenDialog(null);
    }
}
