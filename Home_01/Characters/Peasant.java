package Home_01.Characters;

import java.util.List;

import Home_01.Abstracts.BaseHero;

public class Peasant extends BaseHero {
    
    public Peasant(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Frodo");
        attack = 1;
        defence = 1;
        shoot = 0;
        damage = new Vector2(2, 4);
        crntHealth = health = 1;
        speed = 3;
        delivery = true;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {return status.equals("active");}

    public void step() {

    }
}
