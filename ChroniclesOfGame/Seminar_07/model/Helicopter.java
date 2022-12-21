package model;

public class Helicopter extends Transport{
    private final float rotor_diametr;
    private final int ractical_range;
    private final int ceiling;
    private final int rate_of_climb;

    public Helicopter(Engine engine, Chassis chassis, float rotor_diametr, int ractical_range, int ceiling, int rate_of_climb) {
        super(engine, chassis);
        this.rotor_diametr = rotor_diametr;
        this.ractical_range = ractical_range;
        this.ceiling = ceiling;
        this.rate_of_climb = rate_of_climb;
    }
}
