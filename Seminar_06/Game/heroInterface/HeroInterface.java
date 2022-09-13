package heroInterface;

import heroTypes.BaseHero;
import heroTypes.Vector2;

import java.util.List;

public interface HeroInterface {
    void setStatus();
    void step(List<BaseHero> side);
    String returnCondition();
    String getName();
    Vector2 getPosition();
}