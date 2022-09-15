package model;

public abstract class Transport {
    protected final Engine engine;
    protected final Chassis chassis;

    public Transport(Engine engine, Chassis chassis) {
        this.engine = engine;
        this.chassis = chassis;
    }
}
