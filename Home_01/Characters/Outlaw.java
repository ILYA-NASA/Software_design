package Home_01.Characters;

import java.util.List;

import Home_01.Abstracts.BaseHero;

public class Outlaw extends BaseHero {

    public Outlaw(List<BaseHero> side, int x, int y) {
        super(side);
        name = ("Sauron");
        attack = 8;
        defence = 3;
        shoot = 0;
        damage = new Vector2(8, 10);
        crntHealth = health = 10;
        speed = 6;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {
        return status.equals("active");
    }

    public void step() {

    }
}
