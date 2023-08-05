import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.net.URLConnection;


public class Test_con_net  extends JFrame {
 JLabel label = new JLabel();
    public Test_con_net(){
setSize(200,150);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle(" التاكد من وجود  اتصال بالنت ");
try {
    URL url = new URL("http://google.com");
    URLConnection connection = url.openConnection();
    connection.connect();
    label.setText("تم الاتصال بالانترنت");
    label.setForeground(Color.GREEN);
}catch (Exception e){
    label.setText("ليس هناك  اتصال بالانترنت");
    label.setForeground(Color.RED);
}
add(label);
    }
    public static void main(String args[]){
  Test_con_net  ff = new Test_con_net();
  ff.setVisible(true);
    }



}
