package model;

import view.Field;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by trakhov-pc on 23.05.17.
 */
public class Fight {
    private view.Field field;
    private MyShips myships;
    private Target tr;
    private Server server = null;
    private Client client = null;
    private String opponent_name;

    public static final String PROJECT_DIRECTORY = System.getProperty("user.dir");
    public static final String SHIP = PROJECT_DIRECTORY+ "/images/ship48.png";
    public static final String CROSS = PROJECT_DIRECTORY+"/images/cross48.png";
    public static final String ROUND = PROJECT_DIRECTORY +"/images/round.png";

    public static final int TARGET = 100;
    public static final int LOSE = 102;
    public static final int WIN = 101;

    public Fight(MyShips myShips, Target tr, Server server, Client client, String opponent_name){
        this.opponent_name = opponent_name;
        this.client = client;
        this.server = server;
        this.myships = myShips;
        this.tr = tr;

        field = new view.Field();
        for(int i = 0; i < 100; i++) {
            if (myships.checkShip(i)) {
                field.getLabel().get(i).setIcon(new ImageIcon(SHIP));
            }
        }
        this.field.setVisible(true);

        if(this.tr.getTarget() == 0){
            try{
                JOptionPane.showMessageDialog(field, "Your opponent turn");
                this.field.setEnabledAllButtons(true);
                int res;

                if(myships.checkShip(res = client.clientReceive())) {
                    myships.killship(res);
                    this.field.getLabel().get(res).setIcon(new ImageIcon(CROSS));
                    shotClient(TARGET);
                }
                this.field.getLabel().get(res).setIcon(new ImageIcon(ROUND));
                System.out.println("Your turn");
                this.field.setEnabledAllButtons(true);

            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (this.tr.getTarget() == 1){
            JOptionPane.showMessageDialog(field, "You go first");
        }
        field.setVisible(true);
    }

    public void shotServer(int i) throws IOException{
        if(i<100) {
            field.getButtons().get(i).setIcon(new ImageIcon(ROUND));
        }
        int result = server.serverSend(i);
        if (result == TARGET){
            hit(i);
        }
        else if(result == LOSE){
            showMes(true);
            WriteFile wf = new WriteFile(tr.getName(), opponent_name, true);
            server.serverSendLast(WIN);
            server.closeSocket();
            JOptionPane.showMessageDialog(field, "One more game?");
            field.dispose();
            model.Menu menu = new model.Menu();
            controller.Menu m = new controller.Menu(menu);
        }
        else if(result == WIN){
            showMes(false);
            WriteFile wf = new WriteFile(tr.getName(), opponent_name, false);
            server.serverSendLast(LOSE);
            server.closeSocket();
            JOptionPane.showMessageDialog(field, "One more game?");
            field.dispose();
            model.Menu menu = new model.Menu();
            controller.Menu m = new controller.Menu(menu);
        }
        else if (myships.checkShip(result)){
            if(i < 100) {
                field.getButtons().get(i).setIcon(new ImageIcon(ROUND));
            }
            if (myships.sum() > 1) {
                myships.killship(result);
                field.getLabel().get(result).setIcon(new ImageIcon(CROSS));
                shotServer(TARGET);
            }
            else if (myships.sum() == 1){
                field.getLabel().get(result).setIcon(new ImageIcon(CROSS));
                showMes(false);
                WriteFile wf = new WriteFile(tr.getName(), opponent_name, false);
                server.serverSendLast(LOSE);
                server.closeSocket();
                JOptionPane.showMessageDialog(field, "One more game?");
                field.dispose();
                model.Menu menu = new model.Menu();
                controller.Menu m = new controller.Menu(menu);
            }
        }
        else
        {
            if(i< 100) {
                field.getButtons().get(i).setIcon(new ImageIcon(ROUND));
            }
            field.getLabel().get(result).setIcon(new ImageIcon(ROUND));

            System.out.println("Your turn");
            field.setEnabledAllButtons(true);
        }
    }

    public void shotClient(int i) throws IOException{
        if(i<100) {
            field.getButtons().get(i).setIcon(new ImageIcon(ROUND));
        }
        int result = client.clientSend(i);
        if (result == TARGET){
            hit(i);
        }
        else if(result == LOSE){
            showMes(true);
            WriteFile wf = new WriteFile(tr.getName(), opponent_name, true);
            client.clientSendLast(WIN);
            client.closeSocket();
            JOptionPane.showMessageDialog(field, "One more game?");
            field.dispose();
            model.Menu menu = new model.Menu();
            controller.Menu m = new controller.Menu(menu);
        }
        else if(result == WIN){
            showMes(false);
            WriteFile wf = new WriteFile(tr.getName(), opponent_name, false);

            client.clientSendLast(LOSE);
            client.closeSocket();
            JOptionPane.showMessageDialog(field, "One more game?");
            field.dispose();
            model.Menu menu = new model.Menu();
            controller.Menu m = new controller.Menu(menu);
        }
        else if (myships.checkShip(result)){
            if(i < 100) {
                field.getButtons().get(i).setIcon(new ImageIcon(ROUND));
            }
            if (myships.sum()>1) {
                myships.killship(result);
                field.getLabel().get(result).setIcon(new ImageIcon(CROSS));
                shotClient(TARGET);
            }
            else if(myships.sum() == 1){
                field.getLabel().get(result).setIcon(new ImageIcon(CROSS));
                showMes(false);
                WriteFile wf = new WriteFile(tr.getName(), opponent_name, false);
                client.clientSendLast(LOSE);
                client.closeSocket();
                JOptionPane.showMessageDialog(field, "One more game?");
                field.dispose();
                model.Menu menu = new model.Menu();
                controller.Menu m = new controller.Menu(menu);
            }
        }
        else
        {
            if(i<100) {
                field.getButtons().get(i).setIcon(new ImageIcon(ROUND));
            }
            field.getLabel().get(result).setIcon(new ImageIcon(ROUND));
            field.setEnabledAllButtons(true);
        }
    }
    public void hit(int i){
        field.getButtons().get(i).setIcon(new ImageIcon(CROSS));
        field.setEnabledAllButtons(true);
    }

    public void showMes(boolean bool){
        if (bool == true){
            JOptionPane.showMessageDialog(field, "You win");
        }
        else{
            JOptionPane.showMessageDialog(field, "You lose");
        }
    }

    public void action(ActionEvent e, int j) {
        System.out.println("1");
        field.getButtons().get(j).setIcon(new ImageIcon(ROUND));
        field.setEnabledAllButtons(false);

        if (this.tr.getTarget() == 1) {
            try {
                shotServer(j);
            }
            catch(IOException e1){
                e1.printStackTrace();
            }
        }
        else if(this.tr.getTarget() == 0){
            try {
                shotClient(j);
            }
            catch(IOException e2){
                e2.printStackTrace();
            }
        }
    }
    public void addListener(ActionListener a, int i) {
        field.getButtons().get(i).addActionListener(a);
    }
}
