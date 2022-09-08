package Seminar_05.heroTypes;

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
    @Override
    public void step() {
        boolean tmp = false;
        for (BaseHero bh: super.list) {
            if (bh.name.equals("Peasant")) {
                tmp = true;
                break;
            }
        }
        if (tmp) shoot++;
    }
}