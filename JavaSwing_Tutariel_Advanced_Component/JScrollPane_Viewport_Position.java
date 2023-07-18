import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JscrollpaneTytepAction implements ActionListener{
    JScrollPane scrollPane;
    public  JscrollpaneTytepAction(JScrollPane scrollPane){
        if (scrollPane == null){
            throw  new IllegalArgumentException("JscrollpaneTytepAction: null JscrollPane");
        }
        this.scrollPane = scrollPane;
    }
    public void actionPerformed(ActionEvent actionEvent) {
        JScrollBar verticalScrollbar = scrollPane.getVerticalScrollBar();
        JScrollBar horisontalScrolbar = scrollPane.getHorizontalScrollBar();
        verticalScrollbar.setValue(verticalScrollbar.getMaximum());
        horisontalScrolbar.setValue(horisontalScrolbar.getMaximum());
    }
}
public class JScrollPane_Viewport_Position {

    public static void main(String args[]) {
        JFrame f = new JFrame("Tabbed Pane Sample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel label = new JLabel("label");
label.setPreferredSize(new Dimension(1000,1000));
JScrollPane jScrollPane = new JScrollPane(label);

JButton btn = new JButton("Move");
btn.addActionListener(new JscrollpaneTytepAction(jScrollPane));
f.add(btn,BorderLayout.SOUTH);
f.add(jScrollPane,BorderLayout.CENTER);
        f.setSize(400, 150);
        f.setVisible(true);
    }
}



