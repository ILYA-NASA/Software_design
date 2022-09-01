package Home_01.Interfaces;

/**
 * 
 * FightingActions
 */
public interface FightingActions {
    int makeAttack();
    int acceptDamaged();
    boolean status();
    boolean moved();
    String condition();
}