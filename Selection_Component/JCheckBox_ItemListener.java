import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBox_ItemListener {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Item Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox = new JCheckBox("Change Background color");

ItemListener itemListener = new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
       AbstractButton abstractButton =(AbstractButton) itemEvent.getSource();
       Color foreground = abstractButton.getForeground();
       Color background = abstractButton.getBackground();
       int state = itemEvent.getStateChange();
       if (state == itemEvent.SELECTED){
           abstractButton.setForeground(background);
           abstractButton.setBackground(foreground);
       }
    }
};
        checkBox.addItemListener(itemListener);
        frame.add(checkBox);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
