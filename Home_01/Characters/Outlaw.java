package Home_01;

public class Outlaw {
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
    public Outlaw() {
        name = "Sauron Ruthless";
        attack = 8;
        protection = 3;
        shots = 0;
        damage[0] = 2;
        damage[1] = 4;
        health = 10;
        speed = 6;
        delivery = false;
        magic = false;
    }

    /**
     * дополнительный конструктор
     * 
     * @param name
     */
    public Outlaw(String name) {
        this.name = name;
    }

    /**
     * геттер приватных полей
     * 
     * @return строку с описанием персонажа
     */
    public static String getInfo() {
        return String.valueOf("Разбойник по имени " + name +
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
