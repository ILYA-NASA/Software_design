package Home_01.Characters;

import Home_01.Abstracts.BaseHero;

public class Spearman extends BaseHero {
    public Spearman() {
        super.name = "Gimli Dwarf";
        super.attack = 4;
        super.protection = 5;
        super.shots = 0;
        super.damageMin = 1;
        super.damageMax = 3;
        super.health = 10;
        super.speed = 4;
        super.delivery = false;
        super.magic = false;
        super.status = false;
    }
}
