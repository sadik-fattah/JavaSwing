import javax.swing.*;
import java.awt.*;
/*
public class JScrollPane_Headers_and_Corners {
    public static void main(String[] args) {
       JFrame f = new JFrame();
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.add(new JScrollPaneDemo());
        f.setSize(500, 500);
        f.setVisible(true);
    }

    static class JScrollPaneDemo extends JPanel {

        public void init() {
            try {
                SwingUtilities.invokeAndWait(new Runnable() {
                    public void run() {
                        makeGUI();
                    }
                });
            } catch (Exception exc) {
                System.out.println("Can't create because of " + exc);
            }
        }

        private void makeGUI() {

            setLayout(new BorderLayout());

            JPanel jp = new JPanel();
            jp.setLayout(new GridLayout(20, 20));
            int b = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    jp.add(new JButton("Button " + b));
                    ++b;
                }
            }

            int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
            int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
            JScrollPane jsp = new JScrollPane(jp, v, h);

            add(jsp, BorderLayout.CENTER);
        }
    }
}
*/