package src;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class YesOrNo {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel messagePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel message = new JLabel();
    JButton yesButton = new JButton();
    JButton noButton = new JButton();

    public YesOrNo() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sim ou Não?");
        frame.setSize(950,600);
        frame.setLocation(200, 90);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);

        message.setText("Tu é mano?");
        message.setBackground(Color.WHITE);
        message.setForeground(Color.WHITE);
        message.setFont(new Font(Font.SANS_SERIF,Font.BOLD,50));
        message.setHorizontalAlignment(JLabel.CENTER);

        messagePanel.setLayout(new BorderLayout());
        messagePanel.setBackground(Color.DARK_GRAY);
        messagePanel.setBounds(0,0,950,100);

        messagePanel.add(message);
        frame.add(messagePanel,BorderLayout.NORTH);
    }
}
