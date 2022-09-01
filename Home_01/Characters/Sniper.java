package Home_01.Characters;

import java.util.Base64;

import Home_01.Abstracts.BaseHero;

public class Sniper extends BaseHero {
    public Sniper() {
        super.name = "Legolas Accurate";
        super.attack = 12;
        super.protection = 10;
        super.shots = 32;
        super.damageMin = 8;
        super.damageMax = 10;
        super.health = 15;
        super.speed = 9;
        super.delivery = false;
        super.magic = false;
        super.status = false;
    }
}
