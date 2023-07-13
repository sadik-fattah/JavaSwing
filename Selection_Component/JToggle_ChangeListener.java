import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JToggle_ChangeListener {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Change Lestener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToggleButton toggleButton = new JToggleButton("Toggle Button");

        ChangeListener changeListener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
              AbstractButton  abstractButton = (AbstractButton) changeEvent.getSource();
              ButtonModel buttonModel = abstractButton.getModel();
              boolean armed = buttonModel.isArmed();
                boolean pressed = buttonModel.isPressed();
                boolean selected =buttonModel.isSelected();

                System.out.println("Changed = "+ armed+"/"+pressed+"/"+selected);
            }
        };

        toggleButton.addChangeListener(changeListener);
        frame.add(toggleButton,BorderLayout.NORTH);

        frame.setSize(300, 125);
        frame.setVisible(true);
    }
}
