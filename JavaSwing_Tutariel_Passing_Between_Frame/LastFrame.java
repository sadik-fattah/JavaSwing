import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
public class LastFrame  extends  JFrame{

    public LastFrame(){
        initialize();
    }
    private void initialize() {

        this.setTitle("Gradient Window");
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(500, 400);
        this.setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(new GridLayout(0,1));
        this.add(new TranslucentJPanel(Color.RED));
        JButton closbtn = new JButton("close");
        this.add(closbtn);
        closbtn.addActionListener(e->System.exit(0));

    }
    public static void  show(String[]args){
        SwingUtilities.invokeLater(()->{
            LastFrame lastFrame = new LastFrame();
            lastFrame.setVisible(true);
        });

    }

class TranslucentJPanel extends JPanel{
        private  int red = 240;
    private  int green = 240;
    private  int blue = 240;

    public TranslucentJPanel(Color bgColor){
        this.red = bgColor.getRed();
        this.green = bgColor.getGreen();
        this.blue = bgColor.getBlue();
    }
    @Override
    protected void paintComponent(Graphics g){
        int width = this.getWidth();
        int height = this.getHeight();
        float startPointX = 0.0f;
        float startPointY = 0.0f;
        float endPointX = width;
        float endPointY = 0.0f;

        Color startColor = new Color(red, green, blue, 255);
        Color endColor = new Color(red, green, blue, 0);
        Paint paint = new GradientPaint(startPointX, startPointY, startColor,
                endPointX, endPointY, endColor);

        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(paint);
        g2D.fillRect(0, 0, width, height);
    }
}
}
