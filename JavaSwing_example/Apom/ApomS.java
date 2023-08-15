import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class ApomS extends Component {

    public static void main(String[] args) {
        JButton btnfileLoad,btngetHash,btnscannfile;
        JLabel  filelabel  , resultLabel ;
        JTextField textFieldpath;

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Scanner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        filelabel = new JLabel("file hash result");
        filelabel.setBounds(10, 100, 400, 20);

        resultLabel = new JLabel("result");
        resultLabel.setBounds(10, 200, 400, 20);

        textFieldpath = new JTextField();
        textFieldpath.setBounds(40, 25, 300, 20);

        btnfileLoad = new JButton("...");
        btnfileLoad.setBounds(350, 25, 60, 20);

        btngetHash= new JButton("hash file");
        btngetHash.setBounds(300, 50, 150, 20);

        btnscannfile = new JButton("Scane");
        btnscannfile.setBounds(120, 50, 150, 20);
        btnfileLoad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {

                JFileChooser jfc = new JFileChooser();
                int userChoise = jfc.showOpenDialog(null);
                if (userChoise == JFileChooser.APPROVE_OPTION){
                    File selectedfile = jfc.getSelectedFile();
                    textFieldpath.setText(selectedfile.getPath());
                }
                if (userChoise == JFileChooser.CANCEL_OPTION)
                    textFieldpath.setText("no file selected");
            }
        });

        btngetHash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Path filePath = Path.of(textFieldpath.getText().toString());
                String checksum;
                try {
                    byte[] data = Files.readAllBytes(filePath);
                    byte[] hash = MessageDigest.getInstance("MD5").digest(data);
                    checksum = new BigInteger(1, hash).toString(16);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
                filelabel.setText(checksum);
                System.out.println(checksum);

            }
        });
        btnscannfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Scanner sc1 = new Scanner(filelabel.getText().toString());
                String word = sc1.next();
                boolean flag = false;
                int count = 0;
                try {
                    Scanner sc2 = new Scanner(new FileInputStream("infected.txt"));
                    while (sc2.hasNextLine()){
                        String line = sc2.nextLine();
                        System.out.println(line);
                        if (line.indexOf(word)!=-1){
                            flag =true;
                            count =count+1;
                        }
                    }
                    if(flag) {
                        System.out.println("File contains the specified word");
                        resultLabel.setText("file infected virus");
                        resultLabel.setForeground(Color.RED);
                        PopUp f = new PopUp();
                        f.showWinsows();
                    } else {
                        System.out.println("File does not contain the specified word");
                        resultLabel.setText("file  not infected clean");
                        resultLabel.setForeground(Color.GREEN);


                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        frame.add(btnfileLoad);
        frame.add(btngetHash);
        frame.add(btnscannfile);
        frame.add(textFieldpath);
        frame.add(resultLabel);
        frame.add(filelabel);
        frame.setSize(500, 300);
        frame.setVisible(true);

    }
}
