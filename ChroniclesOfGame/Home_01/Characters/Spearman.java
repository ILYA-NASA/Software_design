package Home_01.Characters;

import java.util.List;

import Home_01.Abstracts.BaseHero;

public class Spearman extends BaseHero {
   
    public Spearman(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Gimli");
        attack = 4;
        defence = 5;
        shoot = 0;
        damage = new Vector2(2, 3);
        crntHealth = health = 10;
        speed = 4;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {return status.equals("active");}

    public void step() {

    }
}
