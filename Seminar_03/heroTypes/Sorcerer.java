package heroTypes;

import java.util.List;

public class Sorcerer extends BaseHero {

    public Sorcerer(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Sorcerer");
        attack = 17;
        defence = 12;
        shoot = 0;
        damage = new Vector2(-4, -4);
        crntHeals = health = 30;
        speed = 9;
        delivery = false;
        magic = true;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {return status.equals("active");}

    public void step() {

    }
}
