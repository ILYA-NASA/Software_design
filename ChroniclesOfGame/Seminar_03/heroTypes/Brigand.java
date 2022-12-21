package heroTypes;

import java.util.List;

public class Brigand extends BaseHero {

    public Brigand(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Brigand");
        attack = 8;
        defence = 3;
        shoot = 0;
        damage = new Vector2(8, 10);
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
