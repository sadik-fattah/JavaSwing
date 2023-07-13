import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;


public class JComboBox_SelectEvent extends JFrame {
    public JComboBox_SelectEvent() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] slist = new String[]{" الخريف "," الصيف "," الربيع "," الشتاء  "};
        JComboBox<String> seasons = new JComboBox<>(slist);

        seasons.addItemListener((ItemEvent e )->{
            Object item = e.getItem();
            if (e.getStateChange()== ItemEvent.SELECTED){
                System.out.println(item+" لقد تم الاختبار ");
            } else if (e.getStateChange()== ItemEvent.DESELECTED) {
                System.out.println(item+"  لقد تم إلغاء  الاختيار ");
            }
        });

        Container container = this.getContentPane();
        container.add(seasons,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JComboBox_SelectEvent cse = new JComboBox_SelectEvent();
        cse.setLocation(200,200);
        cse.pack();
        cse.setVisible(true);
    }
}
