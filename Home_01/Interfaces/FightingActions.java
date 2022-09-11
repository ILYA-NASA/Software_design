package Home_01.Interfaces;

import Home_01.Characters.Vector2;

public interface FightingActions {
    boolean status();
    void step();
    String returnCondition();
    String getName();
    Vector2 getPosition();
}
