package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by trakhov-pc on 19.05.17.
 */
public class Exit {
    private JButton yes;
    private JButton no;
    private JFrame frame;

    public Exit() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setSize(150, 70);
        JLabel label = new JLabel("Are you sure?");
        Font font = new Font("Arial", Font.ITALIC, 20);
        label.setFont(font);
        yes = new JButton("Yes");
        no = new JButton("No");

        frame.add(label);
        frame.add(yes);
        frame.add(no);
        frame.setBackground(Color.BLUE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        yes.addActionListener(new CloseGame());
        no.addActionListener(new DoNothing());

        frame.setVisible(true);
    }
    private class CloseGame implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    private class DoNothing implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    }
}
