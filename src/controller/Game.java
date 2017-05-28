package controller;

import model.*;
import model.Fight;
import view.*;
import view.Menu;

/**
 * Created by trakhov-pc on 19.05.17.
 */

public class Game {
    public static void main(String[] args) {
        model.Menu menu = new model.Menu();
        controller.Menu m = new controller.Menu(menu);
    }
}
