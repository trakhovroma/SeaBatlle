package model;

import view.Field;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by trakhov-pc on 23.05.17.
 */
public class ArrangeShips{

    public static final String SHIP = System.getProperty("user.dir") + "/images/ship48.png";
    private Field field;
    private JButton tb;
    private Server server = null;
    private Client client = null;
    private String opponent_name;
    private model.Target tr;

    public ArrangeShips(){
        field = new view.Field();
        tb = new JButton("Arange ships");
        field.addButton(tb);
        field.setVisible(true);
    }
    public void action(ActionEvent e, int j) {

        if (field.getCoord().get(j) == 0) {
            field.getButtons().get(j).setIcon(new ImageIcon(SHIP));
            field.setcoord(j,1);
        }
        else if(field.getCoord().get(j) == 1) {
            field.getButtons().get(j).setIcon(null);
            field.setcoord(j,0);
        }

        if(field.getCoord().get(j) == 1){
            field.getRightLAbels().get(j).setIcon(new ImageIcon(SHIP));
        }
        else if(field.getCoord().get(j) == 0){
            field.getRightLAbels().get(j).setIcon(null);
        }
        model.MyShips myShips = new model.MyShips();
        myShips.setCoordinatesOfMyShips(field.getCoord());
    }

    public void actionbutton(){
        model.MyShips myShips = new model.MyShips();
        myShips.setCoordinatesOfMyShips(field.getCoord());
        field.dispose();
        System.out.println(myShips.getCoordinatesOfMyShips());
        if(tr.getTarget()==1) {
            model.Fight fight = new model.Fight(myShips, tr, server, null, opponent_name);

            controller.Fight fight2 = new controller.Fight(fight);
        }
        else if(tr.getTarget() == 0){
            model.Fight fight = new model.Fight(myShips, tr, null, client, opponent_name);
            controller.Fight fight2 = new controller.Fight(fight);
        }
    }

    public void setOpponent_name(String opponent_name) {
        this.opponent_name = opponent_name;
    }

    public void setTR(Target tr) {
        this.tr = tr;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setServer(Server server){
        this.server = server;
    }
    public void dispose(){field.dispose();}
    public void addListener(ActionListener a, int i) {
        field.getButtons().get(i).addActionListener(a);
    }
    public void addButtonListener(ActionListener a){
        field.addButtonListener(a,tb);
    }
    public void setVisibl(){
        field.setVisible(true);
    }

}
