import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CJFormattedTextField  {

    public static void main(String[] args){
        JFrame f = new JFrame("Jformatted textfield");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = f.getContentPane();

        JFormattedTextField formattedTextField =new JFormattedTextField()  ;
        formattedTextField.setValue(new Date());

        formattedTextField.setSize(200,20);
        container.add(formattedTextField,BorderLayout.NORTH);

        f.pack();
        f.setVisible(true);
    }
}
