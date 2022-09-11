package Home_01.Characters;

import java.util.List;

import Home_01.Abstracts.BaseHero;

public class Magician extends BaseHero {

    public Magician(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Gandalf");
        attack = 17;
        defence = 12;
        shoot = 0;
        damage = new Vector2(-4, -4);
        crntHealth = health = 30;
        speed = 9;
        delivery = false;
        magic = true;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {return status.equals("active");}

    public void step() {
        // int i = new Random().nextInt(super.list.size());
        // BaseHero p = super.list.get(i);
        // if (!p.status.equals("Die")){
        //     p.crntHealth -= damage.x;
        //     if (p.crntHealth >= p.health) {
        //         p.crntHealth = p.health;
        //     }
        // }
    }
}
