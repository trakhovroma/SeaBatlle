package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by trakhov-pc on 19.05.17.
 */
public class Field extends FieldFrame{
    private List<Integer> coord;
    private List<JLabel> Right_labels;

    public Field() {
        Right_labels = new ArrayList<JLabel>();
        coord = new ArrayList<Integer>();

        Dimension dimension = new Dimension(SIZE_OF_BUTTONS_AND_LABELS,SIZE_OF_BUTTONS_AND_LABELS);
        for (int i=0; i<NUMBER_OF_BUTTONS; i++){
            Right_labels.add(new JLabel("",SwingConstants.CENTER));
            Right_labels.get(i).setPreferredSize(dimension);
            Right_labels.get(i).setOpaque(true);
            Right_labels.get(i).setBackground(new Color(188, 231, 231));
            Right_labels.get(i).setBorder(BorderFactory.createLineBorder(Color.black));
            coord.add(i,0);
        }
        for (int i=0; i<NUMBER_OF_BUTTONS; i++){

        }

        JLabel aLabelRightPanel=new JLabel("a",SwingConstants.CENTER);
        JLabel bLabelRightPanel=new JLabel("b",SwingConstants.CENTER);
        JLabel cLabelRightPanel=new JLabel("c",SwingConstants.CENTER);
        JLabel dLabelRightPanel=new JLabel("d",SwingConstants.CENTER);
        JLabel eLabelRightPanel=new JLabel("e",SwingConstants.CENTER);
        JLabel fLabelRightPanel=new JLabel("f",SwingConstants.CENTER);
        JLabel gLabelRightPanel=new JLabel("g",SwingConstants.CENTER);
        JLabel hLabelRightPanel=new JLabel("h",SwingConstants.CENTER);
        JLabel iLabelRightPanel=new JLabel("i",SwingConstants.CENTER);
        JLabel jLabelRightPanel=new JLabel("j",SwingConstants.CENTER);

        JLabel emptyLabelRightPanel=new JLabel();

        JLabel oneLabelRightPanel=new JLabel("1",SwingConstants.CENTER);
        JLabel twoLabelRightPanel=new JLabel("2",SwingConstants.CENTER);
        JLabel threeLabelRightPanel=new JLabel("3",SwingConstants.CENTER);
        JLabel fourLabelRightPanel=new JLabel("4",SwingConstants.CENTER);
        JLabel fiveLabelRightPanel=new JLabel("5",SwingConstants.CENTER);
        JLabel sixLabelRightPanel=new JLabel("6",SwingConstants.CENTER);
        JLabel sevenLabelRightPanel=new JLabel("7",SwingConstants.CENTER);
        JLabel eightLabelRightPanel=new JLabel("8",SwingConstants.CENTER);
        JLabel nineLabelRightPanel=new JLabel("9",SwingConstants.CENTER);
        JLabel tenLabelRightPanel=new JLabel("10",SwingConstants.CENTER);

        JPanel rightPanel=new JPanel();
        rightPanel.setPreferredSize(new Dimension(SCALE*SIZE_OF_BUTTONS_AND_LABELS*11,SCALE*SIZE_OF_BUTTONS_AND_LABELS*11));
        rightPanel.setLayout(new GridLayout(11,11));

        rightPanel.add(emptyLabelRightPanel);
        rightPanel.add(oneLabelRightPanel);
        rightPanel.add(twoLabelRightPanel);
        rightPanel.add(fourLabelRightPanel);
        rightPanel.add(threeLabelRightPanel);
        rightPanel.add(fiveLabelRightPanel);
        rightPanel.add(sixLabelRightPanel);
        rightPanel.add(sevenLabelRightPanel);
        rightPanel.add(eightLabelRightPanel);
        rightPanel.add(nineLabelRightPanel);
        rightPanel.add(tenLabelRightPanel);


        rightPanel.add(aLabelRightPanel);
        for (int i=0; i<10; i++){
            rightPanel.add(Right_labels.get(i));
        }

        rightPanel.add(bLabelRightPanel);
        for (int i=10; i<20; i++){
            rightPanel.add(Right_labels.get(i));
        }
        rightPanel.add(cLabelRightPanel);
        for (int i=20; i<30; i++){
            rightPanel.add(Right_labels.get(i));
        }
        rightPanel.add(dLabelRightPanel);
        for (int i=30; i<40; i++){
            rightPanel.add(Right_labels.get(i));
        }
        rightPanel.add(eLabelRightPanel);
        for (int i=40; i<50; i++){
            rightPanel.add(Right_labels.get(i));
        }
        rightPanel.add(fLabelRightPanel);
        for (int i=50; i<60; i++){
            rightPanel.add(Right_labels.get(i));
        }
        rightPanel.add(gLabelRightPanel);
        for (int i=60; i<70; i++){
            rightPanel.add(Right_labels.get(i));
        }
        rightPanel.add(hLabelRightPanel);
        for (int i=70; i<80; i++){
            rightPanel.add(Right_labels.get(i));
        }
        rightPanel.add(iLabelRightPanel);
        for (int i=80; i<90; i++){
            rightPanel.add(Right_labels.get(i));
        }
        rightPanel.add(jLabelRightPanel);
        for (int i=90; i<100; i++){
            rightPanel.add(Right_labels.get(i));
        }


        this.setTitle("Sea Battle");
        this.getContentPane().add(rightPanel);
        this.setSize(SIZE_OF_BUTTONS_AND_LABELS*11*SCALE,SIZE_OF_BUTTONS_AND_LABELS*11*SCALE);
        this.setResizable(false);
        pack();
    }

    public void addListener(ActionListener a, int i) {
        getButtons().get(i).addActionListener(a);
    }
    public void addButtonListener(ActionListener a, JButton button){
        button.addActionListener(a);
    }
    public void addButton(JButton button){
        this.getContentPane().add(button);
        pack();
    }
    public List<JLabel> getLabel(){return Right_labels;}
    public void addlabel(JLabel label){
        this.getContentPane().add(label);
    }
    public List<JLabel> getRightLAbels(){return Right_labels;}

    public void setcoord(int i, int value){
        coord.set(i,value); }

    public List<Integer> getCoord(){
        return coord;
    }

}
