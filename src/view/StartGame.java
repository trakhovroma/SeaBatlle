package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by trakhov-pc on 19.05.17.
 */
public class StartGame extends JFrame {

    private JButton startgame1;     //start as Server
    private JButton startgame2;     //start as Client
    private JTextField textField;   //textfield with your name
    private JFrame frame;
    private JTextField txt;         //for ip
    private JTextField txt2;        // for port

    public StartGame() {
        frame = new JFrame("Sea Battle");
        frame.setResizable(false);
        frame.setSize(400, 800);

        JLabel label1 = new JLabel("Enter your name");

        Dimension dimension=new Dimension(380,100);
        Dimension dim1 = new Dimension(300, 120);

        JLabel battle = new JLabel(" ");
        battle.setPreferredSize(dim1);

        txt = new JTextField();
        txt2 = new JTextField();
        textField = new JTextField();

        txt2.setPreferredSize(dimension);
        txt2.setFont(new Font("Droid Sans Mono",Font.PLAIN, 28));
        txt2.setHorizontalAlignment(JTextField.CENTER);

        txt.setPreferredSize(dimension);
        txt.setFont(new Font("Droid Sans Mono",Font.PLAIN, 28));
        txt.setHorizontalAlignment(JTextField.CENTER);

        textField.setPreferredSize(dimension);
        textField.setFont(new Font("Droid Sans Mono",Font.PLAIN, 28));
        textField.setHorizontalAlignment(JTextField.CENTER);

        startgame1 = new JButton("Start Game as Server");
        startgame2 = new JButton("Start Game as Client");

        startgame1.setPreferredSize(dimension);
        startgame2.setPreferredSize(dimension);

        startgame1.setFont(new Font("Droid Sans Mono",Font.BOLD, 28));
        startgame2.setFont(new Font("Droid Sans Mono",Font.BOLD, 28));

        label1.setFont(new Font("Droid Sans Mono",Font.BOLD, 28));

        frame.add(battle);
        frame.add(label1);

        frame.add(textField, BorderLayout.CENTER);
        frame.add(startgame1);
        frame.add(startgame2);
        frame.add(txt);
        frame.add(txt2);

        frame.getContentPane().setBackground(new Color(119, 188, 226));

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        pack();
    }
    public String getString(){
        return textField.getText();
    }
    public void showmessage(String str){
        JOptionPane.showMessageDialog(frame, str);
    }
    public void dispose(){ frame.dispose(); }
    public void addstartGame1(ActionListener a){
        startgame1.addActionListener(a);
    }
    public void addstartGame2(ActionListener a){
        startgame2.addActionListener(a);
    }
    public String getTextField(){
        return textField.getText();
    }
    public JFrame getFrame(){
        return this.frame;
    }
    public String get_ip(){ return txt.getText();}
    public String getPort(){return txt2.getText();}
}
