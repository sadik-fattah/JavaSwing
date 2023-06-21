import javax.swing.*;
import java.awt.*;

public class NumCardLayout {
    public static void main(String []args){
        JFrame frame = new JFrame("CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();

        JPanel btnPanel =new JPanel();
        JButton nextBtn = new JButton("next");
        btnPanel.add(nextBtn);
        container.add(btnPanel,BorderLayout.SOUTH);

        final JPanel cardPanel = new JPanel();
        final  CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        for (int i=1;i<=5;i++){
            JButton card = new JButton("card"+i);
            card.setPreferredSize(new Dimension(200,200));
            String cardName = "card" + 1;
            cardPanel.add(card, cardName);
        }
        container.add(cardPanel,BorderLayout.CENTER);
        nextBtn.addActionListener( e -> cardLayout.next(cardPanel));

        frame.pack();
        frame.setVisible(true);
    }
}
