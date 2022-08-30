package Home_01;

public class Crossbowman {
    private static String name;
    private static int attack;
    private static int protection;
    private static int shots;
    private static int[] damage = new int[2];
    private static int health;
    private static int speed;
    private static boolean delivery;
    private static boolean magic;

    /**
     * конструктор без параметров
     */
    public Crossbowman() {
        name = "King Aragorn";
        attack = 6;
        protection = 3;
        shots = 16;
        damage[0] = 2;
        damage[1] = 3;
        health = 10;
        speed = 4;
        delivery = false;
        magic = false;
    }

    /**
     * дополнительный конструктор
     * 
     * @param name
     */
    public Crossbowman(String name) {
        this.name = name;
    }

    public static String getInfo() {
        return String.valueOf("Арбалетчик по имени " + name +
                ";\nАтакует на: " + attack +
                ";\nИмеет защиту: " + protection +
                ";\nСтреляет на: " + shots +
                ";\nНаносит урон в пределах: " + damage +
                ";\nИмеет здоровье: " + health + 
                ";\nРазвивает скорость: " + speed + 
                "\nНаличие доставки: " + delivery + 
                "\nНаличие магии: " + magic);
    }
}
