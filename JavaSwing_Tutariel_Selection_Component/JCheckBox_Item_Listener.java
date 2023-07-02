import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBox_Item_Listener {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Iconizing CheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox aCheckBox4 = new JCheckBox("Stuffed Crust");

        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {
                AbstractButton abstractButton = (AbstractButton)itemEvent.getSource();
                Color foreground = abstractButton.getForeground();
                Color background = abstractButton.getBackground();
                int state = itemEvent.getStateChange();
                if (state == ItemEvent.SELECTED) {
                    abstractButton.setForeground(background);
                    abstractButton.setBackground(foreground);
                }
            }
        };
        aCheckBox4.addItemListener(itemListener);
        frame.add(aCheckBox4);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
