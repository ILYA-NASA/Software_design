package Seminar_05.heroTypes;

import java.util.List;

public class Spearman extends BaseHero {

    public Spearman(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Spearman");
        attack = 4;
        defence = 5;
        shoot = 0;
        damage = new Vector2(2, 3);
        crntHeals = health = 10;
        speed = 4;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {return status.equals("active");}

}
