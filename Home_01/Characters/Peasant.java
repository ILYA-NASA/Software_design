package Home_01.Characters;

import Home_01.Abstracts.BaseHero;

public class Peasant extends BaseHero {
    public Peasant() {
        super.name = "Frodo Baggins";
        super.attack = 1;
        super.protection = 1;
        super.shots = 0;
        super.damageMin = 1;
        super.damageMax = 1;
        super.health = 1;
        super.speed = 3;
        super.delivery = true;
        super.magic = false;
        super.status = false;
    }
}
