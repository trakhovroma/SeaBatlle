package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by trakhov-pc on 19.05.17.
 */
public class FieldFrame extends JFrame{
    public static final int SCALE = 2;
    public static final int SIZE_OF_BUTTONS_AND_LABELS = 25;
    public static final int NUMBER_OF_BUTTONS = 100;
    public static ImageIcon seaIcon = new ImageIcon("/home/trakhov-pc/IdeaProjects/SeaBattle/images/sea24.png");
    public static ImageIcon shipIcon = new ImageIcon("/home/trakhov-pc/IdeaProjects/SeaBattle/images/ship48.png");

    private List<JButton> Buttons;

    public FieldFrame(){

        Dimension dimension=new Dimension(SIZE_OF_BUTTONS_AND_LABELS,SIZE_OF_BUTTONS_AND_LABELS);
        Buttons = new ArrayList<JButton>();
        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {

            JButton btn = new JButton();
            Buttons.add(btn);
            Buttons.get(i).setPreferredSize(dimension);
        }

        JLabel aLabel=new JLabel("a",SwingConstants.CENTER);
        JLabel bLabel=new JLabel("b",SwingConstants.CENTER);
        JLabel cLabel=new JLabel("c",SwingConstants.CENTER);
        JLabel dLabel=new JLabel("c",SwingConstants.CENTER);
        JLabel eLabel=new JLabel("e",SwingConstants.CENTER);
        JLabel fLabel=new JLabel("f",SwingConstants.CENTER);
        JLabel gLabel=new JLabel("g",SwingConstants.CENTER);
        JLabel hLabel=new JLabel("h",SwingConstants.CENTER);
        JLabel iLabel=new JLabel("i",SwingConstants.CENTER);
        JLabel jLabel=new JLabel("j",SwingConstants.CENTER);

        JLabel emptyLabel = new JLabel("", SwingConstants.CENTER);

        JLabel oneLabel=new JLabel("1",SwingConstants.CENTER);
        JLabel twoLabel=new JLabel("2",SwingConstants.CENTER);
        JLabel threeLabel=new JLabel("3",SwingConstants.CENTER);
        JLabel fourLabel=new JLabel("4",SwingConstants.CENTER);
        JLabel fiveLabel=new JLabel("5",SwingConstants.CENTER);
        JLabel sixLabel=new JLabel("6",SwingConstants.CENTER);
        JLabel sevenLabel=new JLabel("7",SwingConstants.CENTER);
        JLabel eightLabel=new JLabel("8",SwingConstants.CENTER);
        JLabel nineLabel=new JLabel("9",SwingConstants.CENTER);
        JLabel tenLabel=new JLabel("10",SwingConstants.CENTER);

        emptyLabel.setPreferredSize(dimension);

        aLabel.setPreferredSize(dimension);
        bLabel.setPreferredSize(dimension);
        cLabel.setPreferredSize(dimension);
        dLabel.setPreferredSize(dimension);
        eLabel.setPreferredSize(dimension);
        fLabel.setPreferredSize(dimension);
        gLabel.setPreferredSize(dimension);
        hLabel.setPreferredSize(dimension);
        iLabel.setPreferredSize(dimension);
        jLabel.setPreferredSize(dimension);

        oneLabel.setPreferredSize(dimension);
        twoLabel.setPreferredSize(dimension);
        threeLabel.setPreferredSize(dimension);
        fourLabel.setPreferredSize(dimension);
        fiveLabel.setPreferredSize(dimension);
        sixLabel.setPreferredSize(dimension);
        sevenLabel.setPreferredSize(dimension);
        eightLabel.setPreferredSize(dimension);
        nineLabel.setPreferredSize(dimension);
        tenLabel.setPreferredSize(dimension);

        //Panels
        JPanel leftPanel=new JPanel();
        leftPanel.setPreferredSize(new Dimension(11*SCALE*SIZE_OF_BUTTONS_AND_LABELS,11*SCALE*SIZE_OF_BUTTONS_AND_LABELS));
        leftPanel.setLayout(new GridLayout(11,11));

        //Add all buttons and labels at the panels
        //Left panel

        //1th row
        leftPanel.add(emptyLabel);//1
        leftPanel.add(oneLabel);//2
        leftPanel.add(twoLabel);//3
        leftPanel.add(threeLabel);//4
        leftPanel.add(fourLabel);//5
        leftPanel.add(fiveLabel);//6
        leftPanel.add(sixLabel);//7
        leftPanel.add(sevenLabel);//8
        leftPanel.add(eightLabel);//9
        leftPanel.add(nineLabel);//10
        leftPanel.add(tenLabel);//11

        //2th row
        leftPanel.add(aLabel);
        for (int i=0; i<10; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //3th row
        leftPanel.add(bLabel);
        for (int i=10; i<20; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //4th row
        leftPanel.add(cLabel);
        for (int i=20; i<30; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //5th row
        leftPanel.add(dLabel);
        for (int i=30; i<40; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //6th row
        leftPanel.add(eLabel);
        for (int i=40; i<50; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //7th row
        leftPanel.add(fLabel);
        for (int i=50; i<60; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //8th row
        leftPanel.add(gLabel);
        for (int i=60; i<70; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //9th row
        leftPanel.add(hLabel);
        for (int i=70; i<80; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //10th row
        leftPanel.add(iLabel);
        for (int i=80; i<90; i++) {
            leftPanel.add(Buttons.get(i));
        }

        //11th row
        leftPanel.add(jLabel);
        for (int i=90; i<100; i++) {
            leftPanel.add(Buttons.get(i));
        }

        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.getContentPane().add(leftPanel);
        this.setSize(11*SCALE*SIZE_OF_BUTTONS_AND_LABELS,11*SCALE*SIZE_OF_BUTTONS_AND_LABELS);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
    }

    public List<JButton> getButtons() {
        return Buttons;
    }
    public void setEnabledAllButtons(boolean condition) {
        for (int i=0; i<Buttons.size();i++){
            Buttons.get(i).setEnabled(condition);
        }
    }

}
