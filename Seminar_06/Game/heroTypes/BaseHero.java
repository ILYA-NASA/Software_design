package heroTypes;

import heroInterface.HeroInterface;
import java.util.List;

public class BaseHero implements HeroInterface{
    protected int attack;
    protected int defence;
    protected int shoot;
    protected Vector2 damage;
    protected int health;
    protected int crntHeals;
    protected int speed;
    protected boolean delivery;
    protected boolean magic = true;
    protected String name;

    public String getStatus() {return status;}

    protected String status;
    protected Vector2 position;
    protected List<BaseHero> list;
    public BaseHero(List<BaseHero> side){list = side;}
    @Override
    public String returnCondition() {
        return name +
                " H:" + crntHeals +
                " D:" + defence +
                " A:" + attack +
                " Dmg:" + (int)(Math.abs((damage.x+damage.y)/2)) +
                (shoot>0?" Shots:" + shoot:"") + " " +
                status;
    }
    @Override
    public void step(List<BaseHero> side) {}
    @Override
    public String getName() {return name;}
    @Override
    public Vector2 getPosition() {return position;}
    public Vector2 getDistance(List<BaseHero> side){
        float dist = Integer.MAX_VALUE;
        float out = 0;

        for (int i = 0; i < side.size(); i++) {
            float dX = side.get(i).position.x - position.x;
            float dY = side.get(i).position.y - position.y;
            float tD = (float) Math.sqrt(dX*dX + dY*dY);
            if (dist > tD && !side.get(i).status.equals("Die")) {
                out = i;
                dist = tD;
            }
        }
        return new Vector2(out, dist);
    }
    @Override
    public void setStatus() {
        if (!status.equals("Die")) {
            status = "stand";
            if (crntHeals < 0 ) {
                status = "Die";
                crntHeals = 0;
            }
            if (crntHeals > health) crntHeals = health;
        }}
}