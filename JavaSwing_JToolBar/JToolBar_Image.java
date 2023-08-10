import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolBar_Image  {

    public JToolBar_Image() {
        ImageIcon saveicon = new ImageIcon(new ImageIcon("save.png").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        ImageIcon pasticon = new ImageIcon(new ImageIcon("paste.png").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        ImageIcon openicon = new ImageIcon(new ImageIcon("open.png").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        ImageIcon newicon = new ImageIcon(new ImageIcon("new.png").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        ImageIcon copyicon = new ImageIcon(new ImageIcon("copy.png").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
        ImageIcon cuticon = new ImageIcon(new ImageIcon("cut.png").getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));

        Action openAction = new AbstractAction("Open" ,openicon) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Open File");
            }
        };
        Action saveAction = new AbstractAction("save" ,saveicon) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Save File");
            }
        };
        Action newAction = new AbstractAction("new" ,newicon) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("New File");
            }
        };
        Action copyAction = new AbstractAction("copy" ,copyicon) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Copy File");
            }
        };
        Action cutAction = new AbstractAction("cut" ,cuticon) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Cut File");
            }
        };
        Action pastAction = new AbstractAction("past" ,pasticon) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("past File");
            }
        };

        JMenuItem openMenuItem = new JMenuItem(openAction);
        JMenuItem saveMenuItem = new JMenuItem(saveAction);
        JMenuItem newMenuItem = new JMenuItem(newAction);
        JMenuItem copyMenuItem = new JMenuItem(copyAction);
        JMenuItem cutMenuItem = new JMenuItem(cutAction);
        JMenuItem pastMenuItem = new JMenuItem(pastAction);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(newMenuItem);
        fileMenu.add(copyMenuItem);
        fileMenu.add(cutMenuItem);
        fileMenu.add(pastMenuItem);

        menuBar.add(fileMenu);

        JToolBar toolBar = new JToolBar();
        toolBar.add(Box.createHorizontalGlue());
        toolBar.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        toolBar.add(newAction);
        toolBar.add(openAction);
        toolBar.add(saveAction);
        toolBar.add(copyAction);
        toolBar.add(cutAction);
        toolBar.add(pastAction);

        JFrame frame = new JFrame("Toolbar and Menu Test");
        frame.setJMenuBar(menuBar);
        frame.add(toolBar, BorderLayout.PAGE_START);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JToolBar_Image();
            }
        });
    }


}