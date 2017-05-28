package model;

import java.util.List;

/**
 * Created by trakhov-pc on 19.05.17.
 */
public class MyShips {

    private List<Integer> coordinatesOfMyShips;

    //empty constructor
    public MyShips(){}

    //getter
    public List<Integer> getCoordinatesOfMyShips(){
        return coordinatesOfMyShips;
    }

    //set all coordinates of my ships
    public void setCoordinatesOfMyShips(List<Integer> c){
        coordinatesOfMyShips = c;
    }

    //destroy one ship
    public void killship(int i){
        coordinatesOfMyShips.set(i,0);
    }

    //check if there is a ship or not
    public boolean checkShip(int coord){
        if (coordinatesOfMyShips.get(coord) == 0){
            return false;
        }
        else return true;
    }
    //return the number of undamaged ships

    public int sum(){
        int m = 0;
        for (int i = 0; i<coordinatesOfMyShips.size();i++){
            m += coordinatesOfMyShips.get(i);
        }
        return m;
    }
}
