package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class YesOrNo implements ActionListener {

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

        yesButton.setText("Sim");
        yesButton.setSize(150,100);
        yesButton.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        yesButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setForeground(Color.BLUE);
        yesButton.addActionListener(this);

        noButton.setText("Não");
        noButton.setSize(150,100);
        noButton.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        noButton.setBackground(Color.LIGHT_GRAY);
        noButton.setForeground(Color.BLUE);
        noButton.addActionListener(this);

        buttonPanel.setBackground(Color.DARK_GRAY);
        buttonPanel.setBounds(0,100,950,500);

        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        messagePanel.add(message);
        frame.add(messagePanel,BorderLayout.NORTH);
        frame.add(buttonPanel);
    }

    public void iKnewIt() {
        JOptionPane.showMessageDialog(null,"Eu sabia que você era mano... lá ele.");
        exit();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == noButton) {
            int x = random.nextInt(950 - noButton.getWidth());
            int y = random.nextInt(500 - noButton.getHeight());
            noButton.setBounds(x,y,noButton.getWidth(),noButton.getHeight());
        } else iKnewIt();
    }

    public void exit() {
        System.exit(0);
    }
}
