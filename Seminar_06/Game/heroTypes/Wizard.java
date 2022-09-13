package heroTypes;

import java.util.Comparator;
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

    @Override
    public void step(List<BaseHero> side) {
        int min = 0;
        BaseHero p = super.list.get(0);
        for (BaseHero i : super.list) {if (i.health - i.crntHeals > min && !p.status.equals("Die")) {min = 0; p=i;}}
        p.crntHeals -= damage.x;
    }

}
