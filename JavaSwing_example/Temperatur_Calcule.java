import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperatur_Calcule extends JFrame {
     JTextField tempinput, tempoutput;
     ButtonListener buttonListener;
     JLabel inputlabel,convertlabel,outputlabel,imglabel;
     JComboBox comboBox1, comboBox2;

     public Temperatur_Calcule(){
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         Container c = getContentPane();
         c.setLayout(null);
         c.setBackground(Color.BLACK);
         setTitle("TEMPERATURE CONVERTER");
         setSize(500,300);
         setVisible(true);
         setResizable(true);


         String s1[] = {"Celsius", "Fahrenheit", "Kelvin"};
         comboBox1 = new JComboBox(s1);
         comboBox1.setBounds(200,20,90,20);
         add(comboBox1);

         String s2[] = {"Celsius", "Fahrenheit", "Kelvin"};
         comboBox2 = new JComboBox(s2);
         comboBox2.setBounds(100,90,90,20);
         add(comboBox2);


         inputlabel=new JLabel("Temperature:");
         inputlabel.setFont(new Font("arial",Font.BOLD,14));
         inputlabel.setSize(270,20);
         inputlabel.setLocation(0,20);

         convertlabel = new JLabel("Convert to: ");
         convertlabel.setFont(new Font("arial",Font.BOLD,14));
         convertlabel.setSize(270,20);
         convertlabel.setLocation(0,90);

         tempinput = new JTextField(10);
         tempinput.setSize(40,20);
         tempinput.setLocation(120,20);

         tempoutput = new JTextField(10);
         tempoutput.setSize(120,20);
         tempoutput.setLocation(90,190);

         outputlabel = new JLabel("Output:");
         outputlabel.setFont(new Font("arial",Font.BOLD,14));
         outputlabel.setSize(270,20);
         outputlabel.setLocation(0,190);


         JButton button =new JButton("Convert");
         button.setSize(80,30);
         button.setLocation(130,130);
         button.setBackground(Color.LIGHT_GRAY);
         buttonListener = new ButtonListener();
         button.addActionListener(buttonListener);

         imglabel = new JLabel("");
         ImageIcon imageIcon = new ImageIcon(new ImageIcon("images.png").getImage().getScaledInstance(200,100,Image.SCALE_SMOOTH));
       imglabel.setIcon(imageIcon);
       imglabel.setBounds(300,50,200,100);

         c.add(outputlabel);
         c.add(convertlabel);
         c.add(inputlabel);
         c.add(tempinput);
         c.add(tempoutput);
         c.add(button);
         c.add(comboBox1);
         c.add(comboBox2);
         c.add(imglabel);
         tempoutput.setEditable(false);
     }
     private class ButtonListener implements ActionListener
     {
         public void actionPerformed(ActionEvent e)
         {
             String temp = (String) comboBox1.getSelectedItem();
             String tempConvert = (String) comboBox2.getSelectedItem();

             if(temp.equals("Celsius") && tempConvert.equals("Fahrenheit")){
                 double c = Double.parseDouble(tempinput.getText());
                 double f = (double) (c*1.8+32);
                 tempoutput.setText(String.valueOf(f));
             }
             else if (temp.equals("Celsius") && tempConvert.equals("Kelvin")) {
                 double c = Double.parseDouble(tempinput.getText());
                 double k = (double) (c+273);
                 tempoutput.setText(String.valueOf(k));
             }
             else if (temp.equals("Celsius") && tempConvert.equals("Celsius")) {
                 double c = Double.parseDouble(tempinput.getText());
                 tempoutput.setText(String.valueOf(c));
             }

             if(temp.equals("Fahrenheit") && tempConvert.equals("Celsius")) {
                 double f = Double.parseDouble(tempinput.getText());
                 double c = (double)((f - 32)*5/9);
                 tempoutput.setText(String.valueOf(c));
             }
             else if(temp.equals("Fahrenheit") && tempConvert.equals("Kelvin")) {
                 double f = Double.parseDouble(tempinput.getText());
                 double k = (double)((f - 32)*5/9 + 273.15);
                 tempoutput.setText(String.valueOf(k));
             }
             else if(temp.equals("Fahrenheit") && tempConvert.equals("Fahrenheit")) {
                 double f = Double.parseDouble(tempinput.getText());
                 tempoutput.setText(String.valueOf(f));
             }

             if(temp.equals("Kelvin") && tempConvert.equals("Fahrenheit")) {
                 double k = Double.parseDouble(tempinput.getText());
                 double f = (double) ((k*(9/5))-459.67);
                 tempoutput.setText(String.valueOf(f));
             }
             else if (temp.equals("Kelvin") && tempConvert.equals("Kelvin")) {
                 double k = Double.parseDouble(tempinput.getText());
                 tempoutput.setText(String.valueOf(k));
             }
             else if (temp.equals("Kelvin") && tempConvert.equals("Celcius")) {
                 double k = Double.parseDouble(tempinput.getText());
                 double c = (double) (k-273);
                 tempoutput.setText(String.valueOf(c));
             }
         }
     }
     public static void main(String[] args)
     {
         new Temperatur_Calcule();
     }
}
