import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperatur_Calcule extends JFrame {
     JTextField teminput, temoutput;
     JLabel inputlbl, convertlbl,outputlbl,imagelbl;
     JComboBox comboBox1,comboBox2;

     ButtonListener buttonListener;
     public Temperatur_Calcule(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
          Container c = getContentPane();
          c.setLayout(null);
          c.setBackground(Color.yellow.darker());
          setTitle("temperature converter");
          setSize(500,300);
          setVisible(true);
          setResizable(true);

          String s1[] = {"Celsius","Fahrenheit","Kelvin"};
          comboBox1 = new JComboBox(s1);
          comboBox1.setBounds(200,20,90,20);
          add(comboBox1);

          String s2[] = {"Celsius","Fahrenheit","Kelvin"};
          comboBox2 = new JComboBox(s2);
          comboBox2.setBounds(100,90,90,20);
          add(comboBox2);

          inputlbl=new JLabel("الحرارة");
          inputlbl.setFont(new Font("arial",Font.BOLD,14));
          inputlbl.setSize(270,20);
          inputlbl.setLocation(0,20);

          convertlbl = new JLabel("التحويل الى :");
          convertlbl.setFont(new Font("arial",Font.BOLD,14));
          convertlbl.setSize(270,20);
          convertlbl.setLocation(0,90);

          outputlbl = new JLabel("النتيجة :");
          outputlbl.setFont(new Font("arial",Font.BOLD,14));
          outputlbl.setSize(270,20);
          outputlbl.setLocation(0,190);

          teminput = new JTextField(10);
          teminput.setSize(40,20);
          teminput.setLocation(120,20);

          temoutput = new JTextField(10);
          temoutput.setSize(120,20);
          temoutput.setLocation(90,190);

          JButton button = new JButton("تحويل");
          button.setSize(80,30);
          button.setLocation(130,130);
          button.setBackground(Color.BLUE);
          buttonListener = new ButtonListener();
          button.addActionListener(buttonListener);

          imagelbl =new JLabel("");
          ImageIcon imageIcon= new ImageIcon(new ImageIcon("images.png")
                  .getImage()
                  .getScaledInstance(200,100,Image.SCALE_SMOOTH));
          imagelbl.setIcon(imageIcon);
          imagelbl.setBounds(300,50,200,100);

          c.add(outputlbl);
         c.add(convertlbl);
         c.add(inputlbl);
         c.add(teminput);
         c.add(temoutput);
         c.add(button);
         c.add(imagelbl);
         c.add(comboBox1);
         c.add(comboBox2);
         temoutput.setEditable(false);

     }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           String temp = (String) comboBox1.getSelectedItem();
           String tempConvert = (String) comboBox2.getSelectedItem();
//"Celsius","Fahrenheit","Kelvin"

            //Celsius
            if (temp.equals("Celsius") && tempConvert.equals("Fahrenheit")){
                double c = Double.parseDouble(teminput.getText());
                double f = (double) (c*1.8+32);
                temoutput.setText(String.valueOf(f));
            } else if (temp.equals("Celsius") && tempConvert.equals("Kelvin")) {
                double c = Double.parseDouble(teminput.getText());
                double k = (double) (c+273);
                temoutput.setText(String.valueOf(k));
            } else if (temp.equals("Celsius") && tempConvert.equals("Celsius")) {
                double c = Double.parseDouble(teminput.getText());
                temoutput.setText(String.valueOf(c));
            }
//Fahrenheit
            if (temp.equals("Fahrenheit") && tempConvert.equals("Celsius")){
                double f = Double.parseDouble(teminput.getText());
                double c = (double) ((f-32)*5/9);
                temoutput.setText(String.valueOf(c));
            } else if (temp.equals("Fahrenheit") && tempConvert.equals("Kelvin")) {
                double f= Double.parseDouble(teminput.getText());
                double k = (double) ((f-32)*5/9+273.15);
                temoutput.setText(String.valueOf(k));
            } else if (temp.equals("Fahrenheit") && tempConvert.equals("Fahrenheit")) {
                double f = Double.parseDouble(teminput.getText());
                temoutput.setText(String.valueOf(f));
            }
//Kelvin
            if (temp.equals("Kelvin") && tempConvert.equals("Fahrenheit")){
                double k = Double.parseDouble(teminput.getText());
                double f = (double) ((k*(9/5))-459.67);
                temoutput.setText(String.valueOf(f));
            } else if (temp.equals("Kelvin") && tempConvert.equals("Celsius")) {
                double k = Double.parseDouble(teminput.getText());
                double c = (double) (k-273);
                temoutput.setText(String.valueOf(c));
            } else if (temp.equals("Kelvin") && tempConvert.equals("Kelvin")) {
                double k = Double.parseDouble(teminput.getText());
                temoutput.setText(String.valueOf(k));
            }

        }
    }
     public static void main(String[] args)
     {
         new Temperatur_Calcule();
     }



}
