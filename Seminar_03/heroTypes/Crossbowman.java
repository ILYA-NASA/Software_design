package heroTypes;

import java.util.List;

public class Crossbowman extends BaseHero {

    public Crossbowman(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Crossbowman");
        attack = 8;
        defence = 3;
        shoot = 8;
        damage = new Vector2(2, 4);
        crntHeals = health = 10;
        speed = 6;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {return status.equals("active");}

    public void step() {

    }

}
