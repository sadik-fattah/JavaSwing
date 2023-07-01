import javax.swing.*;
import java.awt.*;

public class CjTextArea {

    public static void main(String[]args){
        JFrame myFrame = new JFrame();
        JTextArea resumeTextArea = new JTextArea("Enter resume  here", 10,   50);
        JScrollPane sp  = new JScrollPane(resumeTextArea);
        Container contentPane = myFrame.getContentPane();
        contentPane.add(sp);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
