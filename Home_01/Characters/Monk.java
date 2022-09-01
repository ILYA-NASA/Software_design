package Home_01.Characters;

import Home_01.Abstracts.BaseHero;

public class Monk extends BaseHero {

    public Monk() {
        super.name = "Arwen Undomiel";
        super.attack = 12;
        super.protection = 7;
        super.shots = 0;
        super.damageMin = -4;
        super.damageMax = -4;
        super.health = 30;
        super.speed = 5;
        super.delivery = false;
        super.magic = true;
        super.status = false;
    }
}
