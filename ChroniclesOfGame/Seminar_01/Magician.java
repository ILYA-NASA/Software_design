package Seminar_01;

public class Magician {
    private static String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    /**
     * конструктор без параметров
     */
    public Magician() {
        name = "Harry Potter";
        attack = 17;
        protection = 12;
        shots = 0;
        damage[0] = -5;
        damage[1] = -5;
        health = 30;
        speed = 9;
        delivery = false;
        magic = true;
    }

    /**
     * дополнительный конструктор с параметрами ИМЯ и СКОРОСТЬ
     * @param name
     * @param speed
     */
    public Magician(String name, int speed) {
        this();
        this.name = name;
        this.speed = speed;
    }

    /**
     * дополнительный конструктор с параметром ИМЯ
     * @param name
     */
    public Magician(String name) {
        this();
        this.name = name;
    }

    static public String getName() {
        return String.format("Маг с именем: %s", name);
    }

}
