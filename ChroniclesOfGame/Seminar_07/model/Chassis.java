package model;

public class Chassis {
    private final int seats;
    private final int load_capacity;
    private final int fuel_tank;
    private final float max_speed;
    private final int wheel_formula;
    private final int driving_wheels;
    private final int length;
    private final int width;
    private final int height;

    public Chassis(int seats, int load_capacity, int fuel_tank, float max_speed, int wheel_formula, int driving_wheels, int length, int width, int height) {
        this.seats = seats;
        this.load_capacity = load_capacity;
        this.fuel_tank = fuel_tank;
        this.max_speed = max_speed;
        this.wheel_formula = wheel_formula;
        this.driving_wheels = driving_wheels;
        this.length = length;
        this.width = width;
        this.height = height;
    }

}
