import javax.swing.*;
import java.awt.*;

public class JToolBar_Sparator  extends JComponent {
        /**
         * Creates a new JToolbarSeparator object.
         */
        public JToolBar_Sparator() {
            setMaximumSize(new Dimension(15, Integer.MAX_VALUE));
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Dimension size = getSize();
            int pos = size.width / 2;
            g.setColor(Color.gray);
            g.drawLine(pos, 3, pos, size.height - 5);
            g.drawLine(pos, 2, pos + 1, 2);
            g.setColor(Color.white);
            g.drawLine(pos + 1, 3, pos + 1, size.height - 5);
            g.drawLine(pos, size.height - 4, pos + 1, size.height - 4);
        }
    }

