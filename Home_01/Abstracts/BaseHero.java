package Home_01.Abstracts;

import java.util.List;

import Home_01.Characters.*;
import Home_01.Interfaces.FightingActions;

public abstract class BaseHero implements FightingActions {
    protected int attack;
    protected int defence;
    protected int shoot;
    protected Vector2 damage;
    protected int health;
    protected int crntHealth;
    protected int speed;
    protected boolean delivery;
    protected boolean magic = true;
    protected String name;
    protected String status;
    protected Vector2 position;

    protected List<BaseHero> getList() {
        return list;
    }

    protected List<BaseHero> list;

    public BaseHero(List<BaseHero> side) {
        list = side;
    }

    public String returnCondition() {
        return name + " H:" + crntHealth + " D:" + defence + " A:" + attack + " " + status;
    }
}