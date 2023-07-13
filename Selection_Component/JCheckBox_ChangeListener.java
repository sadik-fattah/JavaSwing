import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JCheckBox_ChangeListener {

        public static void main(String args[]) {
            JFrame f = new JFrame("ChangeListener");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JCheckBox checkBox = new JCheckBox("select me");

           ChangeListener changeListener = new ChangeListener() {
               @Override
               public void stateChanged(ChangeEvent changeEvent) {
                   AbstractButton abstractButton = (AbstractButton) changeEvent.getSource();
                   ButtonModel buttonModel = abstractButton.getModel();
                   boolean armed = buttonModel.isArmed();
                   boolean pressed = buttonModel.isPressed();
                   boolean selected = buttonModel.isSelected();

                   System.out.println("Change:"+ armed + "/"+ pressed +"/"+selected);
               }
           } ;
checkBox.addChangeListener(changeListener);
f.add(checkBox);
            f.setSize(300, 200);
            f.setVisible(true);
        }
    }
