import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;


public class PopUp  extends JFrame{
public PopUp(){
    super();
    initialize();

}
private void initialize(){
    JLabel  imagelbl;
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Test Sound Clip");
    this.setSize(300, 200);
    this.setVisible(true);
    imagelbl =new JLabel("");
    ImageIcon imageIcon= new ImageIcon(new ImageIcon("pirate.jpg")
            .getImage()
            .getScaledInstance(200,100, Image.SCALE_SMOOTH));
    imagelbl.setIcon(imageIcon);
    imagelbl.setBounds(300,50,200,100);
    try {

        URL url = this.getClass().getClassLoader().getResource("Resources_navy_alarm.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

        Clip clip = AudioSystem.getClip();

        clip.open(audioIn);
        clip.start();
    } catch (UnsupportedAudioFileException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (LineUnavailableException e) {
        e.printStackTrace();
    }
    this.add(imagelbl,BorderLayout.CENTER);
}


public void showWinsows(){
    SwingUtilities.invokeLater(()->{
      //  PopUp ff = new PopUp();
      //  ff.setVisible(true);
        new PopUp().setVisible(true);
    });
}
}

