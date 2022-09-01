package Home_01.Characters;

import Home_01.Abstracts.BaseHero;

public class Crossbowman extends BaseHero {

    public Crossbowman() {
        super.name = "King Aragorn";
        super.attack = 6;
        super.protection = 3;
        super.shots = 16;
        super.damageMin = 2;
        super.damageMax = 3;
        super.health = 10;
        super.speed = 4;
        super.delivery = false;
        super.magic = false;
        super.status = false;
    }
}
