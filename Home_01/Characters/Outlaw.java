package Home_01.Characters;

import Home_01.Abstracts.BaseHero;

public class Outlaw extends BaseHero {
    public Outlaw() {
        super.name = "Sauron Ruthless";
        super.attack = 8;
        super.protection = 3;
        super.shots = 0;
        super.damageMin = 2;
        super.damageMax = 4;
        super.health = 10;
        super.speed = 6;
        super.delivery = false;
        super.magic = false;
        super.status = false;
    }
}
