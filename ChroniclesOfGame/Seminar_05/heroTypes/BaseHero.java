package Seminar_05.heroTypes;

import Seminar_05.heroInterface.HeroInterface;
import java.util.List;

public abstract class BaseHero implements HeroInterface{
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
    public void step() {}
    @Override
    public String getName() {return name;}
    @Override
    public Vector2 getPosition() {return position;}
    public Vector2 getDistance(List<BaseHero> side){
        int dist = Integer.MAX_VALUE;
        int out = 0;
        for (int i = 0; i < side.size(); i++) {
            float dX = Math.abs(side.get(i).position.x - position.x);
            float dY = Math.abs(side.get(i).position.y - position.y);
            long tD = Math.round(Math.sqrt(dX*dX + dY*dY));
            if (dist > tD) {
                out = i;
                dist = (int) tD;
            }
        }
//        for (BaseHero baseHero : side) {
//            float dX = Math.abs(baseHero.position.x - position.x);
//            float dY = Math.abs(baseHero.position.y - position.y);
//            long tD = Math.round(Math.sqrt(dX*dX + dY*dY));
//            if (dist > tD) {
//                out = side.indexOf(baseHero);
//                dist = (int) tD;
//            }
//        }
        return new Vector2(out, dist);
    }
}