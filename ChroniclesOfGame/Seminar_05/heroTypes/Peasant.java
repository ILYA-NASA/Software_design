package Seminar_05.heroTypes;

import java.util.List;

public class Peasant extends BaseHero {
    public Peasant(List<BaseHero> side, int x, int y){
        super(side);
        name = "Peasant";
        attack = 1;
        defence = 1;
        shoot = 0;
        damage = new Vector2(2, 4);
        crntHeals = health = 1;
        speed = 3;
        delivery = true;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    @Override
    public boolean status() {return status.equals("active");}
}