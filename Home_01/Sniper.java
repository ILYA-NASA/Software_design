package Home_01;

public class Sniper {
    // описание песонажа
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
    public Sniper() {
        name = "Legolas Accurate";
        attack = 12;
        protection = 10;
        shots = 32;
        damage[0] = 8;
        damage[1] = 10;
        health = 15;
        speed = 9;
        delivery = false;
        magic = false;
    }

    /**
     * дополнительный конструктор
     * 
     * @param name
     */
    public Sniper(String name) {
        this.name = name;
    }

    /**
     * геттер приватных полей
     * 
     * @return строку с описанием персонажа
     */
    public static String getInfo() {
        return String.valueOf("Снайпер по имени " + name +
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
