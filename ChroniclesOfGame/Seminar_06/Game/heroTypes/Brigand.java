package heroTypes;

import java.util.List;

public class Brigand extends BaseHero {
    public Brigand(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Brigand");
        attack = 8;
        defence = 3;
        shoot = 0;
        damage = new Vector2(8, 10);
        crntHeals = health = 10;
        speed = 6;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }

    @Override
    public void step(List<BaseHero> side) {
        Vector2 target = super.getDistance(side);
        if (target.y > 1.5) {
            if (side.get((int)target.x).position.x > position.x) position.x++;
            else if (side.get((int)target.x).position.x < position.x) position.x--;
            else if (side.get((int)target.x).position.y > position.y) position.y++;
            else if (side.get((int)target.x).position.y < position.y) position.y--;
        } else {
            float dd = (damage.x+damage.y)/2;
            int d = (int) Math.round(dd + (dd/10)*(5-target.y));
            side.get((int)target.x).crntHeals -= d;
        }
    }

}