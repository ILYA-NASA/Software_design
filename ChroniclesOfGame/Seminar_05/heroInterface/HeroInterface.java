package Seminar_05.heroInterface;

import Seminar_05.heroTypes.Vector2;

public interface HeroInterface {
    boolean status();
    void step();
    String returnCondition();
    String getName();
    Vector2 getPosition();
}