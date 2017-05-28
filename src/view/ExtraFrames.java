package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by trakhov-pc on 19.05.17.
 */
public class ExtraFrames extends JFrame{
    JFrame frame;
    public void WaitingFrame() {
        frame = new JFrame("Waiting for your opponent");
        frame.setResizable(false);
        frame.setSize(1120, 560);
        JLabel label = new JLabel("Waiting for your opponent...");
        Font font = new Font("Arial", Font.ITALIC, 20);
        label.setFont(font);

        frame.setBackground(new Color(188, 231, 231));
        frame.add(label);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    /*public void DelWaitingFrame(){
        frame.dispose();
    }*/
/*
    public void NoServerFrame(){
        JFrame frame2 = new JFrame();
        frame2.setResizable(false);
        frame2.setSize(400, 45);
        frame2.setBackground(new Color(188, 231, 231));
        JLabel label = new JLabel("Sorry, there is no free servers :(");
        Font font = new Font("Arial", Font.ITALIC, 20);
        label.setFont(font);

        frame2.add(label);
        frame2.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    }
    public void DelNoServerFrame(){
        frame2.dispose();
    }*/
}
