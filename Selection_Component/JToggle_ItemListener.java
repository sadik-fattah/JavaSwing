import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class JToggle_ItemListener {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Item Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToggleButton toggleButton = new JToggleButton("Toggle Button");

        ItemListener itemListener =new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
             int state = itemEvent.getStateChange();
             if (state == itemEvent.SELECTED){
                 System.out.println("Selected");
             }else{
                 System.out.println("Deselected");
             }
            }
        };
        toggleButton.addItemListener(itemListener);
        frame.add(toggleButton, BorderLayout.NORTH);
        frame.setSize(300, 125);
        frame.setVisible(true);
    }
}
