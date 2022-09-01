package Home_01.Characters;

import Home_01.Abstracts.BaseHero;

public class Magician extends BaseHero {

    public Magician() {
        super.name = "Gandalf the Grey";
        super.attack = 17;
        super.protection = 12;
        super.shots = 0;
        super.damageMin = -5;
        super.damageMax = -5;
        super.health = 30;
        super.speed = 9;
        super.delivery = false;
        super.magic = true;
        super.status = false;
    }
}
