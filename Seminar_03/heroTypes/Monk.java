package heroTypes;

import java.util.List;
import java.util.Random;

public class Monk extends BaseHero {

    public Monk(List<BaseHero> side, int x, int y) {
        super(side);
        name = ("Monk");
        attack = 12;
        defence = 7;
        shoot = 0;
        damage = new Vector2(-4, -4);
        crntHeals = health = 30;
        speed = 5;
        delivery = false;
        magic = true;
        status = "stand";
        position = new Vector2(x, y);
    }

    public boolean status() {
        return status.equals("active");
    }

    // @Override
    // public void step() {
    //     Random rnd = new Random();
    //     list.get(rnd.nextInt(list.size())).health -= damage.x;


    // }
}
