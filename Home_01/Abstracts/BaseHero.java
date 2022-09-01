package Home_01.Abstracts;

import Home_01.Interfaces.FightingActions;

public abstract class BaseHero implements FightingActions {
    
    protected String name;
    protected int attack;
    protected int protection;
    protected int shots;
    protected int damageMin;
    protected int damageMax;
    protected int health;
    protected int speed;
    protected boolean delivery;
    protected boolean magic;
    protected boolean status;

    @Override
    public int makeAttack() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int acceptDamaged() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean status() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean moved() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String condition() {
        // TODO Auto-generated method stub
        return null;
    }

    public String info() {
        return "Арбалетчик по имени " + name +
                ";\nАтакует на: " + attack +
                ";\nИмеет защиту: " + protection +
                ";\nСтреляет на: " + shots +
                ";\nНаносит урон в пределах: " + damageMin + "-" + damageMax +
                ";\nИмеет здоровье: " + health +
                ";\nРазвивает скорость: " + speed +
                "\nНаличие доставки: " + delivery +
                "\nНаличие магии: " + magic;
    }
}
