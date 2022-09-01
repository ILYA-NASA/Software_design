package heroTypes;

import heroInterface.HeroInterface;

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

    protected List<BaseHero> getList() {return list;}

    protected List<BaseHero> list;

    public BaseHero(List<BaseHero> side){list = side;}

    public String returnCondition() {return name + " H:" + crntHeals + " D:" + defence + " A:" + attack + " " + status;}
}
