package controller;

import view.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by trakhov-pc on 20.05.17.
 */
public class StartGame extends model.StartGame {

    model.StartGame startGame;

    public StartGame(model.StartGame startGame) {
        this.startGame = startGame;

        //add listeners to frame
        this.startGame.addstartGame1(new StartGameServerAction());
        this.startGame.addstartGame2(new StartGameClientAction());
        dispose();      //dispose view frame without listeners
    }

    private class StartGameServerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startGame.serverStart();
        }
    }

    private class StartGameClientAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startGame.clientStart();
        }
    }
}