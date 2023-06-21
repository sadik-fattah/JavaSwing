import javax.swing.*;

public class launsher {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                First_Code firstCode = new First_Code();
                firstCode.show();
            }
        });
    }
}
