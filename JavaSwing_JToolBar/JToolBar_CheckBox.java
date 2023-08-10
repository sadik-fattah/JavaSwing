import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolBar_CheckBox extends JFrame {
    public static void main(String[] args) {
        JToolBar_CheckBox that = new JToolBar_CheckBox();
        that.setVisible(true);
    }

    public JToolBar_CheckBox() {
        setSize(450, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       getContentPane().add(new ToolbarPanel(),BorderLayout.SOUTH);
    }
}
class ToolbarPanel extends  JPanel{
    public ToolbarPanel(){
        setLayout(new BorderLayout());
        JToolBar toolBar = new JToolBar();
        for (int i = 1; i < 4;i++){
            JCheckBox check = new JCheckBox("CheckBox Number :" + i);
            toolBar.add(check);
            check.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JCheckBox source = (JCheckBox) (actionEvent.getSource());
                    System.out.println("Toolbar" + source.getText());
                }
            });
        }
        add(toolBar,BorderLayout.SOUTH);
    }
}
