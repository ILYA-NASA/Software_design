package model;

public class Car extends Transport{
    private final String drive;
    private int[] wheel_size;
    private final int wheelbase;


    public Car(Engine engine, Chassis chassis, String drive, int[] wheel_size, int wheelbase) {
        super(engine, chassis);
        this.drive = drive;
        this.wheelbase = wheelbase;
        this.wheel_size = new int[3];
        this.wheel_size = wheel_size;
    }
}
