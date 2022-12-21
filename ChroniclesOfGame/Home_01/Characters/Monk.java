package Home_01.Characters;

import java.util.List;
import java.util.Random;

import Home_01.Abstracts.BaseHero;

public class Monk extends BaseHero {

    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        name = ("Arwen");
        attack = 12;
        defence = 7;
        shoot = 0;
        damage = new Vector2(-4, -4);
        crntHealth = health = 30;
        speed = 5;
        delivery = false;
        magic = true;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {
        return status.equals("active");
    }

    @Override
    public void step() {
        // int i = new Random().nextInt(super.list.size());
        // BaseHero p = super.list.get(i);
        // if (!p.status.equals("Die.")){
        //     super.list.get(i).crntHealth -= damage.x;
        //     if (super.list.get(i).crntHealth >= super.list.get(i).health) {
        //         super.list.get(i).crntHealth = super.list.get(i).health;
        //     }
        // }
    }
}

