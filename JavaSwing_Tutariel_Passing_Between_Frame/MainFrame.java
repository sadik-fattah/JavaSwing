import javax.swing.*;

public class MainFrame  extends JFrame{


    public static void main(String[]args){


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               NextFrame nextFrame =new NextFrame();
               nextFrame.showWindow();
               LastFrame lastFrame = new LastFrame();
               lastFrame.show();

            }
        });
    }


}

