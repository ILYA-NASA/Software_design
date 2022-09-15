package model;

public class Byke extends Transport{
    private final int frame;
    private final float steering;

    public Byke(Engine engine, Chassis chassis, int frame, float steering) {
        super(engine, chassis);
        this.frame = frame;
        this.steering = steering;
    }
}
