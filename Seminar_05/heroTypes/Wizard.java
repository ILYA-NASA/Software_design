package Seminar_05.heroTypes;

import java.util.List;
import java.util.Random;

public class Wizard extends BaseHero {

    public Wizard(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Wizard");
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

    @Override
    public void step() {
        int i = new Random().nextInt(super.list.size());
        BaseHero p = super.list.get(i);
        if (!p.status.equals("Die")){
            p.crntHeals -= damage.x;
            if (p.crntHeals >= p.health) {
                p.crntHeals = p.health;
            }
        }
    }

}
