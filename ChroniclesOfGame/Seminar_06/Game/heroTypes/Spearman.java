package heroTypes;

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

    @Override
    public void step(List<BaseHero> side) {
        if (status.equals("Die")) return;
        Vector2 target = super.getDistance(side);
        if (target.y > 1) {
            if (side.get((int)target.x).position.y > position.y) position.y++;
            else if (side.get((int)target.x).position.y < position.y) position.y--;
            else if (side.get((int)target.x).position.x > position.x) position.x++;
            else if (side.get((int)target.x).position.x < position.x) position.x--;
        } else {
            float dd = (damage.x+damage.y)/2;
            int d = (int) Math.round(dd + (dd/10)*(5-target.y));
            side.get((int)target.x).crntHeals -= d;
        }
    }

}
