package model;

import controller.ArrangeShips;
import view.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by trakhov-pc on 19.05.17.
 */
public class StartGame{
    private view.StartGame st;
    private Server server = null;
    private Client client = null;
    private String opponent_name;

    public StartGame(){
        st = new view.StartGame();
    }

    public void serverStart(){
        if (st.getString().equals("")) {
            st.showmessage("You have to input name");
        }
        else {
            model.Target tr = new model.Target(1,st.getString());

            try {
                server = new Server(st);
                opponent_name = server.sendName(tr.getName());

            }
            catch(IOException e){
                e.printStackTrace();
                st.showmessage("smth went wrong");
                System.exit(255);
            }
            st.dispose();
            model.ArrangeShips arrangeShips = new model.ArrangeShips();
            arrangeShips.setOpponent_name(opponent_name);
            arrangeShips.setTR(tr);
            arrangeShips.setServer(server);
            controller.ArrangeShips arrangeShips1 = new controller.ArrangeShips(arrangeShips);
        }
    }


    public void clientStart(){
        if (st.getString().equals("")) {
            st.showmessage("You have to input name");
        } else {
            model.Target tr = new model.Target(0, st.getString());

            try {
                client = new Client(st);
                opponent_name = client.sendName(tr.getName());
            }
            catch(IOException e){
               e.printStackTrace();
               st.showmessage("smth went wrong");
               System.exit(255);
            }
            st.dispose();
            model.ArrangeShips arrangeShips = new model.ArrangeShips();
            arrangeShips.setOpponent_name(opponent_name);
            arrangeShips.setTR(tr);
            arrangeShips.setClient(client);
            controller.ArrangeShips arrangeShips1 = new controller.ArrangeShips(arrangeShips);
        }
    }
    public void dispose(){ st.dispose(); }
    public void addstartGame2(ActionListener a){
        st.addstartGame2(a);
    }
    public void addstartGame1(ActionListener a){
        st.addstartGame1(a);
    }
    }
