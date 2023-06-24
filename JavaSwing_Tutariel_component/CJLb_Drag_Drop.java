import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CJLb_Drag_Drop {
    public static void main(String[] argv) throws Exception {
        JLabel label = new JLabel("Label Text");

        final String propertyName = "text";
        label.setTransferHandler(new TransferHandler(propertyName));

        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                JComponent comp = (JComponent) evt.getSource();
                TransferHandler th = comp.getTransferHandler();

                th.exportAsDrag(comp, evt, TransferHandler.COPY);
            }
        });
    }
}
