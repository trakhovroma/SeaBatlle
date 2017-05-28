package model;

/**
 * Created by trakhov-pc on 20.05.17.
 */
public class Menu extends view.Menu {

    public void aboutAct(){
        aboutAction();
    }
    public void rulesAct(){
        rulesAction();
    }
    public void newGame(){
        getFrame().dispose();
        model.StartGame sg = new model.StartGame();
        controller.StartGame st = new controller.StartGame(sg);
    }
}
