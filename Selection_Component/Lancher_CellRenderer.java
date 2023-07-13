import javax.swing.*;
import java.awt.*;


public class Lancher_CellRenderer {
    public static void main(String args[]) {
        JFrame f = new JFrame("Complex Renderer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Object element[][]={
        {new Font("Helvetica",Font.PLAIN,20),Color.RED,new MyIcon(),"A"},
        {new Font("TimeRoman",Font.BOLD,14),Color.BLUE,new MyIcon(),"B"},
        {new Font("Courier",Font.ITALIC,18),Color.GREEN,new MyIcon(),"C"},
        {new Font("Helvetica",Font.BOLD,30),Color.GRAY,new MyIcon(),"D"},
        {new Font("TimeRoman",Font.PLAIN,16),Color.PINK,new MyIcon(),"E"},
        {new Font("Courier",Font.ITALIC,8),Color.YELLOW,new MyIcon(),"F"},
        {new Font("Helvetica",Font.BOLD,20),Color.DARK_GRAY,new MyIcon(),"G"}};

ListCellRenderer renderer = new JComboBox_CellRenderer();
JComboBox comboBox = new JComboBox(element);
comboBox.setRenderer(renderer);
f.add(comboBox,BorderLayout.NORTH);


        f.setSize(300, 200);
        f.setVisible(true);
    }
}
