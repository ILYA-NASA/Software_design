package heroTypes;

import java.util.List;

public class Crossbowman extends BaseHero {
    public Crossbowman(List<BaseHero> side, int x, int y){
        super(side);
        name = ("Crossbowman");
        attack = 8;
        defence = 3;
        shoot = 8;
        damage = new Vector2(2, 4);
        crntHeals = health = 10;
        speed = 6;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }


    public boolean status() {return status.equals("active");}
    @Override
    public void step(List<BaseHero> side) {
        boolean tmp = false;
        for (BaseHero bh: super.list) {
            if (bh.name.equals("Peasant") && bh.name.equals("stand")) {
                tmp = true;
                bh.name = "busy";
                break;
            }
        }
        Vector2 target = super.getDistance(side);
        float dd = (damage.x+damage.y)/2;
        int d = (int) Math.round(dd + (dd/10)*(5-target.y));
        side.get((int)target.x).crntHeals -= d;
        if (!tmp) shoot--;
    }
}